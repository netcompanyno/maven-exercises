# Task 7 - resource filtering

By changing only [pom.xml](pom.xml), make the main-method of [Hello.java](src/main/java/com/netcompany/maven/task7/Hello.java)
print `Hello, <your name here>! You are using version 1.0-SNAPSHOT`.

First, run the main-method. Notice that it prints something like `Hello, @your.name@`.
`@your.name@` is a merge field, that can be replaced with the value of a property. Both default properties
(like `project.version`) and user-defined properties (like `your.name`) can be merged.

In order to do this, you need to enable resource filtering (merging of properties).
You might also have to define a property for merging.
