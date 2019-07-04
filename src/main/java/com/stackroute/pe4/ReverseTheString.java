package com.stackroute.pe4;
//This is used to reverse the string in the given paragraph
public class ReverseTheString {
public String reverseTheString(String inputString)
{
    String resultString="";
    //If the input is null or emptystring error message is displayed
    if(inputString==null)
    {
        resultString="Null String is not accepted";
    }
    else if(inputString.equals(" "))
    {
        resultString="Empty String is not accepted.";
    }
    else {
        String[] string = inputString.split(" ");
        StringBuffer[] reverseString=new StringBuffer[string.length];
        for (int i = 0; i < string.length; i++)
        {
            //It reverses the string
            reverseString[i] = new StringBuffer(string[i]);
            reverseString[i].reverse();

            resultString = resultString.concat(reverseString[i].toString()+ " ");
        }
    }
    return resultString;
}
}
