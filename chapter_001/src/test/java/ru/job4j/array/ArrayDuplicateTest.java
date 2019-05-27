package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
       ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
	   String[] array = new String[] {"Коля", "Петя", "Петя", "Настя", "Кеша", "Настя"};
	   String[] result = arrayDuplicate.remove(array);
	   String[] expect = new String[] {"Коля", "Петя", "Настя", "Кеша"};
	  
      assertThat(result, is(expect));
	  
    }
}

