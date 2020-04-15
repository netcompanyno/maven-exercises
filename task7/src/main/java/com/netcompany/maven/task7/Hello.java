package com.netcompany.maven.task7;

import java.util.ResourceBundle;

public class Hello {

    //Do not change this file
    public static void main(String... args) {
        final ResourceBundle resourceBundle = ResourceBundle.getBundle("messages");

        System.out.println("Hello, " + resourceBundle.getString("yourName") + "! You are using version " + resourceBundle.getString("version"));
    }
}
