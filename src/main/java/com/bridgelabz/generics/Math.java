package com.bridgelabz.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Math<E extends Comparable, F extends Comparable, G extends Comparable> {

    E[] intArray;
    F[] doubleArray;
    G[] stringArray;

    public Math(E[] intArray, F[] doubleArray, G[] stringArray) {
        this.intArray = intArray;
        this.doubleArray = doubleArray;
        this.stringArray = stringArray;
    }

    public Object[] maxValue(E[] arrayOfInteger, F[] arrayOfDouble, G[] arrayOfString) {
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = maxValue(arrayOfInteger);
        arrayOfObject[1] = maxValue(arrayOfDouble);
        arrayOfObject[2] = maxValue(arrayOfString);
        return arrayOfObject;

    }

    public static <E extends Comparable> E maxValue(E[] array) {
        return Arrays.stream(array).max((value1, value2) -> value1.compareTo(value2)).get();
    }

}
