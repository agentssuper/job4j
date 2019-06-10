package ru.job4j.zadach_exam;


import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ObMassTest {
    @Test
    public void when13And24is1234() {
        ObMass obmass = new ObMass();
        int[] a = new int[]{1, 3};
        int[] b = new int[]{2, 4};
        int[] result = obmass.merge(a, b);
        int[] expect = {1, 2, 3, 4};
        assertThat(result, is(expect));
    }
}