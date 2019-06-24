package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/25/18.
 */
public abstract class DuplicateDeleter<T> implements DuplicateDeleterInterface<T> {
    protected T[] array;

    public DuplicateDeleter(T[] intArray) {
        this.array = intArray;
    }

    public Integer countOccurances(T value, T[]toEvaluate){
        Integer count = 0;

        for (int i = 0; i < toEvaluate.length; i++) {
            if (toEvaluate[i].equals(value)) {
                count++;
            }
        }
            return count;
    }

    abstract public T[] removeDuplicates(int maxNumberOfDuplications);
    abstract public T[] removeDuplicatesExactly(int exactNumberOfDuplications);


}
