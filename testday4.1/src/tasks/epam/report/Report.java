package tasks.epam.report;

public class Report {
    private int[][] array;
    private int arraySizeX;
    private int arraySizeY;

    public Report(int[][] array, int arraySizeX, int arraySizeY){
        this.array = array;
        this.arraySizeX = arraySizeX;
        this.arraySizeY = arraySizeY;
    }

    public void startReport(){
        String report = "";
        for(int x = 0; x < arraySizeX; x++){
            for(int y = 0; y < arraySizeY; y++){
                report += array[x][y] + " ";
            }
            System.out.println(report);
            report = "";
        }
    }
}
