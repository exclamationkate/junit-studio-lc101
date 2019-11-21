package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    BalancedBrackets test_Class;

    @Before
    public void createTestClass() {
        test_Class = new BalancedBrackets();
    }

    //TODO: add tests here

    // assertTrue tests

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsAtBeginningAndEndOfStringReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void bracketsAtBeginningOfStringReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void bracketsAtMiddleAndEndOfStringReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void multipleSetsOfProperlyNestedBracketsReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[][][[[]]][][]"));
    }

    @Test
    public void bracketsSurroundingSpaceSeparatedWordsReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[This is a test.]"));
    }

    @Test
    public void bracketsSurroundingMultiLineStringReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[This is the first sentence." +
                "This is the second sentence.]"));
    }

    // assertFalse tests

    @Test
    public void onlyOpeningBracketReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("["));
    }

    @Test
    public void startsWithClosingBracketReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("]["));
    }

    @Test
    public void onlyOpeningBracketAtBeginningOfStringReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void bracketsInWrongOrder() {
        assertFalse(test_Class.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void multipleBracketsInWrongOrderReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("[One[Two]Three]Four]Five[Six[Seven]"));
    }

}
