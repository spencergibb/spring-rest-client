Spring Rest Client is a sandbox for experimenting on a fluent/reactive web client.

## Building from Source
Spring Reactive uses a [Maven][]-based build system. In the instructions
below, `./mvnw` is invoked from the root of the source tree and serves as
a cross-platform, self-contained bootstrap mechanism for the build.

### Prerequisites

[Git][] and [JDK 8 update 20 or later][JDK8 build]

Be sure that your `JAVA_HOME` environment variable points to the `jdk1.8.0` folder
extracted from the JDK download.

### Install all spring-\* jars into your local Maven cache
`./mvnw clean install`

### Compile and test; build all jars, distribution zips, and docs
`./mvnw clean package`

## Contributing
Feel free to send us your feedback on the [issue tracker][]; [Pull requests][] are welcome.

## License
The Spring Reactive is released under version 2.0 of the [Apache License][].


[Maven]: http://maven.apache.org/
[Git]: http://help.github.com/set-up-git-redirect
[JDK8 build]: http://www.oracle.com/technetwork/java/javase/downloads
[issue tracker]: https://github.com/spencergibb/spring-rest-client/issues
[Pull requests]: http://help.github.com/send-pull-requests
[Apache License]: http://www.apache.org/licenses/LICENSE-2.0
