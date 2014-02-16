package ru.tebyakina.classes;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fox
 */
public class Line1Test {
    /**
     * Тест метода getDistanceToCenter класса Line1.
     */
    @Test
    public void testGetDistanceToCenter() {
        System.out.println("getDistanceToCenter");
        assertEquals(2.0, new Line1(2).getDistanceToCenter(), 0.0);
        assertEquals(3.0, new Line1(3).getDistanceToCenter(), 0.0);
        assertEquals(4.0, new Line1(4).getDistanceToCenter(), 0.0);
        assertEquals(5.0, new Line1(5).getDistanceToCenter(), 0.0);
    }

    /**
     * Тест метода getY класса Line1.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        assertEquals(0.0, new Line1(1).getY(), 0.0);
        assertEquals(0.0, new Line1(2).getY(), 0.0);
        assertEquals(0.0, new Line1(3).getY(), 0.0);
        assertEquals(0.0, new Line1(4).getY(), 0.0);
        assertEquals(0.0, new Line1(5).getY(), 0.0);
   }

    /**
     * Тест метода getX класса Line1.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        assertEquals(1.0, new Line1(1).getX(), 0.0);
        assertEquals(2.0, new Line1(2).getX(), 0.0);
        assertEquals(3.0, new Line1(3).getX(), 0.0);
        assertEquals(4.0, new Line1(4).getX(), 0.0);
        assertEquals(5.0, new Line1(5).getX(), 0.0);
    }
}
