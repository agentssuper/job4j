package ru.job4j.array;


public class BubbleSort {

	public int[] sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int index = 0; index < array.length - 1; index++) {
				if (array[index] > array[index + 1]) {
					int vremennaya = array[index];
					array[index] = array[index + 1];
					array[index + 1] = vremennaya;
				}
			}
		}
		return array;
	}
}