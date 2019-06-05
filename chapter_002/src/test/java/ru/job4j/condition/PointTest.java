package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void whenZeroAndTenThenTen() {
        Point first = new Point(0, 0, 0);
        Point second = new Point(0,4, 3);
        double result = first.distance3D(second);
        first.info();
        second.info();
        System.out.println(String.format("Result is %s", result));
        assertThat(result, is(5D));
    }
    @Test
    public void whenCheckItself() {
        Point point = new Point(0, 0,0);
        double result = point.distance3D(point);
        assertThat(result, is(0D));
    }
}