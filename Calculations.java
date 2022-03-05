import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.Scanner;
import java.lang.Math;

import java.util.Arrays;
import java.util.List;

public class Calculations implements TeamTask {

    private ArrayList<Double> list;
	private Double[] arr;

	public Calculations(ArrayList<Double> l) {
        list = l;
		// converting array list to regular array to use java sorting algorithms
		arr = new Double[getList().size()];
	  	
		// ArrayList to Array Conversion
		for (int i = 0; i < (list.size()); i++){
			arr[i] = list.get(i);
		}
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
    public ArrayList<Double> factorial() {
        ArrayList<Double> temp = new ArrayList<Double>();
        double fact = 1.0;
        for (double d : list) {
            fact = 1.0;
            for (int i = 1; i <= (int) Math.round(d); i++) {
                fact *= (double) i;
            }
            temp.add(fact);
        }
        return temp;
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
    public ArrayList<Double> powerOf() {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> temp = new ArrayList<Double>();
        System.out.println("What exponent should be applied to the numbers?");
        double num = input.nextDouble();
        input.close();
        for (double d : list) {
            temp.add(Math.pow(d, num)); 
        }
        return temp;
    }
    //Stephen
    public String median() {
        ArrayList<Double> temp = list;
        Collections.sort(temp);
        if (temp.size()%2 == 0) {
            return Double.toString(temp.get(temp.size()/2 - 1)) + ", " + Double.toString(temp.get((temp.size()/2)));
        } else {
            return Double.toString(temp.get(temp.size()/2));
        }
    }

	//helper method to convert list to ArrayList so we can return them in that format
	private static ArrayList<Double> arrayToArrayList(Double [] arr) {
		return new ArrayList<>(Arrays.asList(arr));
	}
	
	
	//Sorting can be ascending and descending


	
    //Daniel does these:
    public ArrayList<Double> bubbleSort() {
		int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
		return arrayToArrayList(arr);
    }
    public ArrayList<Double> selectionSort() {
        int n = arr.length;
  
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
  
            // Swap the found minimum element with the first
            // element
            double temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
		return arrayToArrayList(arr);
    }
    public ArrayList<Double> insertionSort() {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            double key = arr[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
		return arrayToArrayList(arr);
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
