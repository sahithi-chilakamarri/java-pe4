package com.stackroute.pe4;
//It checks the sentence whether it contains nam harry or not
public class RegularExpressionDemo {
    public String containWord(String input)
    {
        String name="Harry",sentence="Is Harry Here?",resultString;
        //If the input is null or emptystring error message is displayed
        if(input==null)
        {
            resultString="Null is not accepted";
        }
        else if(input.equals(" "))
            {
                resultString="Empty String is not accepted";
            }
            else
        {
            //Check for the name harry
            if(input.contains(name))
            {
                resultString = "true";
            }
                else
                {
                   resultString="false";
                }
            }
    return resultString;
    }

    }

