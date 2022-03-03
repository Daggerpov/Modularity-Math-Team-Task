import java.util.ArrayList;

interface TeamTask {

    ArrayList<Double> getList();

    //Milos
    double mean();
    //Milos
    double mode(); 
    //Stephen
    double median();
    //Danial
    double max();
    //Danial
    double min();
    //Danial
    double range();
    //Milos
    boolean search(Double num);
    //Stephen
    double factorial(); //List of factorials
    //Stephen
    double sum(); //Sum of list
    //Milos
    double randNum();
    //Stephen
    double powerOf(Double num);
    //Milos
    double evenOdd(int num);
    
    //Sorting can be ascending and descending
    //Danial
    ArrayList<Double> sortAsc();
    //Danial
    ArrayList<Double> sortDesc();


    //Daniel does these:
    ArrayList<Double> bubbleSort();
    ArrayList<Double> selectionSort();
    ArrayList<Double> insertionSort();
    ArrayList<Double> quickSort();
    ArrayList<Double> mergeSort();
    ArrayList<Double> heapSort();

}