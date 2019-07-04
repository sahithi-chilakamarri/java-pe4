package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceTheLettersTest {
    public ReplaceTheLetters replaceTheLetters;
    @Before
    public void setUp()
    {
        replaceTheLetters=new ReplaceTheLetters();
    }
    @After
    public void tearDown()
    {
        replaceTheLetters=null;
    }
    @Test
    public void givenStringShouldReturnReplaceOfTheLetters()
    {
        //arrange
        //act
        String result=replaceTheLetters.replaceTheLettersInString("daily dry");
        //assert
        assertEquals("faity fry",result);
    }
    @Test
    public void givenNullShouldReturnErrorMessage()
    {
        //arrange
        //act
        String result=replaceTheLetters.replaceTheLettersInString(null);
        //assert
        assertEquals("Null is not accepted",result);
    }
    @Test
    public void givenEmptyStringShouldReturnReplaceOfTheLetters()
    {
        //arrange
        //act
        String result=replaceTheLetters.replaceTheLettersInString(" ");
        //assert
        assertEquals("Empty String is not accepted",result);
    }

}