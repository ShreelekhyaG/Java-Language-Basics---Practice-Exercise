package main.Test;

import main.Java.SortedNum7;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortedNum7Test {
    SortedNum7 sortedNum7;
    @Before
    public void setUp() throws Exception {
        sortedNum7=new SortedNum7();
    }

    @After
    public void tearDown() throws Exception {
        sortedNum7=null;
    }

    @Test
    public void sortedNum() {
        int expectedValue=432;
        //Act
        int actualValue=sortedNum7.sortedNum(234);
        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void sumOfEven() {
        int expectedValue=10;
        //Act
        int actualValue=sortedNum7.sumOfEven(234534);
        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void sumExceed() {
        boolean expectedValue=false;
        //Act
        boolean actualValue=sortedNum7.sumExceed(sortedNum7.sumOfEven(234534));
        //Assert
        assertEquals(expectedValue, actualValue);
    }
}