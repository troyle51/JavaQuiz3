package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {

    public String translate(String str) {
        String output = "";
        if(VowelUtils.startsWithVowel(str)){
            output = str + "way";
        } else if (VowelUtils.hasVowels(str)){
            output = str + "ay";
        } else {
            return null;
        }

        return output;
    }
}
