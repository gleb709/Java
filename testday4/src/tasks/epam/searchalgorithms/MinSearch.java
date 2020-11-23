package tasks.epam.searchalgorithms;

public class MinSearch {
    private int[] array;

    public MinSearch(int[] array){
        this.array = array;
    }

    public void startMinSearch(){
        int min = array[0];
        for (int i: array) {
            if(i < min){
                min = i;
            }
        }
        System.out.println("минисальное число массива: " + min);
    }
}
