import java.util.ArrayList;
import java.util.Random;

public class Calculations implements TeamTask {

    private ArrayList<Double> list;

    public Calculations(ArrayList<Double> l) {
        list = l;
    }

    public ArrayList<Double> getList() {
        return list;
    }

    //Milos
    public double mean(ArrayList<Double> list) {
        return 0.0;
    }
    //Milos
    public double mode(ArrayList<Double> list) {
        return 0.0;
    }   
    //Milos
    public boolean search(ArrayList<Double> list, Double num) {
        return true;
    }
    //Milos
    public double range(ArrayList<Double> list) {
        return 0.0;
    }
    //Milos
    public double randNum(ArrayList<Double> list) {
        Random rand = new Random();
        int int_random = rand.nextInt(list.size() );
        double random_num_list = list.get(int_random);
        return random_num_list;
    }
    //Danial
    public double evenOdd(ArrayList<Double> list, int num) {
        return 0.0;
    }
    //Danial
    public double max(ArrayList<Double> list) {
        return 0.0;
    }
    //Danial
    public double min(ArrayList<Double> list) {
        return 0.0;
    }
    //Danial
    public ArrayList<Double> sortAsc(ArrayList<Double> list) {
        return list;
    }
    //Danial
    public ArrayList<Double> sortDesc(ArrayList<Double> list) {
        return list;
    }

    //Stephen
    public double factorial(ArrayList<Double> list) {
        return 0.0;
    }
    //Stephen
    public double sum(ArrayList<Double> list) {
        return 0.0;
    }
    //Stephen
    public double powerOf(ArrayList<Double> list, Double num) {
        return 0.0;
    }
    //Stephen
    public double median(ArrayList<Double> list) {
        return 0.0;
    }
    
    //Sorting can be ascending and descending

    //Daniel does these:
    public ArrayList<Double> bubbleSort(ArrayList<Double> list) {
        return list;
    }
    public ArrayList<Double> selectionSort(ArrayList<Double> list) {
        return list;
    }
    public ArrayList<Double> insertionSort(ArrayList<Double> list) {
        return list;
    }
    public ArrayList<Double> quickSort(ArrayList<Double> list) {
        return list;
    }
    public ArrayList<Double> mergeSort(ArrayList<Double> list) {
        return list;
    }
    public ArrayList<Double> heapSort(ArrayList<Double> list) {
        return list;
    }
    
}
