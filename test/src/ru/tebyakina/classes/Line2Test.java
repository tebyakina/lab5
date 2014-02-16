package ru.tebyakina.classes;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fox
 */
public class Line2Test {
    /**
     * Тест метода getDistanceToCenter класса Line2.
     */
    @Test
    public void testGetDistanceToCenter() {
        System.out.println("getDistanceToCenter");
        assertEquals(-1.0, new Line2(1,2).getDistanceToCenter(), 0.0);
    }

    /**
     * Тест метода getY класса Line2.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        assertEquals(2.0, new Line2(1,2).getY(), 0.0);
   }

    /**
     * Тест метода getX класса Line2.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        assertEquals(-2.0, new Line2(1,2).getX(), 0.0);
    }
}
