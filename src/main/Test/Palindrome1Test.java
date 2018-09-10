package main.Test;

import main.Java.Palindrome1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Palindrome1Test {


Palindrome1 palindrome1;

    @Before
    public void setUp() throws Exception {
        palindrome1 =new Palindrome1();
    }

    @After
    public void tearDown() throws Exception {
        palindrome1 =null;
    }

    @Test
    public void palindromeCheckForPalindromeLt25() {
        //Arranga
        String expectedValue="It is palindrome and the sum of even numbers is less than 25";
        //Act
        String actualValue=palindrome1.palindromeCheck((long) 123321);
        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void palindromeCheckForNull() {
        //Arranga
        String expectedValue="Null exception";
        //Act
        String actualValue=palindrome1.palindromeCheck(null);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void palindromeCheckForPalindromeGt25() {
        //Arranga
        String expectedValue="It is palindrome and the sum of even numbers is greater than 25";
        Palindrome1 p=new Palindrome1();
        //Act
        String actualValue=p.palindromeCheck((long) 2468642);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void palindromeCheckForNotAPalindrome() {
        //Arranga
        String expectedValue="It is not a palindrome";
        Palindrome1 p=new Palindrome1();
        //Act
        String actualValue=p.palindromeCheck((long) 123123);
        //Assert
        assertEquals(expectedValue, actualValue);
    }


}