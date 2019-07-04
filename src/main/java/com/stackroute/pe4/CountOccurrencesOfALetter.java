package com.stackroute.pe4;
//This class is used to the number of occurrences of a letter in the given input string.
public class CountOccurrencesOfALetter
{
    public int numberOfOccurrencesOfALetter(String inputString,char letter)
    {
        int count=0;
        //If the input is null or emptystring error message is displayed
        if(inputString==null || inputString==" ")
        {
            count=-1;
        }
        //gives the number of occurrences of a given letter in the word.
        else {
            for (int i = 0; i < inputString.length(); i++)
            {
                if (letter == inputString.charAt(i))
                {
                    count = count + 1;
                }
            }
        }
        return count;
    }
}
