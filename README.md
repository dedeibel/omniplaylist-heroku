# omniplaylist-heroku

Heroku webapp using omniplaylist (dilist) to confortably supply a di.fm
playlist.

A [Heroku](http://www.heroku.com) web app using Compojure.

## Usage

To start a local web server for development you can either eval the
commented out forms at the bottom of `web.clj` from your editor or
launch from the command line:

    $ lein run -m omniplaylist-heroku.web

It's live! Hit it with `curl`:

    $ curl http://omniplaylist-heroku.herokuap.com
    ["Hello" :from Heroku]

## License

Copyright © 2013 Benjamin Peter

Distributed under the Eclipse Public License, the same as Clojure.

