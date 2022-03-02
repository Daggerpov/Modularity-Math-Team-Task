import java.util.ArrayList;

interface TeamTask {

    void printList();

    double mean(ArrayList<Double> list);
    double mode(ArrayList<Double> list);
    double median(ArrayList<Double> list);
    double max(ArrayList<Double> list);
    double min(ArrayList<Double> list);
    double range(ArrayList<Double> list);
    boolean search(ArrayList<Double> list, Double num);
    double factorial(ArrayList<Double> list); //List of factorials
    double sum(ArrayList<Double> list); //Sum of list
    double randNum(ArrayList<Double> list);
    double powerOf(ArrayList<Double> list, Double num);
    double evenOdd(ArrayList<Double> list, int num);
    
    //Sorting can be ascending and descending
    ArrayList<Double> sortAsc(ArrayList<Double> list);

    ArrayList<Double> bubbleSort(ArrayList<Double> list);
    ArrayList<Double> selectionSort(ArrayList<Double> list);
    ArrayList<Double> insertionSort(ArrayList<Double> list);
    ArrayList<Double> quickSort(ArrayList<Double> list);
    ArrayList<Double> mergeSort(ArrayList<Double> list);
    ArrayList<Double> heapSort(ArrayList<Double> list);

}