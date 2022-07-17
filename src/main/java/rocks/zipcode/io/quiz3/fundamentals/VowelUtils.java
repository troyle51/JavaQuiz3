package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        boolean t = false;
        for (int i = 0; i < word.length(); i++){
            if(isVowel(word.charAt(i))){
                t = true;
            }
        }
        return t;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        int output = 0;
        if(hasVowels(word)){
            if(startsWithVowel(word)){
                output = word.charAt(0);
            } else {
                for(int i = 0; i < word.length(); i++){
                    if(isVowel(word.charAt(i))){
                        output = i;
                        break;
                    }
                }
            }
        } else {
            output = -1;
        }

        return output;
    }


    public static Boolean startsWithVowel(String word) {
        boolean t = false;
        if(isVowel(word.charAt(0))){
            t = true;
        } else {
            t = false;
        }
        return t;
    }

    public static Boolean isVowel(Character character) {
        boolean vowel = false;
        if(character.equals('a') || character.equals('e') || character.equals('i') || character.equals('o') || character.equals('u') ||
                character.equals('A') || character.equals('E') || character.equals('I') || character.equals('O') || character.equals('U')){
            vowel = true;
        }
        return vowel;
    }
}
