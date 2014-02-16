package ru.tebyakina.classes;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fox
 */
public class Line4Test {
    /**
     * Тест метода getDistanceToCenter класса Line4.
     */
    @Test
    public void testGetDistanceToCenter() {
        System.out.println("getDistanceToCenter");
        assertEquals(-1.0, new Line4(1,2,3,4).getDistanceToCenter(), 0.0);
    }

    /**
     * Тест метода getY класса Line4.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        assertEquals(4.0, new Line4(1,2,3,4).getY(), 0.0);
   }

    /**
     * Тест метода getX класса Line4.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        assertEquals(-2.0, new Line4(1,2,3,4).getX(), 0.0);
    }
}
