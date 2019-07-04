package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountOccurrencesOfALetterTest {
    public CountOccurrencesOfALetter countOccurrencesOfALetter;
    @Before
    public void setUp()
    {
        countOccurrencesOfALetter=new CountOccurrencesOfALetter();
    }
    @After
    public void tearDown(){

        countOccurrencesOfALetter=null;
    }
    @Test
    public void givenLetterAndStringShouldReturnNumberOfOccurrencesOfThatLetter(){
        //arrange
        //act
        int result=countOccurrencesOfALetter.numberOfOccurrencesOfALetter("Java again again",'a');
        //act
        assertEquals(6,result);
    }
    @Test
    public void givenNullValueShouldReturnErrorMessage(){
        //arrange
        //act
        int result=countOccurrencesOfALetter.numberOfOccurrencesOfALetter(null,'a');
        //act
        assertEquals(-1,result);
    }
    @Test
    public void givenEmptyStringShouldReturnErrorMessage(){
        //arrange
        //act
        int result=countOccurrencesOfALetter.numberOfOccurrencesOfALetter(" ",'a');
        //act
        assertNotEquals(0,result);
    }

}