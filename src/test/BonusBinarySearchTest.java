package test;

import main.BonusBinarySearch;
import org.junit.Test;
import static org.junit.Assert.*;

public class BonusBinarySearchTest {

    private BonusBinarySearch test_Class = new BonusBinarySearch();
    private int[] sortedNumbersA = { 1, 2, 4, 10, 20 };

    @Test
    public void returnsIntIfInMiddleOfArray() {
        assertEquals(4, test_Class.binarySearch(sortedNumbersA, 4));
    }

}
