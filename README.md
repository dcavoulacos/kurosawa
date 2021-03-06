# kurosawa

The root Kurosawa library.

![Akira Kurosawa](http://i.imgur.com/Gydm4pM.jpg?1)


## What does it do?

Contains logging, [configuration](./core/README.org), error handling and other common 
utilities needed in any library or application.

## Development

You can interact with the library in the REPL by typing in Emacs:

    M-x cider-jack-in
    user> 

Initialize the components by: 

    user> (dev)
    dev> (reset)


Try out the results namespace: 

    org.purefn.kurosawa.results> (-> (attempt / 10 2)
                                     (proceed + 3)
                                     (result))
    8
    
    org.purefn.kurosawa.results> (-> (attempt / 10 0)
                                     (proceed + 3)
                                     (failure?))
    true

## Generate Docs

    $ lein docs
    $ open doc/dist/latest/api/index.html


## Deploying 

	lein release :patch
	
or similar will release to clojars.

## License

Copyright © 2018 Ladders, PureFn

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
