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

    public boolean isWin() {
        int[][] table = this.convert();
        boolean result;
        boolean result1 = false;
        boolean result2 = false;
        for ( int row = 0; row != table.length; row++) {
            //Если хоть один ряд состоит из единиц, то мы выиграли
            if (result1 != true) {
                //Проверим все строки. Если первый элемент в строке не равен 1, то пропускаем всю строку
                //поскольку пять в ряд мы на ней уже собрать не сможем.
                //Если же первый элемент в строке равен 1, то проверяем остальные.
                if (table[row][0] == 1) {
                    //Сравниваем значения ячеек. Если есть несовпадение, то переходим к следующей строке.
                    for (int y = 0; y != table.length - 1; y++) {
                        if (table[row][y] != table[row][y + 1]) {
                            result1 = false;
                            break;
                        } else {
                            //Если вдруг совпало, что все значения в ячейках строки одинаковые, то мы выиграли.
                            //И проверять дальше остальные строки не имеет смысла.
                            result1 = true;
                        }
                    }
                }
            } else {
                break;
            }
        }
        //Со столбцами суть такая же, как и со строками.
        for ( int cell = 0; cell != table.length; cell++) {
            if (result2 != true) {
                if (table[0][cell] == 1) {
                    for (int x = 0; x != table.length - 1; x++) {
                        if (table[x][cell] != table[x + 1][cell]) {
                            result2 = false;
                            break;
                        } else {
                            result2 = true;
                        }
                    }
                }
            }  else {
                break;
            }
        }
        //Сравниваем два результата: по строкам и по столбцам. Если хоть один true, то метод isWin возвращает true.
        result = result1 || result2;
        return result;
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
