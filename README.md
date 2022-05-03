# JSF Jakarta webapp skeleton using primefaces

Prerequisites:

* At least Java 11
* Apache tomcat 10 (or compatible server who can utilize jakarta).
* Apache Maven (although packages to install maven are included, see [mvnw](mvnw) scripts).

Best used with IntelliJ IDEA as IDE.

## Handling docker images

Using maven to handle docker image creation and cleanup is done by just activating the profile `docker`. This
can be activated via `-Ddocker=true` on the commandline.

Create a docker image: 

```shell
mvn package -Ddocker=true
```

Cleanup and remove the docker image:

```shell
mvn clean -Ddocker=true
```

See [pom.xml](pom.xml) on how this is done.

A sample [docker-compose.yaml](docker/docker-compose.yaml) is included to start a container easily. The
parameter `image` there needs to be adjusted by hand when the project name / version changes.

After the container has started, point your browser to `http://localhost:8080/`.

## Used tools and licenses

For more information and additional licenses:

#### Primefaces

* [Official website](https://www.primefaces.org/)
* [Licensing](https://www.primefaces.org/licenses/)
* [GitHub repositories](https://github.com/primefaces/)

#### Docker

* [Official website](https://www.docker.com/)
* [FAQ about licensing and pricing](https://www.docker.com/pricing/faq/)

#### Tomcat

* [Official website](https://tomcat.apache.org/)
* [License](https://tomcat.apache.org/legal.html)