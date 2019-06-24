package com.zipcodewilmington.looplabs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
        Integer[] toEvaluate = super.array;

        public IntegerDuplicateDeleter(Integer[] intArray){
            super(intArray);
        }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Stream<Integer> newStream = Arrays.stream(super.array);
        Predicate<Integer> predInt = i -> (super.countOccurances(i, toEvaluate) < maxNumberOfDuplications);
        return newStream.filter(predInt).toArray(Integer[]::new);
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Stream<Integer> newStream = Arrays.stream(super.array);
        Predicate<Integer> predInt = i -> (super.countOccurances(i, toEvaluate) != exactNumberOfDuplications);
        return newStream.filter(predInt).toArray(Integer[]::new);
    }
}
