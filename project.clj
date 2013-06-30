(defproject omniplaylist-heroku "1.0.0-SNAPSHOT"
  :description "webapp to provide a comfortable access to di.fm playlists"
  :url "http://omniplaylist-heroku.herokuapp.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 ; TODO Had to add the following three to fix missing dependencies
                 ; which should not have been necessary though - need to look into that
                 [com.fasterxml.jackson.core/jackson-core "2.2.0"]
                 [com.fasterxml.jackson.dataformat/jackson-dataformat-smile "2.1.1"]
                 [org.apache.httpcomponents/httpclient "4.2.5"]
                 [compojure "1.1.1"]
                 [ring/ring-jetty-adapter "1.1.0"]
                 [ring/ring-devel "1.1.0"]
                 [ring-basic-authentication "1.0.1"]
                 [environ "0.2.1"]
                 [com.cemerick/drawbridge "0.0.6"]
                 [org.ini4j/ini4j "0.5.2"]           ; java
                 [omniplaylist/omniplaylist "0.1.0"]]
  :min-lein-version "2.0.0"
  :plugins [[environ/environ.lein "0.2.1"]]
  :hooks [environ.leiningen.hooks]
  :repositories {"local" ~(str (.toURI (java.io.File. "repo")))}
  :profiles {:production {:env {:production true}}})
