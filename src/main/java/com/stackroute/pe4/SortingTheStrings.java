package com.stackroute.pe4;

import java.util.Arrays;

import static java.lang.String.valueOf;

//This is used to sort the strings in the given string variable.
public class SortingTheStrings {
    public String sortTheStrings(String inputString) {
        String resultString = " ";
        //If the input is null or emptystring error message is displayed
        if(inputString==null)
        {
        resultString="Null String is not accepted";
        }
        else if(inputString==" ")
        {
            resultString="Empty String is not accepted.";
        }
        else {
            String[] string = inputString.split(" ");
            char[] charArray = {};
            //sort the characters of the string using sort method
            for (int i = 0; i < string.length; i++) {
                charArray = string[i].toCharArray();
                Arrays.sort(charArray);
                string[i] = valueOf(charArray);
                resultString = resultString + string[i] + " ";
            }
        }
        return resultString;
    }
}
