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
    public int max(int left, int right, int tretye) {
        return max(left, max(right, tretye));
    }
    public int max(int left, int right, int tretye, int chetvertoe) {
        return max(left, max(right, max(tretye, chetvertoe)));
    }

}