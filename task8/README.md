# Task 8 - dependency & plugin management, properties

Tasks 1-3 have a common root pom, and share some of their dependencies.

- Create a `dependencyManagement`-element in the root pom, and define all dependencies used in task 1-4 there
    - Then, remove `version` from all dependencies in task 1-3, as this will be inherited  
- Define properties for each dependency-version, and use these properties in `dependencyManagement`
- Build each of tasks 1-3 with `mvn clean install` to verify