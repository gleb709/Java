package tasks.epam.searchalgorithms;

public class MaxSearch {
    private int[] array;

    public MaxSearch(int[] array){
        this.array = array;
    }

    public void startMaxSearch(){
        int max = array[0];
        for (int i: array) {
            if(i > max){
                max = i;
            }
        }
        System.out.println("минисальное число массива: " + max);
    }
}