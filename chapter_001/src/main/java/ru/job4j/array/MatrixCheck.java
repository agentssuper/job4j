package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int x = 0; x < data.length - 1; x++) {
             if (data[x][x] != data[x + 1] [x + 1] || data [x][data.length - 1 - x] != data [x + 1][data.length - 1 - (x + 1)]) {
                    result = false;
                    break;
                }
            }
        return result;
    }
}