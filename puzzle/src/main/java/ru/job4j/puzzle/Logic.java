package ru.job4j.puzzle;

import ru.job4j.puzzle.firuges.Cell;
import ru.job4j.puzzle.firuges.Figure;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Logic {
    private final int size;
    private final Figure[] figures;
    private int index = 0;

    public Logic(int size) {
        this.size = size;
        this.figures = new Figure[size * size];
    }

    public void add(Figure figure) {
        this.figures[this.index++] = figure;
    }

    public boolean move(Cell source, Cell dest) {
        boolean rst = false;
        int index = this.findBy(source);
        if (index != -1) {
            Cell[] steps = this.figures[index].way(source, dest);
            if (this.isFree(steps)) {
                rst = true;
                this.figures[index] = this.figures[index].copy(dest);
            }
        }
        return rst;
    }

    public boolean isFree(Cell ... cells) {
        boolean result = cells.length > 0;
        for (Cell cell : cells) {
            if (this.findBy(cell) != -1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public void clean() {
        for (int position = 0; position != this.figures.length; position++) {
            this.figures[position] = null;
        }
        this.index = 0;
    }

    private int findBy(Cell cell) {
        int rst = -1;
        for (int index = 0; index != this.figures.length; index++) {
            if (this.figures[index] != null && this.figures[index].position().equals(cell)) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * Method isWin. Метод проверяет собрался ли ряд из белых кружочков на доске.
     * Пройдемся по элементам матрицы по диагонали.
     * Если элемент, находящийся на диагонали не равен 1, то не имеет смысла проверять ряд и строку, где этот элемент находится
     * потому что в нём всё равно хоть одно число будет не равно 1.
     * Проверяем одновременно и строку и столбец, где находится наш элемент массива, находящийся на пересечении
     * строки и столбца.
     * Проверяем слева направо (от меньшего к большему) по элементам строки и так же (от меньшего к большему, сверху вниз) по элементам столбца.
     * Если в строке или столбце есть хотя бы одно значение не равное 1, то перемноженные элементы строки
     * или столбца не будет равны 1. Если ни результат умножения элементов строки и ни результат перемножения элементов столбца
     * не равны 1, то значит в строке или столбце есть нули. В таком случае break.
     * Если не произошло break, это значит, что либо в строке либо в столбце все
     * элементы равны 1. А значит, result = true. Дальше проверять нет смысла. Мы выиграли.
     */
    public boolean isWin() {
        int[][] table = this.convert();
        boolean result = false;
        int pereX = 1;
        int pereY = 1;
        for (int x = 0; x != table.length; x++) {
            //Если результат равен true, то никаких вычислений не происходит.
            if (result != true) {
                if (table[x][x] == 1) {
                    for (int i = 0; i != table.length; i++) {
                        //Переменные pereX и pereY - это результаты перемножения элементов строки и столбца, соответственно.
                        pereX = pereX * table[i][x];
                        pereY = pereY * table[x][i];
                        if (pereX != 1 && pereY != 1) {
                            break;
                        }
                    }
                    if (pereX == 1 || pereY == 1) {
                        result = true;
                    }
                }
            }
        } return result;
    }








    public int[][] convert() {
        int[][] table = new int[this.size][this.size];
        for (int row = 0; row != table.length; row++) {
            for (int cell = 0; cell != table.length; cell++) {
                int position = this.findBy(new Cell(row, cell));
                if (position != -1 && this.figures[position].movable()) {
                    table[row][cell] = 1;
                }
            }
        }
        return table;
    }
}
