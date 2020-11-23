package tasks.epam.searchalgorithms;

public class FibonacciNumbers {
    private int[] array;

    public FibonacciNumbers(int[] array){
        this.array = array;
    }

    public void startSearchFibonacciNumbers(){
        int counter = 0;
        int previousNumber;
        int presentNumber;
        int bufferNumber;
        String fibonacciNumbers = "Числа Фибоначчи в массиве: ";
        for (int number : array) {
            presentNumber = 1;
            previousNumber = 1;
            while(true){
                if (number == presentNumber) {
                    fibonacciNumbers += "ID: " + counter + " Число: " + number + " ";
                    break;
                }else if(presentNumber > number){
                    break;
                }
                bufferNumber = presentNumber;
                presentNumber = presentNumber + previousNumber;
                previousNumber = bufferNumber;

            }
            counter++;
        }
        System.out.println(fibonacciNumbers);
    }
}
