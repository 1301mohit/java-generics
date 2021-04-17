package com.bridgelabz.generics;

import java.util.Arrays;
import java.util.Comparator;

public class Math {

    public static <E extends Comparable> E maxValue(E[] array) {
        return Arrays.stream(array).max((value1, value2) -> value1.compareTo(value2)).get();
    }

}
