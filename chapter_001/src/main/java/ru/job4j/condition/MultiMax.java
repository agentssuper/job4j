package ru.job4j.condition;
/**
 * @author Anton Ocheredko
 * @version $Id$
 * @since 0.1
 */

public class MultiMax {
	/**
	*@max - метод вычисляющий максимальное из трех чисел. 
	*@param maxAB - максимум из первого и второго числа.
	*@param result - наибольшее из трех чисел.
	*/
	
    public int max(int first, int second, int third) {        
        int maxAB = first > second ? first : second;
		int result = maxAB > third ? maxAB : third; 
		return result;
    }
}