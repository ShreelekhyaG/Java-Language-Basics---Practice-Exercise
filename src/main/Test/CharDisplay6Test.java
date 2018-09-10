package main.Test;

import main.Java.CharDisplay6;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharDisplay6Test {
    CharDisplay6 charDisplay6;
    @Before
    public void setUp() throws Exception {
        charDisplay6=new CharDisplay6();
    }

    @After
    public void tearDown() throws Exception {
        charDisplay6=null;
    }

    @Test
    public void charTypeCapital() {
        String expectedValue="Capital letter";
        //Act
        String actualValue=charDisplay6.charType("A");
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void charTypeSmall() {
        String expectedValue="Small case letter";
        //Act
        String actualValue=charDisplay6.charType("x");
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void charTypeDigit() {
        String expectedValue="Digit";
        //Act
        String actualValue=charDisplay6.charType("5");
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void charTypeSpecial() {
        String expectedValue="Special character";
        //Act
        String actualValue=charDisplay6.charType("#");
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void charTypeNull() {
        String expectedValue="Null exception";
        //Act
        String actualValue=charDisplay6.charType(null);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
}