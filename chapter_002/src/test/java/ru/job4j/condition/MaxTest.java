package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To3Then3() {
        Max max = new Max();
        int result = max.max(1, 2, 3);
        assertThat(result, is(3));
    }
	  @Test
    public void whenMax1To10Then10() {
        Max max = new Max();
        int result = max.max(1, 2, 3, 10);
        assertThat(result, is(10));
	}
}