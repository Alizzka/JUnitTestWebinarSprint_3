package edu.praktikum.sprint3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleMaxSideTests {

    @Test
    public void maxSide() {
        Triangle triangle = new Triangle(2, 5, 10);

        assertEquals("Максимальная сторона треугольника вычисляется неверно",
                10, triangle.maxSide());
    }
}
