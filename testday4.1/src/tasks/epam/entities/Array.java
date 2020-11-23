package tasks.epam.entities;

import tasks.epam.arrayreader.RandomArray;

public class Array {
    private int[][] array;
    private int arraySizeX;
    private int arraySizeY;

    public Array(){
        arraySizeX = (int)(1 + Math.random()*7);
        arraySizeY = (int)(1 + Math.random()*7);
    }

    public void setArray(){
        RandomArray randomArray = new RandomArray();
        array = randomArray.setRandomArray(arraySizeX,arraySizeY);
    }

    public int getArraySizeX() {
        return arraySizeX;
    }

    public void setArraySizeX(int arraySizeX) {
        this.arraySizeX = arraySizeX;
    }

    public int getArraySizeY() {
        return arraySizeY;
    }

    public void setArraySizeY(int arraySizeY) {
        this.arraySizeY = arraySizeY;
    }

    public int[][] getArray(){
        return array;
    }
}
