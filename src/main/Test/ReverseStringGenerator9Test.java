package main.Test;

import main.Java.ReverseStringGenerator9;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringGenerator9Test {
    ReverseStringGenerator9 reverseStringGenerator9;
    @Before
    public void setUp() throws Exception {
        reverseStringGenerator9=new ReverseStringGenerator9();
    }

    @After
    public void tearDown() throws Exception {
        reverseStringGenerator9=null;
    }

    @Test
    public void revString() {
        String expectedValue="nodnol";
        //Act
        String actualValue=reverseStringGenerator9.revString("london");
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void revStringNull() {
        String expectedValue="Null exception";
        //Act
        String actualValue=reverseStringGenerator9.revString(null);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
}