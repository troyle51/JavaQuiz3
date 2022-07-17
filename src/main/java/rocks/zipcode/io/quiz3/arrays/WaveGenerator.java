package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        String[] arrayWave = new String[str.length()];

        for(int i = 0; i < str.length(); i++){
            String a = str.toLowerCase();
            String b = StringUtils.capitalizeNthCharacter(a, i);
            arrayWave[i] = b;
        }
        return arrayWave;
    }
}
