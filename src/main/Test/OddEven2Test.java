package main.Test;

import main.Java.OddEven2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddEven2Test {
    OddEven2 oddEven2;
    @Before
    public void setUp() throws Exception {
        oddEven2=new OddEven2();
    }

    @After
    public void tearDown() throws Exception {
        oddEven2=null;
    }

    @Test
    public void oddEvenCheckerEven() {
        String expectedValue="Jerry";
        //Act
        String actualValue=oddEven2.oddEvenChecker(22);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void oddEvenCheckerOdd() {
        String expectedValue="Tom";
        //Act
        String actualValue=oddEven2.oddEvenChecker(23);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void oddEvenCheckerOutOfRange() {
        String expectedValue="Out of range";
        //Act
        String actualValue=oddEven2.oddEvenChecker(32);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void oddEvenCheckerNullValue() {
        String expectedValue="Null exception";
        //Act
        String actualValue=oddEven2.oddEvenChecker(null);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
}