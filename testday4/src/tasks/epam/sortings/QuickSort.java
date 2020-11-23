package tasks.epam.sortings;

import tasks.epam.entities.Array;

public class QuickSort {
    private int[] array;

    public QuickSort(int[] array){
        this.array = array;
    }

    public void startSort(){
        quickSort(array,0,array.length-1);
        Array array1 = new Array(this.array);
        System.out.println(array1.toString());
    }

    static int partition(int[] array, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;

        return counter;
    }

    public void quickSort(int[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot-1);
        quickSort(array, pivot+1, end);
    }
}
