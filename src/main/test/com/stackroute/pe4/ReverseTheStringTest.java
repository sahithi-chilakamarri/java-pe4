package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTheStringTest {
public ReverseTheString reverseString;
@Before
    public void setUp()
{
    reverseString=new ReverseTheString();
}
@After
    public void tearDown()
{
    reverseString=null;
}
@Test
    public void givenParagraphShouldReturnReverseOfTheStrings()
{
    //arrange
    //act
    String result=reverseString.reverseTheString("a quick brown fox jumps over the lazy dog");
    //assert
    assertEquals("a kciuq nworb xof spmuj revo eht yzal god ",result);
}
    @Test
    public void givenEmptyStringShouldReturnErrorMessage()
    {
        //arrange
        //act
        String result=reverseString.reverseTheString(" ");
        //assert
        assertEquals("Empty String is not accepted.",result);

    }
    @Test
    public void givenNullShouldReturnErrorMessage()
    {
        //arrange
        //act
        String result=reverseString.reverseTheString(null);
        //assert
        assertEquals("Null String is not accepted",result);

    }

}