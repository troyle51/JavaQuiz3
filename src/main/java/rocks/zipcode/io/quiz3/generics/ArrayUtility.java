package rocks.zipcode.io.quiz3.generics;

import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        return null;
    }

    public SomeType findEvenOccurringValue() {
        Integer count = 0;
        for(int i = 0; i < array.length; i++) {
            //getNumberOfOccurrences(i);
        }

        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer value = (Integer)valueToEvaluate;
        Integer count = 0;

        for(int i = 0; i < array.length; i++){
            if(this.array[i] == value){
                count++;
            }
        }
        return count;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return null;
    }
}
