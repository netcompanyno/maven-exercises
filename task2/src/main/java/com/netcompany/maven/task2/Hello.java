package com.netcompany.maven.task2;


import com.google.common.collect.Lists;
import org.apache.commons.lang.StringUtils;

//Do not modify this class
public class Hello {
    public static void main(final String... args) {
        System.out.println(StringUtils.join(Lists.newArrayList("Hello,", "world!"), " "));
    }
}
