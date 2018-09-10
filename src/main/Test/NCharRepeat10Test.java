package main.Test;

import main.Java.NCharRepeat10;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NCharRepeat10Test {
    NCharRepeat10 nCharRepeat10;
    @Before
    public void setUp() throws Exception {
        nCharRepeat10=new NCharRepeat10();
    }

    @After
    public void tearDown() throws Exception {
        nCharRepeat10=null;
    }

    @Test
    public void charRepeat() {
        String expectedValue="Stackrouterouterouterouterouteroute";
        //Act
        String actualValue=nCharRepeat10.charRepeat("Stackroute",5);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
}