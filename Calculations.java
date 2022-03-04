import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.Scanner;

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
    //Searches for input number in list, if number exists, returns true
    public boolean search(Double num) {
        double searchNum = num;
        if (list.indexOf(searchNum)>=0)
            return true;
        else
            return false;
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
    public ArrayList<Double> evenOdd() {
        Scanner sc = new Scanner(System.in);

        int num;
        while (true) {
            System.out.println("Type 1 to print all odd numbers and 2 to print even numbers: ");
            num = sc.nextInt();
            if (num == 1 || num == 2) {
                break;
            }
        }

        sc.close();

        ArrayList<Double> temp = new ArrayList<Double>();
        for (double i : list) {
            if (i % 2 == 0) {
                if (num == 2) {
                    temp.add(i);
                }
            } else {
                if (num == 1) {
                    temp.add(i);
                }
            }
        }
        return temp;
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
    public String median() {
        ArrayList<Double> temp = list;
        Collections.sort(temp);
        if (temp.size()%2 == 0) {
            return Double.toString(temp.get(temp.size()/2)) + ", " + Double.toString(temp.get((temp.size()/2) + 1));
        } else {
            return Double.toString(temp.get(temp.size()/2));
        }
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
