package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringFinderTest {
    public StringFinder stringFinder;
    @Before
    public void setUp()
    {
        stringFinder=new StringFinder();
    }
    @After
    public void tearDown()
    {
        stringFinder=null;
    }
    @Test
    public void givenInputStringAndPatternShouldReturnStartAndEndIndexOfThePatternInTheString()
    {
        //arrange
        //act
        String result=stringFinder.stringFind("She sells seashells by the seashor","se");
        //assert
        assertEquals(" Found at 4 6 Found at 10 12 Found at 27 29",result);
    }
    @Test
    public void givenEmptyStringShouldReturnErrorMessage()
    {
        //arrange
        //act
        String result=stringFinder.stringFind(" "," ");
        //assert
        assertEquals("Empty String is not accepted",result);

    }
    @Test
    public void givenNullShouldReturnErrorMessage()
    {
        //arrange
        //act
        String result=stringFinder.stringFind(null," ");
        //assert
        assertEquals("Null String is not accepted",result);

    }
    @Test
    public void givenNumberShouldReturnError(){
        //arrange
        //act
        String result=stringFinder.stringFind("1","1");
        //assert
        assertNotEquals("Number",result);
    }
    @Test
    public void givenSpecialCharacterShouldReturnError(){
        //arrange
        //act
        String result=stringFinder.stringFind("@","@");
        //assert
        assertNotEquals("Special Character",result);
    }

}