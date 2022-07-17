package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {

    public String translate(String str) {
                String output = "";
        if(VowelUtils.startsWithVowel(str)){
            output = str + "way";
        } else if (!VowelUtils.startsWithVowel(str)){
            String tempConst = "";
            int count = 0;
            for (int i = 0; i < str.length(); i++){
                if(!VowelUtils.isVowel(str.charAt(i))){
                    tempConst += str.charAt(i);
                    count++;
                } else {break;}
            }
            tempConst = tempConst + "ay";
            //output = tempConst;
            output = str.substring(count) + tempConst;
        } else if (VowelUtils.hasVowels(str)){
            output = str + "ay";
        }
        return output;
    }
}

//        String output = "";
//        if(VowelUtils.startsWithVowel(str)){
//            output = str + "way";
//        } else if (!VowelUtils.startsWithVowel(str)){
//            String tempConst = "";
//            int count = 0;
//            for (int i = 0; i < str.length(); i++){
//                if(!VowelUtils.isVowel(str.charAt(i))){
//                    tempConst += str.charAt(i);
//                    count++;
//                } else {break;}
//            }
//            tempConst = tempConst + "ay";
//            //output = tempConst;
//            output = str.substring(count) + tempConst;
//        } else if (VowelUtils.hasVowels(str)){
//            output = str + "ay";
//        }
