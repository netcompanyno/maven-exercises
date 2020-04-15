package com.netcompany.maven.task6;

import com.netcompany.maven.task6.lib1.ArrayCheck;

public class Hello {

    public static void main(String... args) {
        final String[] hello = new String[] {"Hello", "world"};
        System.out.println(ArrayCheck.isEmpty(hello) ? "empty :(" : hello);
    }
}
