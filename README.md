## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

## Getting Started
To use this project, follow these steps:

1. Clone the repository to your local machine:
   
```shell
git clone https://github.com/your-username/your-project.git
```

2. Running the application locally
   
   a. Execute the `main` method in the `com.ug.paymentservicestrategy.PaymentServiceStrategyApplication` class from your IDE.
   
   b. Use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

    - Navigate to the project directory:

        ```shell
        cd <downloaded-locatoion>/payment-service-strategy
        ```
        
    - Build the project using Maven:
  
        ```shell
        mvn clean install
        ```
        
    - Run the application:

        ```shell
        mvn spring-boot:run
        ```

   To know more about the [click here](https://medium.com/@uttiyaghosh/strategy-pattern-in-spring-boot-0d6e025eef41).
