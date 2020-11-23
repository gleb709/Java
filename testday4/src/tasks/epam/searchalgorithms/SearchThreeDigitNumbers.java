package tasks.epam.searchalgorithms;

public class SearchThreeDigitNumbers {
    private int[] array;

    public SearchThreeDigitNumbers(int[] array){
        this.array = array;
    }

    public void startSearchThreeDigitNumbers(){
        String threeDigitNumbers = "Искомые числа: ";
        for (int i: array) {
            if( i > 123 && i < 987){
                if(i/100 != i % 10 && i/100 != i/10%10 && i %10 != i/10%10){
                    threeDigitNumbers += i + " ";
                }
            }
        }
        System.out.println(threeDigitNumbers);
    }
}
