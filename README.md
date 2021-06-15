[![<ORG_NAME>](https://circleci.com/gh/Priyanshu-git/pet-clinic.svg?style=svg)](https://app.circleci.com/pipelines/github/Priyanshu-git/pet-clinic) \
_If the above icon shows "PASSED" then the current code has been successfully build on Circle CI._

# pet-clinic

This project is a mimic of the Pet Clinic application built by
the [Spring community](https://github.com/spring-projects/spring-petclinic) using Maven. It is built on Spring MVC and
uses technologies like Spring JPA, Hibernate, Thymeleaf and Project Lombok. Test-driven approach has been followed using
JUnit 5, Mockito and [Circle CI](https://app.circleci.com/pipelines/github/Priyanshu-git/pet-clinic) for Continuous
build integrations. The application is deployed on localhost:8080 using using Apache Tomcat Server.

## Prerequisites to run the app

The following items should be installed in your system:

* Java 11 or newer (full JDK not a JRE).
* Set JAVA_HOME variable to Java 11 directory (
  see [here](https://www.baeldung.com/java-home-on-windows-7-8-10-mac-os-x-linux) for reference)
* git command line tool (https://help.github.com/articles/set-up-git)
* Your preferred IDE (not required to run from terminal)
    * Eclipse with the m2e plugin. Note: when m2e is available, there is an m2 icon in `Help -> About` dialog. If m2e is
      not there, just follow the install process here: https://www.eclipse.org/m2e/
    * [Spring Tools Suite](https://spring.io/tools) (STS)
    * IntelliJ IDEA
    * [VS Code](https://code.visualstudio.com)

## Running App locally

You can build a jar file and run it from the command line:

```
git clone https://github.com/Priyanshu-git/pet-clinic.git
cd pet-clinic
mvnw package
cd pet-clinic-web/target
java -jar pet-clinic-web-0.0.3-SNAPSHOT
```

You can then access the Application here: http://localhost:8080/

## Working with pet-clinic in your IDE

### Steps:

1) On the command line
    ```
    git clone https://github.com/Priyanshu-git/pet-clinic.git
    ```
2) Inside Eclipse or STS
    ```
    File -> Import -> Maven -> Existing Maven project
    ```

   Then either build on the command line `./mvnw generate-resources` or using the Eclipse launcher (right click on
   project and `Run As -> Maven install`) to generate the css. Run the application main method by right clicking on it
   and choosing `Run As -> Java Application`.

3) Inside IntelliJ IDEA In the main menu, choose `File -> Open` and select the pet-clinic  [pom.xml](pom.xml). Click on
   the `Open` button.

   CSS files are generated from the Maven build. You can either build them on the command
   line `./mvnw generate-resources` or right click on the `spring-pet-clinic ` project
   then `Maven -> Generates sources and Update Folders`.

   A run configuration named `pet-clinic Application` should have been created for you if you're using a recent Ultimate
   version. Otherwise, run the application by right clicking on the `pet-clinic Application` main class and
   choosing `Run 'pet-clinic Application'`.

4) Navigate to pet-clinic

   Visit [http://localhost:8080](http://localhost:8080) in your browser.