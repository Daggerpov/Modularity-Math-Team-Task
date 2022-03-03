import java.util.ArrayList;

interface TeamTask {

    ArrayList<Double> getList();

    //Milos
    double mean(ArrayList<Double> list);
    //Milos
    double mode(ArrayList<Double> list); 
    //Stephen
    double median(ArrayList<Double> list);
    //Danial
    double max();
    //Danial
    double min();
    //Danial
    double range(ArrayList<Double> list);
    //Milos
    boolean search(ArrayList<Double> list, Double num);
    //Stephen
    double factorial(ArrayList<Double> list); //List of factorials
    //Stephen
    double sum(ArrayList<Double> list); //Sum of list
    //Milos
    double randNum(ArrayList<Double> list);
    //Stephen
    double powerOf(ArrayList<Double> list, Double num);
    //Milos
    double evenOdd(ArrayList<Double> list, int num);
    
    //Sorting can be ascending and descending
    //Danial
    ArrayList<Double> sortAsc(ArrayList<Double> list);
    //Danial
    ArrayList<Double> sortDesc(ArrayList<Double> list);


    //Daniel does these:
    ArrayList<Double> bubbleSort(ArrayList<Double> list);
    ArrayList<Double> selectionSort(ArrayList<Double> list);
    ArrayList<Double> insertionSort(ArrayList<Double> list);
    ArrayList<Double> quickSort(ArrayList<Double> list);
    ArrayList<Double> mergeSort(ArrayList<Double> list);
    ArrayList<Double> heapSort(ArrayList<Double> list);

}