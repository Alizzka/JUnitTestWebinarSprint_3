package edu.praktikum.sprint3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleSquareTests {

    @Test
    public void squareTests() {
        Triangle triangle = new Triangle(2, 3, 4);

        assertEquals("Площадь треугольника вычисляется неверно",
                3, triangle.square());
    }
}
