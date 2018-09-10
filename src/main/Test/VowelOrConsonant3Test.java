package main.Test;

import main.Java.VowelOrConsonant3;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelOrConsonant3Test {
    VowelOrConsonant3 vowelOrConsonant3;
    @Before
    public void setUp() throws Exception {
        vowelOrConsonant3=new VowelOrConsonant3();
    }

    @After
    public void tearDown() throws Exception {
        vowelOrConsonant3=null;
    }

    @Test
    public void vowelCheckVowel() {
        //Arranga
        String expectedValue="Vowel ";
        //Act
        String actualValue=vowelOrConsonant3.vowelCheck("A");
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void vowelCheckConsonant() {
        //Arranga
        String expectedValue="Consonant ";
        //Act
        String actualValue=vowelOrConsonant3.vowelCheck("b");
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void vowelCheckMultiple() {
        //Arranga
        String expectedValue="Vowel Consonant ";
        //Act
        String actualValue=vowelOrConsonant3.vowelCheck("Ab");
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void vowelCheckSpecialChar() {
        //Arranga
        String expectedValue="Error! Not a letter ";
        //Act
        String actualValue=vowelOrConsonant3.vowelCheck("@");
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void vowelCheckNull() {
        //Arranga
        String expectedValue="Null exception";
        //Act
        String actualValue=vowelOrConsonant3.vowelCheck(null);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
}