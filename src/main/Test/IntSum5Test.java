package main.Test;

import main.Java.IntSum5;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntSum5Test {
    IntSum5 intSum5;
    @Before
    public void setUp() throws Exception {
        intSum5=new IntSum5();
    }

    @After
    public void tearDown() throws Exception {
        intSum5=null;
    }

    @Test
    public void sumOfIntNumbers() {
        String expectedValue="41";
        //Act
        String actualValue=intSum5.SumOfInt("12 23 2 4");
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void sumOfIntNull() {
        String expectedValue="Null exception";
        //Act
        String actualValue=intSum5.SumOfInt(null);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void sumOfIntNonInteger() {
        String expectedValue="It is a non integer value";
        //Act
        String actualValue=intSum5.SumOfInt("ab e2 67");
        //Assert
        assertEquals(expectedValue, actualValue);
    }
}