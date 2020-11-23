package tasks.epam.main;

import tasks.epam.entities.Array;
import tasks.epam.report.Report;
import tasks.epam.sortings.BubbleSort;
import tasks.epam.sortings.Sort;

public class Main {
    public static void main(String[] args) {
        Array array = new Array();
        array.setArray();
        BubbleSort bubbleSort = new BubbleSort(array.getArray(), array.getArraySizeX(), array.getArraySizeY());
        bubbleSort.startBubbleSort();
        Sort sort = new Sort(true, bubbleSort.getArray(), bubbleSort.getArraySumStrings(), array.getArraySizeX(), array.getArraySizeY());
        sort.startSort();
        Report report = new Report(sort.getArray(), array.getArraySizeX(), array.getArraySizeY());
        report.startReport();
        System.out.println();
        Sort sort1 = new Sort(false, bubbleSort.getArray(), bubbleSort.getArraySumStrings(), array.getArraySizeX(), array.getArraySizeY());
        sort1.startSort();
        Report report1 = new Report(sort.getArray(), array.getArraySizeX(), array.getArraySizeY());
        report1.startReport();
    }
}
