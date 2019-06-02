package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        //Сравниваем элементы массива друг с другом.
        //В цикле проходимся с первого элемента, по предпоследний.       //с которым сравним
        for (int index = 0; index < data.length - 1; index++) {
            if (data[index] != data[index + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}