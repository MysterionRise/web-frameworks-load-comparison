web-frameworks-load-comparison
=======
This is repository for comparing performance of web-application built with different frameworks


Benchmark tools:
* [Apache bench](https://httpd.apache.org/docs/2.4/programs/ab.html)

Benchmark scenarios:
* [here](https://github.com/IgorPerikov/web-frameworks-load-comparison/tree/master/benchmark-scenarios)

Project contract:
* /ping - simple api route, instanly returns random integer, as described at [javadoc](https://docs.oracle.com/javase/8/docs/api/java/util/Random.html#nextInt--)


Results:
* [spring + tomcat](https://github.com/IgorPerikov/web-frameworks-load-comparison/blob/master/spring-tomcat/README.md)
* [vert.x](https://github.com/IgorPerikov/web-frameworks-load-comparison/blob/master/vertx/README.md)
* [akka](https://github.com/IgorPerikov/web-frameworks-load-comparison/blob/master/akka/README.md)
* [play](https://github.com/IgorPerikov/web-frameworks-load-comparison/blob/master/play/README.md)
* [xitrum](https://github.com/IgorPerikov/web-frameworks-load-comparison/blob/master/xitrum/README.md)
