package ru.job4j.calculator;

/**
 * Calculator складывает, вычитает, умножает и делит числа.
 * @author Anton Ocheredko
 */

public class Calculator {

    /**
     * Method add.
     * @param first.
     * @param second.
     * @return first plus second.
     */
    public double add(double first, double second) {
        return first + second;
    }

    /**
     * Method subtract.
     * @param first.
     * @param second.
     * @return first minus second.
     */
    public double subtract(double first, double second) {
        return first - second;
    }

    /**
     * Method multiple.
     * @param first.
     * @param second.
     * @return first multiply second.
     */
    public double multiple(double first, double second) {
        return first * second;
    }

    /**
     * Method div.
     * @param first.
     * @param second.
     * @return first divide second.
     */
    public double div(double first, double second) {
        return first / second;
    }
}