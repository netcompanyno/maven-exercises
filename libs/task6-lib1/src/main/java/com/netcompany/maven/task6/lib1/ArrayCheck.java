package com.netcompany.maven.task6.lib1;

import org.apache.commons.lang.ArrayUtils;

public class ArrayCheck {

    public static boolean isEmpty(final String[] arr) {
        return ArrayUtils.isNotEmpty(arr);
    }
}
