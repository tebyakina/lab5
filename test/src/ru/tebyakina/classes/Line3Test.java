package ru.tebyakina.classes;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fox
 */
public class Line3Test {
    /**
     * Тест метода getDistanceToCenter класса Line3.
     */
    @Test
    public void testGetDistanceToCenter() {
        System.out.println("getDistanceToCenter");
        assertEquals(-1.0, new Line3(1,2,1).getDistanceToCenter(), 0.0);
    }

    /**
     * Тест метода getY класса Line3.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        assertEquals(1.0, new Line3(1,2,1).getY(), 0.0);
   }

    /**
     * Тест метода getX класса Line3.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        assertEquals(-2.0, new Line3(1,2,4).getX(), 0.0);
    }
}
