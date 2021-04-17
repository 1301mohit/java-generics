package com.bridgelabz.generics;

import java.util.Arrays;

public class PrintArray {

    public static void toPrint(Integer[] intArray) {
        Arrays.stream(intArray).forEach(System.out::println);
    }

    public static void toPrint(Double[] doubleArray) {
        Arrays.stream(doubleArray).forEach(System.out::println);
    }

    public static void toPrint(Character[] charArray) {
        Arrays.stream(charArray).forEach(System.out::println);
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.1, 3.1, 4.1, 5.1};
        Character[] characterArray = {'a', 'b', 'c', 'd'};
        toPrint(intArray);
        toPrint(doubleArray);
        toPrint(characterArray);
    }
}