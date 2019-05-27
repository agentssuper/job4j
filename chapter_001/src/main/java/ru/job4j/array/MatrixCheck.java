package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int x = 0; x < data.length - 1; x++) {
            for (int y = 0; y < data.length - 1; y++) {
                if (data[x][y] == data[x+1] [y+1] && data [x][data.length - 1 - y] == data [x + 1][data.length - 1 - (y + 1)]) {
                    result = true;
                } else result = false;
            }
            }
        return result;
    }
}