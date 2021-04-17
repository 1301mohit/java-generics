package com.bridgelabz.generics;

import java.util.Arrays;

public class Math {

    public static Integer maxValue(Integer[] intArray) {
        return Arrays.stream(intArray).mapToInt(value -> value).max().getAsInt();
    }

    public static Double maxValue(Double[] doubleArray) {
        return Arrays.stream(doubleArray).mapToDouble(value -> value).max().getAsDouble();
    }

}
