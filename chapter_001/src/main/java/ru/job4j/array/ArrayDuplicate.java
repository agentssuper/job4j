package ru.job4j.array;

import java.util.Arrays;

public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int dublicate = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - dublicate; j++) {
                if (array[i].equals(array[j])) {
                    String vremennayaPeremennaya = array[array.length - dublicate - 1];
                    array[array.length - dublicate - 1] = array[j];
                    array[j] = vremennayaPeremennaya;
                    dublicate = dublicate + 1;
                }
            }
        }
        return Arrays.copyOf(array, array.length - dublicate);
    }
}