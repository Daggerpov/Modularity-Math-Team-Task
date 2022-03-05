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

        exit = true;

        Calculations calculations = new Calculations(list);

        while(exit) {
            System.out.println("What do you want to do? Type '0' to exit: ");
            System.out.println("1. Get list\n2. Get mean\n3. Get mode\n4. Get median\n5. Get max\n6. Get min\n7. Get range\n8. Find if a number exists\n9. Get the factiorial of each int\n10. Get the sum of the list\n11. Get a random value from the list\n12. Take power of each number\n13. Find all even or odd numbers\n14. Sort by ascending\n15. Sort by descending\n16. Bubble sort\n17. Selection sort\n18. Insertion sort\n19. Quick sort\n20. Merge sort\n21. Heap sort");
            int num = sc.nextInt();
            switch(num) {
                case 0:
                    exit = false;
                    break;
                case 1:
                    System.out.println(calculations.getList());
                    break;
                case 2:
                    System.out.println(calculations.mean());
                    break;
                case 3:
                    System.out.println(calculations.mode());
                    break;
                case 4:
                    System.out.println(calculations.median());
                    break;
                case 5:
                    System.out.println(calculations.max());
                    break;
                case 6:
                    System.out.println(calculations.min());
                    break;
                case 7:
                    System.out.println(calculations.range());
                    break;
                case 8:
                    System.out.println(calculations.search());
                    break;
                case 9:
                    System.out.println(calculations.factorial());
                    break;
                case 10:
                    System.out.println(calculations.sum());
                    break;
                case 11:
                    System.out.println(calculations.randNum());
                    break;
                case 12:
                    System.out.println(calculations.powerOf());
                    break;
                case 13:
                    System.out.println(calculations.evenOdd());
                    break;
                case 14:
                    System.out.println(calculations.sortAsc());
                    break;
                case 15:
                    System.out.println(calculations.sortDesc());
                    break;
                case 16:
                    System.out.println(calculations.bubbleSort());
                    break;
                case 17:
                    System.out.println(calculations.selectionSort());
                    break;
                case 18:
                    System.out.println(calculations.insertionSort());
                    break;
                case 19:
                    System.out.println(calculations.quickSort());
                    break;
                case 20:
                    System.out.println(calculations.mergeSort());
                    break;
                case 21:
                    System.out.println(calculations.heapSort());
                    break;
                default:
                    System.out.println("Please enter a valid");
            }
        }

        sc.close();

    }
    
}
