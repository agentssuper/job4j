package ru.job4j.converter;

/**
 * Конвертор валюты.
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return value / 70;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        return value / 60 ;
    }
	
	 /**
     * Конвертируем евро в рубли.
     * @param value Евро.
     * @return рубли.
     */
    public int rubleToEuro(int value) {
        return 70 * value;
    }
	
	 /**
     * Конвертируем доллары в рубли.
     * @param value Доллары.
     * @return рубли
     */
    public int rubleToDollar(int value) {
        return 60 * value;
    }
	
	
}