import java.util.ArrayList;

interface TeamTask {

    ArrayList<Double> getList();

    //Milos
    double mean();
    //Milos
    ArrayList<Double> mode(); 
    //Stephen
    String median();
    //Danial
    double max();
    //Danial
    double min();
    //Danial
    String range();
    //Milos
    boolean search();
    //Stephen
    ArrayList<Double> factorial(); //List of factorials
    //Stephen
    double sum(); //Sum of list
    //Milos
    double randNum();
    //Stephen
    ArrayList<Double> powerOf();
    //Danial
    ArrayList<Double> evenOdd();
    
    //Sorting can be ascending and descending
    //Danial
    ArrayList<Double> sortAsc();
    //Danial
    ArrayList<Double> sortDesc();

    //Daniel does these:
    ArrayList<Double> bubbleSort();
    ArrayList<Double> selectionSort();
    ArrayList<Double> insertionSort();

}
