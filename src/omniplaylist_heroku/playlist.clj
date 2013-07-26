(ns omniplaylist-heroku.playlist
  (:use [clojure.tools.logging :only (info error)])
  (:require [clojure.core.memoize        :as memo]
            [name.benjaminpeter.clj-pls  :as pls]
            [omniplaylist.difm.page      :as difm-page])
  (:import  [java.io StringWriter]))

(defn download-and-build-difm-playlist []
  (let [difm-playlists (difm-page/all-streams-as-playlist)
        result (new java.io.StringWriter)]
    (pls/write! result {:files difm-playlists})
    (str result)))

(def cached-playlist (memo/ttl #(download-and-build-difm-playlist) :ttl/threshold 3600000))

(defn display-difm-playlists []
  {:status 200
   :headers {
             "Content-Type" "audio/x-scpls"
             "Content-Disposition" "attachment; filename=difm.pls"}
   :body (do
           (if (seq (memo/snapshot cached-playlist)) 
             (info "Answering request from cache")
             (info "Fetching playlist data from the web."))
           (cached-playlist))})
