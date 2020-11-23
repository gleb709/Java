package tasks.epam.sortings;

public class PyramidSort {
    public static void main(String[] args) {
        int[] array = {1,5,7,8,3,2,1};
        QuickSort quickSort = new QuickSort(array);
        quickSort.startSort();
    }
    private int[] array;

    public PyramidSort(int[] array){
        this.array = array;
    }

    public void startSort(){
        heapSort(array);
    }

    public void heap(int[] array, int length, int i) {
        int leftChild = 2*i+1;
        int rightChild = 2*i+2;
        int largest = i;

        // если левый дочерний больше родительского
        if (leftChild < length && array[leftChild] > array[largest]) {
            largest = leftChild;
        }

        // если правый дочерний больше родительского
        if (rightChild < length && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        // если должна произойти замена
        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            heap(array, length, largest);
        }
    }

    public void heapSort(int[] array) {
        if (array.length == 0) return;

        // Строим кучу
        int length = array.length;
        // проходим от первого без ответвлений к корню
        for (int i = length / 2-1; i >= 0; i--)
            heap(array, length, i);

        for (int i = length-1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heap(array, i, 0);
        }
    }
}
