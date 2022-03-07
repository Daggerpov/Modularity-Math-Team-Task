import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Calculations implements TeamTask {

    public Scanner sc = new Scanner(System.in);
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
        return this.list;
    }

    //Milos
    public double mean() {
        return (sum()/this.list.size());
    }
    //Milos
    public double mode() {
        return 0.0;
    }   
    //Milos
    public boolean search() {
        System.out.println("Enter the number you want to find: ");
        double searchNum = sc.nextDouble();
        if (list.indexOf(searchNum) >= 0) {
            return true;
        } else {
            return false;
        }
    }


    //Milos
    public double range() {
        return 0.0;
    }
    //Milos
    public double randNum() {
        Random rand = new Random();
        int int_random = rand.nextInt(this.list.size() );
        double random_num_list = this.list.get(int_random);
        return random_num_list;
    }
    //Danial
    public double max() {
        ArrayList<Double> temp = new ArrayList<Double>();
        temp.addAll(this.list);

        Collections.sort(temp);
        return temp.get(temp.size() - 1);
    }
    //Danial
    public double min() {
        ArrayList<Double> temp = new ArrayList<Double>();
        temp.addAll(this.list);

        Collections.sort(temp);
        return temp.get(0);
    }
    //Danial
    public ArrayList<Double> sortAsc() {
        ArrayList<Double> temp = new ArrayList<Double>();
        temp.addAll(this.list);

        Collections.sort(temp);
        return temp;
    }
    //Danial
    public ArrayList<Double> sortDesc() {
        ArrayList<Double> temp = new ArrayList<Double>();
        temp.addAll(this.list);

        Collections.sort(temp, Collections.reverseOrder());
        return temp;
    }
    //Danial
    public ArrayList<Double> evenOdd() {

        int num;
        while (true) {
            System.out.println("Type 1 to print all odd numbers and 2 to print even numbers: ");
            num = sc.nextInt();
            if (num == 1 || num == 2) {
                break;
            }
        }

        ArrayList<Double> temp = new ArrayList<Double>();

        for (double i : this.list) {
            if (num == 1 && i % 2 != 0) {
                temp.add(i);
            } else if (num == 2 && i % 2 == 0) {
                temp.add(i);
            }
        }
        return temp;
    }

    //Stephen
    public ArrayList<Double> factorial() {
        ArrayList<Double> temp = new ArrayList<Double>();

        double fact = 1.0;
        for (double d : this.list) {
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
        for (Double d : this.list) {
            sum += d;
        }
        return sum;
    }
    //Stephen
    public ArrayList<Double> powerOf() {
        ArrayList<Double> temp = new ArrayList<Double>();

        System.out.println("What exponent should be applied to the numbers?");
        double num = sc.nextDouble();
        for (double d : this.list) {
            temp.add(Math.pow(d, num)); 
        }
        return temp;
    }
    //Stephen
    public String median() {
        ArrayList<Double> temp = new ArrayList<Double>();
        temp.addAll(this.list);

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
		int n = this.arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (this.arr[j] > this.arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    double temp = this.arr[j];
                    this.arr[j] = arr[j+1];
                    this.arr[j+1] = temp;
                }
		return arrayToArrayList(this.arr);
    }
    public ArrayList<Double> selectionSort() {
        int n = this.arr.length;
  
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (this.arr[j] < this.arr[min_idx])
                    min_idx = j;
  
            // Swap the found minimum element with the first
            // element
            double temp = arr[min_idx];
            this.arr[min_idx] = arr[i];
            this.arr[i] = temp;
        }
		return arrayToArrayList(this.arr);
    }
    public ArrayList<Double> insertionSort() {
        int n = this.arr.length;
        for (int i = 1; i < n; ++i) {
            double key = this.arr[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && this.arr[j] > key) {
                this.arr[j + 1] = this.arr[j];
                j = j - 1;
            }
            this.arr[j + 1] = key;
        }
		return arrayToArrayList(this.arr);
    }
    // public ArrayList<Double> quickSort() {
    //     return list;
    // }
    // public ArrayList<Double> mergeSort() {
    //     return list;
    // }
    // public ArrayList<Double> heapSort() {
    //     return list;
    // }
    
}
