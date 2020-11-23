package tasks.epam.sortings;

public class BubbleSort {
    private int[] array;

    public BubbleSort(int[] array){
        this.array = array;
    }

    public void bubbleSort(){
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
            System.out.println(array);
        }
        System.out.println("Массив отсортирован!");
    }
}
