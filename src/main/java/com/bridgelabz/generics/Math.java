package com.bridgelabz.generics;

import java.util.Arrays;
import java.util.Comparator;

public class Math {

    public static Integer maxValue(Integer[] intArray) {
        return Arrays.stream(intArray).mapToInt(value -> value).max().getAsInt();
    }

    public static Double maxValue(Double[] doubleArray) {
        return Arrays.stream(doubleArray).mapToDouble(value -> value).max().getAsDouble();
    }

    public static String maxValue(String[] stringArray) {
        return Arrays.stream(stringArray).max(Comparator.naturalOrder()).get();
    }

}
