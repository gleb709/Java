package tasks.epam.sortings;

public class Sort {
    private boolean flag;
    private int[][] array;
    private int[] sortKey;
    private int arraySizeX;
    private int arraySizeY;

    public Sort(boolean flag, int[][] array, int[] sortKey, int arraySizeX, int arraySizeY){
        this.flag = flag;
        this.array = array;
        this.sortKey = sortKey;
        this.arraySizeX = arraySizeX;
        this.arraySizeY = arraySizeY;
    }

    public int[][] getArray() {
        return array;
    }

    public void setArray(int[][] array) {
        this.array = array;
    }

    public void startSort(){
        boolean sorted = false;
        int temp;
        if(flag == true) {
            while (!sorted) {
                sorted = true;
                for (int x = 0; x < arraySizeX - 1; x++) {
                    if (sortKey[x] < sortKey[x + 1]) {
                        temp = sortKey[x];
                        sortKey[x] = sortKey[x + 1];
                        sortKey[x + 1] = temp;
                        for (int y = 0; y < arraySizeY; y++) {
                            temp = array[x][y];
                            array[x][y] = array[x+1][y];
                            array[x+1][y] = temp;
                        }
                        sorted = false;
                    }
                }
            }
        }else{
            while (!sorted) {
                sorted = true;
                for (int x = 0; x < arraySizeX - 1; x++) {
                    if (sortKey[x] > sortKey[x + 1]) {
                        temp = sortKey[x];
                        sortKey[x] = sortKey[x + 1];
                        sortKey[x + 1] = temp;
                        for (int y = 0; y < arraySizeY; y++) {
                            temp = array[x][y];
                            array[x][y] = array[x + 1][y];
                            array[x + 1][y] = temp;
                        }
                        sorted = false;
                    }
                }
            }
        }
    }
}
