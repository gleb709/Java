package tasks.epam.entities;

import java.util.Arrays;

public class Array {
    private int arraySize;

    private int[] array;

    public Array() {}

    public Array(int[] array){
        this.array = array;
        arraySize = array.length;
    }

    public void remove(int elementId){
        if(elementId < arraySize){
            int newArray[] = new int[--arraySize];
            int arrayElement = 0;
            int newArrayElement = 0;
            for(int i : array) {
                if(arrayElement != elementId) {
                    newArray[newArrayElement++] = i;
                    arrayElement++;
                }else{
                    arrayElement++;
                }
            }
            array = newArray;
            newArray = null;
        }else{
            System.out.println("Введено некорректное число");
        }
    }

    public void add(int element) {
        int newArray[] = new int[++arraySize];
        for(int i = 0; i < arraySize-1; i++) {
            newArray[i] = array[i];
        }
        newArray[arraySize-1] = element;
        array = newArray;
        newArray = null;
    }

    public int getArraySize() {
        return arraySize;
    }

    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
        this.arraySize = array.length;
    }

    @Override
    public String toString() {
        String arrayString = new String();
        arrayString += "[";
        for (int i = 0; i < arraySize-1; i++ ){
            arrayString += array[i] + ", ";
        }
        arrayString+=array[arraySize-1] + "]";
        return "Array{" +
                "Размер массива: " + arraySize +
                ", array=" + arrayString +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array1 = (Array) o;
        return Arrays.equals(array, array1.array);
    }

    @Override
    public int hashCode() {
        int hCode = 0;
        for (int i = 0; i < arraySize; i++){
             hCode += array[i];
             if(i > 0) {
                 hCode *= i;
             }
        }
        hCode = hCode / arraySize;
        return hCode;
    }
}
