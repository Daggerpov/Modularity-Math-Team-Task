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

        System.out.println(calculations.getList());

        sc.close();

    }
    
}