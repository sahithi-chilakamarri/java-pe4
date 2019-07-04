package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTheStringsTest {
    public SortingTheStrings sortingTheStrings;
    @Before
    public void setUp()
    {
        sortingTheStrings=new SortingTheStrings();
    }
    @After
    public void tearDown()
    {
        sortingTheStrings=null;
    }
    @Test
    public void givenOneStringShouldReturnTheSortedOrderOfTheStrings()
    {
        //arrange
        //act
        String result=sortingTheStrings.sortTheStrings("bcda ejfh");
        //assert
        assertEquals(" abcd efhj ",result);

    }
    @Test
    public void givenEmptyStringShouldReturnErrorMessage()
    {
        //arrange
        //act
        String result=sortingTheStrings.sortTheStrings(" ");
        //assert
        assertEquals("Empty String is not accepted.",result);

    }
    @Test
    public void givenNullShouldReturnErrorMessage()
    {
        //arrange
        //act
        String result=sortingTheStrings.sortTheStrings(null);
        //assert
        assertEquals("Null String is not accepted",result);

    }
    @Test
    public void givenNumberShouldReturnError(){
        //arrange
        //act
        String result=sortingTheStrings.sortTheStrings("1");
        //assert
        assertNotEquals("Number",result);
    }
    @Test
    public void givenSpecialCharacterShouldReturnError(){
        //arrange
        //act
        String result=sortingTheStrings.sortTheStrings("@");
        //assert
        assertNotEquals("Special Character",result);
    }


}