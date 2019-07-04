package com.stackroute.pe4;
//This is used to replace the letters in the string d with f and l with t.
public class ReplaceTheLetters {
    //This method is used to replace the letters
    public String replaceTheLettersInString(String inputString) {
        //If the input is null or emptystring error message is displayed
        if(inputString==null)
        {
            inputString="Null is not accepted";
        }
        else if(inputString==" ")
        {
            inputString="Empty String is not accepted";
        }
        //replace the letters of d and l.
        else {
            for (int i = 0; i < inputString.length(); i++) {

                if ('d' == inputString.charAt(i)) {
                    inputString = inputString.replace('d', 'f');
                }
                if ('l' == inputString.charAt(i)) {

                    inputString = inputString.replace('l', 't');
                }
            }
        }
        return inputString;
    }
}

