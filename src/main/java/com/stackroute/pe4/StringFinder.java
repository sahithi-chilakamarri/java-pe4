package com.stackroute.pe4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//This method is used to find the particular pattern using matcher class
public class StringFinder
{
    public String stringFind(String inputString, String word)
    {
        String resultString = "";
        //If the input is null or emptystring error message is displayed
        if (inputString==null)
        {
            resultString = "Null String is not accepted";
        } else if (inputString.equals(" "))
        {
            resultString = "Empty String is not accepted";

        } else {
            //If the input string contains the pattern then check for the index of the pattern
            if (inputString.contains(word)) {
                //matches the pattern
                Pattern pattern = Pattern.compile(word);
                Matcher matcher = pattern.matcher(inputString);
               //Checks for the start and end index of the pattern in the given inputString
                while (matcher.find()) {
                    int start = matcher.start();
                    int end = matcher.end();
                    resultString = resultString+" "+"Found at " + start + " " + end;
                }
            }
            else {
                resultString = "Pattern not matched";
            }
        }
        return resultString;
    }
}