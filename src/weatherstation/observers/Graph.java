package weatherstation.observers;

public class Graph {
    private float temperature;
    private float humidity;
    private float pressure;
    private float[][] tempGraph = new float[10][10];

    private void setTempGraph(){
        if (temperature > -50)
            tempGraph[9][9] = temperature;
        else if (temperature > -40)
            tempGraph[9][8] = temperature;
        else if (temperature > -30)
            tempGraph[9][7] = temperature;
        else if (temperature > -20)
            tempGraph[9][6] = temperature;
        else if (temperature > -10)
            tempGraph[9][5] = temperature;
        else if (temperature > 0)
            tempGraph[9][4] = temperature;
        else if (temperature > 10)
            tempGraph[9][3] = temperature;
        else if (temperature > 20)
            tempGraph[9][2] = temperature;
        else if (temperature > 30)
            tempGraph[9][1] = temperature;
        else if (temperature > 40)
            tempGraph[9][0] = temperature;
    }



    private void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

}
/*
   j
 i[][][]
  [][][]
 */
