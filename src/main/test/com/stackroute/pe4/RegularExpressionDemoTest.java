package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionDemoTest {
public RegularExpressionDemo regularExpressionDemo;
@Before
    public void setUp()
{
    regularExpressionDemo=new RegularExpressionDemo();
}
@After
    public void tearDown()
{
    regularExpressionDemo=null;
}
@Test
    public void givenSentenceWillCheckForNameHarryShouldReturnTrue()
{
    //arrange
    //act
    String result=regularExpressionDemo.containWord("Harry");
    //assert
    assertEquals("true",result);
}
    @Test
    public void givenSentenceWillCheckForNameHarryShouldReturnFalse()
    {
        //arrange
        //act
        String result=regularExpressionDemo.containWord("Henry");
        //assert
        assertEquals("false",result);
    }
    @Test
    public void givenEmptyStringShouldReturnErrorMessage()
    {
        //arrange
        //act
        String result=regularExpressionDemo.containWord(" ");
        //assert
        assertEquals("Empty String is not accepted",result);

    }
    @Test
    public void givenNullShouldReturnErrorMessage()
    {
        //arrange
        //act
        String result=regularExpressionDemo.containWord(null);
        //assert
        assertEquals("Null is not accepted",result);

    }

}