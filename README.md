# new-grad-template

## Prerequisites

You will need [Java JDK] 8 or above and [Leiningen][] 2.0.0 or above installed.

[Java JDK]: http://www.oracle.com/technetwork/java/javase/downloads/index.html
[leiningen]: https://leiningen.org/

## Running Tests

To run tests, run:

    lein midje

All tests should pass, you should see this output:

```
All checks (3) succeeded.
```

## Running

To start a web server for the application, run:

    lein ring server

Your browser should open http://localhost:3000 and prints `Hello World`

## License

Copyright © 2017 Nubank
