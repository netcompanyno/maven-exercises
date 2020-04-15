# Task 1 - Maven lifecycle

This task is meant to illustrate the Maven lifecycle.

To solve the task, run `mvn clean install` (after `cd task1`), and fix any error that is outputted. 
Repeat until the build is successful.

Note: Do not use your IDE to identify errors, and fix only one error per maven-build.

When you are done, get  further acquainted with the maven lifecycle by running the following command: `mvn help:describe -Dcmd=deploy`
This will show the various stages of the lifecycle, along with any plugin attached to each stage.

Notice how the order of stages in the lifecycle reflects the order of which you fixed the issues in this task?
