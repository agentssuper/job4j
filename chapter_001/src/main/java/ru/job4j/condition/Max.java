package ru.job4j.condition;
/**
 * @author Anton Ocheredko
 * @version $Id$
 * @since 0.1
 */
public class Max {
	/**
     * Выбирает большее число из двух.
     * @param left, right - числа.
     * @return Результат сравнения.
     */
    public int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }
}