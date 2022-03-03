import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Calculations implements TeamTask {

    private ArrayList<Double> list;

    public Calculations(ArrayList<Double> l) {
        list = l;
    }

    public ArrayList<Double> getList() {
        return list;
    }

    //Milos
    public double mean() {
        return 0.0;
    }
    //Milos
    public double mode() {
        return 0.0;
    }   
    //Milos
    public boolean search(Double num) {
        return true;
    }
    //Milos
    public double range() {
        return 0.0;
    }
    //Returns random number from the list
    public double randNum() {
        Random rand = new Random();
        int int_random = rand.nextInt(list.size() );
        double random_num_list = list.get(int_random);
        return random_num_list;
    }
    //Danial
    public double max() {
        ArrayList<Double> temp = list;
        Collections.sort(temp);
        return temp.get(temp.size() - 1);
    }
    //Danial
    public double min() {
        ArrayList<Double> temp = list;
        Collections.sort(temp);
        return temp.get(0);
    }
    //Danial
    public ArrayList<Double> sortAsc() {
        ArrayList<Double> temp = list;
        Collections.sort(temp);
        return temp;
    }
    //Danial
    public ArrayList<Double> sortDesc() {
        ArrayList<Double> temp = list;
        Collections.sort(temp, Collections.reverseOrder());
        return temp;
    }
    //Danial
    public double evenOdd(int num) {
        return 0.0;
    }

    //Stephen
    public double factorial() {
        return 0.0;
    }
    //Stephen
    public double sum() {
        Double sum = 0.0;
        for (Double d : list) {
            sum += d;
        }
        return sum;
    }
    //Stephen
    public double powerOf(Double num) {
        return 0.0;
    }
    //Stephen
    public double median() {
        return 0.0;
    }
    
    //Sorting can be ascending and descending

    //Daniel does these:
    public ArrayList<Double> bubbleSort() {
        return list;
    }
    public ArrayList<Double> selectionSort() {
        return list;
    }
    public ArrayList<Double> insertionSort() {
        return list;
    }
    public ArrayList<Double> quickSort() {
        return list;
    }
    public ArrayList<Double> mergeSort() {
        return list;
    }
    public ArrayList<Double> heapSort() {
        return list;
    }
    
}
