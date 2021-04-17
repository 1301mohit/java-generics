package com.bridgelabz.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathTest {

    @Test
    void givenIntegerArray_ShouldReturnMaximumValue() {
        Integer[] intArray = {1, 2, 3 ,4, 5};
        Integer maxValue = Math.maxValue(intArray);
        Assertions.assertEquals(5, maxValue);
    }

}
