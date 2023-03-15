import org.junit.jupiter.api.Test;

import java.beans.Transient;
import java.util.concurrent.CompletionException;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle Triangle1 = new Triangle(12, 15, 22);
    Triangle Triangle2 = new Triangle(12, 12, 22);
    Triangle Triangle3 = new Triangle(12, 12, 12);

    @Test
    public void testIsScalene() {
        assertEquals("scalene", Triangle1.classify());
    }

    @Test
    public void testIsIsosceles() {
        assertEquals("isosceles", Triangle2.classify());
    }

    @Test
    public void testIsEquilateral() {
        assertEquals("equilateral", Triangle3.classify());
    }

    @Test
    public void TestZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Triangle Triangle4 = new Triangle(0, 0, 0);
        });
    }

    @Test
    public void TestNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            Triangle Triangle5 = new Triangle(-10, -3, -15);
        });
    }

    @Test
    public void TestNotTriangle() {
        assertThrows(IllegalArgumentException.class, () -> {
            Triangle Triangle6 = new Triangle(7, 7, 14);
        });
    }

   /* @Test
    public void TestIsBlank() {
        assertThrows(NumberFormatException.class, () -> {
            Triangle Triangle6 = new Triangle(Double.parseDouble(""),(Double.parseDouble(""),(Double.parseDouble("");)));
        });
    }*/


}