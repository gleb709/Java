package tasks.epam.searchalgorithms;

public class SearchPrimeNumbers {
    private int[] array;

    public SearchPrimeNumbers(int[] array){
        this.array = array;
    }

    public void startSearchPrimeNumbers(){
        String primeNumbers = "Простые числа массива: ";
        for (int i: array) {
            boolean flag = true;
            for(int del = 2; del < i; del++){
                if(i / del == 0){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                primeNumbers += i + " ";
            }
        }
        System.out.println(primeNumbers);
    }
}
