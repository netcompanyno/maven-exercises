# Task 4 - plugins

1. Configure `maven-compiler-plugin` to build the project with Java 8 (verify with `mvn clean install`)
2. Create a runnable jar by configuring the `maven-jar-plugin` (verify with `java -jar target/task4-1.0-SNAPSHOT.jar` after `mvn clean install`)
3. Create a new release using `maven-release-plugin`
    1. Configure it to *not* push changes
    2. Run with `mvn release:prepare` followed by `mvn release:perform`