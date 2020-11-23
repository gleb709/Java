package tasks.epam.searchalgorithms;

public class BinarySearch {
    private int[] array;

    public BinarySearch(int[] array){
        this.array = array;
    }

    public void startBinarySearch(int elementToFind){
        int element = 0;
        int firstElement = 0;
        int lastElement = array.length-1;
        while(true){
            element =(firstElement + lastElement)/2;
            if(array[element] == elementToFind){
                System.out.println("Номер числа в массиве: " + element);
                break;
            }else if(firstElement >= lastElement){
                System.out.println("Такого числа в массиве нет");
                break;
            }
            if(elementToFind < array[element]){
                lastElement = element-1;
            }else{
                firstElement = element+1;
            }
        }
    }
}
