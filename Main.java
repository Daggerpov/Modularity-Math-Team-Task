import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Double> list = new ArrayList<Double>();
        boolean exit = true;

        while (exit) {
            System.out.print("Please enter a number. Type '0' to stop: ");
            double num = sc.nextDouble();
            if (num == 0) {
                break;
            } else {
                list.add(num);
            }
        }

        Calculations calculations = new Calculations(list);

		System.out.println(calculations.bubbleSort());
		System.out.println(calculations.selectionSort());
		System.out.println(calculations.insertionSort());
		

        System.out.println(calculations.max());
        System.out.println(calculations.min());
        System.out.println(calculations.sum());
        System.out.println(calculations.mean());
        System.out.println(calculations.median());
        System.out.println(calculations.factorial());
        System.out.println(calculations.powerOf());
        System.out.println(calculations.sortAsc());
        System.out.println(calculations.sortDesc());
        // System.out.println(calculations.evenOdd()); *DANIAL CHEKC THIS OUT, NOT SURE WHY IT BUGS*

        sc.close();

    }
    
}
