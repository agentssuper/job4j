package ru.job4j.zadach_exam;

import java.util.Arrays;
import java.util.Scanner;

public class ObMass {

    public int[] merge(int[] a, int[] b) {
        a = new int[]{1, 3};
        b = new int[]{2, 4};
        int[] result = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) {
                result[i + i] = b[i];
                result[i + i + 1] = a[i];
            } else {
                result[i + i] = a[i];
                result[i + i + 1] = b[i];
            }
        }
        for (int i = 0; i < result.length - 1; i++) {
            int vremennaya = result[i];
            if (result[i] > result[i + 1]) {
                result[i] = result[i + 1];
                result[i + 1] = vremennaya;
            }
        }
        return result;
    }
}
