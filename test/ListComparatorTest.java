package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import java.util.Arrays;
import java.util.Collections;
import org.junit.Test;
import src.ListComparator;

public class ListComparatorTest {

    @Test
    public void testCalculateEmptyList() {
        assertThrows(IllegalArgumentException.class, () -> ListComparator.calculateAverage(Collections.emptyList()));
    }

    @Test
    public void testCalculateSingletonList() {
        assertEquals(5.0, ListComparator.calculateAverage(Collections.singletonList(5)), 0.001);
    }

    @Test
    public void testCalculateAverage() {
        assertEquals(2.5, ListComparator.calculateAverage(Arrays.asList(1, 2, 3, 4)), 0.001);
    }

    @Test
    public void testCompareFirstListGreater() {
        assertEquals("Первый список имеет большее среднее значение",
                ListComparator.compareLists(Arrays.asList(2, 3, 4), Arrays.asList(1, 2, 3)));
    }

    @Test
    public void testCompareSecondListGreater() {
        assertEquals("Второй список имеет большее среднее значение",
                ListComparator.compareLists(Arrays.asList(1, 2, 3), Arrays.asList(2, 3, 4)));
    }

    @Test
    public void testCompareListsEqual() {
        assertEquals("Средние значения равны",
                ListComparator.compareLists(Arrays.asList(1, 2, 6), Arrays.asList(2, 3, 4)));
    }
}
