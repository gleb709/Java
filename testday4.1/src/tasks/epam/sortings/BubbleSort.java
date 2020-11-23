package tasks.epam.sortings;

public class BubbleSort {
    private int[][] array;
    private int arraySizeX;
    private int arraySizeY;
    private int[] arrayMaxElements;
    private int[] arrayMinElements;
    private int[] arraySumStrings;

    public BubbleSort(int[][] array, int arraySizeX, int arraySizeY){
        this.array = array;
        this.arraySizeX = arraySizeX;
        this.arraySizeY = arraySizeY;
        arraySumStrings = new int[arraySizeX];
        arrayMaxElements = new int[arraySizeX];
        arrayMinElements = new int[arraySizeX];
        for(int i = 0; i < arraySizeX; i++){
            arrayMaxElements[i] = array[i][0];
            arrayMinElements[i] = array[i][0];
        }
    }

    public int[][] getArray() {
        return array;
    }

    public void setArray(int[][] array) {
        this.array = array;
    }


    public void startBubbleSort(){
        setArrayInfo();
        boolean sorted = false;
        int temp;
            while(!sorted) {
                sorted = true;
                for(int x = 0; x < arraySizeX; x++) {
                    for (int y = 0; y < arraySizeY - 1; y++) {
                        if (array[x][y] > array[x][y + 1]) {
                            temp = array[x][y];
                            array[x][y] = array[x][y + 1];
                            array[x][y + 1] = temp;
                            sorted = false;
                        }
                    }
                }
            }
    }

    public void setArrayInfo(){
        for(int x = 0; x < arraySizeX; x++){
            for(int y = 0; y < arraySizeY; y++){
                arraySumStrings[x] += array[x][y];
                if(arrayMaxElements[x] < array[x][y]){
                    arrayMaxElements[x] = array[x][y];
                }
                if(arrayMinElements[x] > array[x][y]){
                    arrayMaxElements[x] = array[x][y];
                }
            }
        }
    }

    public int[] getArrayMaxElements() {
        return arrayMaxElements;
    }

    public void setArrayMaxElements(int[] arrayMaxElements) {
        this.arrayMaxElements = arrayMaxElements;
    }

    public int[] getArrayMinElements() {
        return arrayMinElements;
    }

    public void setArrayMinElements(int[] arrayMinElements) {
        this.arrayMinElements = arrayMinElements;
    }

    public int[] getArraySumStrings() {
        return arraySumStrings;
    }

    public void setArraySumStrings(int[] arraySumStrings) {
        this.arraySumStrings = arraySumStrings;
    }
}
