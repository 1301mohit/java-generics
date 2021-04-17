package com.bridgelabz.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrintArrayTest {

    PrintArray<Integer> printIntArray;
    PrintArray<Double> printDoubleArray;
    PrintArray<Character> printCharacterArray;

    @BeforeEach
    void setUp() {
        printIntArray = new PrintArray<>();
        printDoubleArray = new PrintArray<>();
        printCharacterArray = new PrintArray<>();
    }

    @Test
    public void givenIntegerArray_ShouldReturnIntegerArray() {
        Integer[] intArray = {1, 2, 3 ,4, 5};
        printIntArray.setValue(intArray);
        Assertions.assertArrayEquals(intArray, printIntArray.getValue());
    }

    @Test
    public void givenDoubleArray_ShouldReturnDoubleArray() {
        Double[] doubleArray = {1.1, 2.1, 3.1, 4.1, 5.1};
        printDoubleArray.setValue(doubleArray);
        Assertions.assertArrayEquals(doubleArray, printDoubleArray.getValue());
    }

    @Test
    void givenCharacterArray_ShouldReturnCharacterArray() {
        Character[] characterArray = {'a', 'b', 'c', 'd'};
        printCharacterArray.setValue(characterArray);
        Assertions.assertArrayEquals(characterArray, printCharacterArray.getValue());
    }

}
