package test;

import main.BonusBinarySearch;
import org.junit.Test;
import static org.junit.Assert.*;

public class BonusBinarySearchTest {

    private BonusBinarySearch test_Class = new BonusBinarySearch();
    private int[] sortedNumbers = { 1, 2, 4, 10, 20 };

    @Test
    public void returnsIntIfInMiddleOfArray() {
        assertEquals(4, test_Class.binarySearch(sortedNumbers, 4));
    }

    @Test
    public void returnsIntIfOnRightHalfOfArray() {
        assertEquals(10, test_Class.binarySearch(sortedNumbers, 10));
    }

    @Test
    public void returnsIntIfOnLeftHalfOfArray() {
        assertEquals(1, test_Class.binarySearch(sortedNumbers, 1));
    }

    @Test
    public void returnsNegativeOneIfIntNotInArray() {
        assertEquals(-1, test_Class.binarySearch(sortedNumbers, 50));
    }

}
