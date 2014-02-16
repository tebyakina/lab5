package ru.tebyakina.classes;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fox
 */
public class SortModeTest {
    /**
     * Тест метода compare класса SortMode.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        assertEquals(0, new SortMode(true,1).compare(new Line1(1), new Line1(1)));
    }
}
