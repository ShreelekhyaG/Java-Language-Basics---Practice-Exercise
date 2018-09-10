package main.Test;

import main.Java.NthIteration4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NthIteration4Test {
    NthIteration4 nthIteration4;
    @Before
    public void setUp() throws Exception {
        nthIteration4=new NthIteration4();
    }

    @After
    public void tearDown() throws Exception {
        nthIteration4=null;
    }

    @Test
    public void repeat() {
        String expectedValue="1 2 2 3 3 3 4 4 4 4 5 5 5 5 5";
        //Act
        String actualValue=nthIteration4.repeat(5);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void repeatNull() {
        String expectedValue="Null exception";
        //Act
        String actualValue=nthIteration4.repeat(null);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
}