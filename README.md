# JSF Jakarta webapp skeleton using primefaces

Prerequisites:

* At least Java 11
* Apache tomcat 10 (or compatible server who can utilize jakarta).
* Apache Maven (although packages to install maven are included, see [mvnw](mvnw) scripts).

Best used with IntelliJ IDEA as IDE.

## Create a docker image

Just run

```shell
mvn package
```

See [pom.xml](pom.xml) on how this is done.

A sample [docker-compose.yaml](docker/docker-compose.yaml) is included to start a container easily. The
parameter `image` there needs to be adjusted by hand when the project name / version changes.

## Used tools and licenses

For more information about swagger and additional licenses:

#### Docker

* [Official website](https://www.docker.com/)
* [FAQ about licensing and pricing](https://www.docker.com/pricing/faq/)

#### Tomcat

* [Official website](https://tomcat.apache.org/)
* [License](https://tomcat.apache.org/legal.html)