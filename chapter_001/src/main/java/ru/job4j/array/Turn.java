package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        //Выясним половину длинны массива
        // Нам нужно целое значение от деления длинны массива
        // потому как средний эллемент в массиве
        // не изменится при наших перестановках.
        int polovina = (int) (array.length / 2);
        for (int index = 0; index < polovina; index++) {
		int vremennaya = array [index];
		array[index] = array[array.length - 1 - index];
		array[array.length - 1 - index] = vremennaya;
        }
        return array;
    }
}