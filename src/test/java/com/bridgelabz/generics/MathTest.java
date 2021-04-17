package com.bridgelabz.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MathTest {

    @Test
    void givenIntegerArray_ShouldReturnMaximumValue() {
        Integer[] intArray = {1, 2, 3 ,4, 5};
        Integer maxValue = Math.maxValue(intArray);
        Assertions.assertEquals(5, maxValue);
    }

    @Test
    void givenFloatArray_ShouldReturnMaximumValue() {
        Double[] doubleArray = {1.1, 2.1, 3.1, 4.1, 5.1};
        Double maxValue = Math.maxValue(doubleArray);
        Assertions.assertEquals(5.1, maxValue);
    }

    @Test
    void givenStringArray_ShouldReturnMaximumValue() {
        String[] stringArray = {"aa", "pp", "ff", "dd"};
        String maxValue = Math.maxValue(stringArray);
        Assertions.assertEquals("pp", maxValue);
    }

    @Test
    void givenIntegerDoubleAndStringArray_ShouldReturnMaximumValue() {
        Integer[] intArray = {1, 2, 3 ,4, 5};
        Double[] doubleArray = {1.1, 2.1, 3.1, 4.1, 5.1};
        String[] stringArray = {"aa", "pp", "ff", "dd"};
        Math<Integer,Double,String> math = new Math<>(intArray, doubleArray, stringArray);
        Object[] expectedValue = {5, 5.1, "pp"};
        Object[] actualValue = math.maxValue(intArray, doubleArray, stringArray);
        Assertions.assertArrayEquals(expectedValue, actualValue);
    }

}
