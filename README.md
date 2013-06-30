# omniplaylist-heroku

This is a heroku webapp using [omniplaylist (dilist)](https://github.com/dedeibel/dilist) to confortably supply a digitally imported (di.fm) playlist.

[di.fm playlist](http://omniplaylist-heroku.herokuap.com)

_(this is an unofficial app and not supported by the di.fm folks)_

## Usage

To start a local web server for development you can either eval the
commented out forms at the bottom of `web.clj` from your editor or
launch from the command line:

    $ lein run -m omniplaylist-heroku.web

It's live! Hit it with `curl`:

    $ curl http://omniplaylist-heroku.herokuap.com

## License

Copyright © 2013 Benjamin Peter

Distributed under the Eclipse Public License, the same as Clojure.

