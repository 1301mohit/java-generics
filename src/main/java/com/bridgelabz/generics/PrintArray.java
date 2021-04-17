package com.bridgelabz.generics;

import java.util.Arrays;

public class PrintArray<E> {

    private E[] inputArray;

    public PrintArray() { }

    public PrintArray(E[] inputArray) {
        this.inputArray = inputArray;
    }

    public void setValue(E[] inputArray) {
        this.inputArray = inputArray;
    }

    public E[] getValue() {
        return this.inputArray;
    }

    public Integer maxValue() {
        return Arrays.stream(this.inputArray).mapToInt(value -> (Integer) value).max().getAsInt();
    }
}
