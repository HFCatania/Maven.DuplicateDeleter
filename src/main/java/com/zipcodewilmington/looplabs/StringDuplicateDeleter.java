package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    String[] toEvaluate = super.array;

    public StringDuplicateDeleter(String[] stringArray){
        super(stringArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        Stream<String> newStream = Arrays.stream(super.array);
        Predicate<String> predStr = i -> (super.countOccurances(i, toEvaluate) < maxNumberOfDuplications);
        return newStream.filter(predStr).toArray(String[]::new);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Stream<String> newStream = Arrays.stream(super.array);
        Predicate<String> predStr = i -> (super.countOccurances(i, toEvaluate) != exactNumberOfDuplications);
        return newStream.filter(predStr).toArray(String[]::new);
    }
}
