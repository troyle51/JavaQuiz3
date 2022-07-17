package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        return str.substring(0, indexToCapitalize) +
                str.toUpperCase().charAt(indexToCapitalize) +
                str.substring(indexToCapitalize+1);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        List<String> list = new ArrayList<>();
        String temp;
        for (int i = 0; i <= string.length(); i++){
            for (int j = i+1 ; j <= string.length(); j++){
                temp = string.substring(i, j);
                //System.out.println(temp);
                list.add(temp);
            }
        }
        return list.toArray(new String[0]);
    }

    public static Integer getNumberOfSubStrings(String input){
        String[] newArr = getAllSubStrings(input);
        int arrayLen = newArr.length-1;
        return arrayLen;
    }
}
