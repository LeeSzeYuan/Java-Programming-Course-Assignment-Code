// Lee Sze Yuan
// A19EC0068
// Section 02

import java.util.*;
import static java.lang.Math.pow;

class Freezer{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double T;
        int t; 

        System.out.print("Please enter the elapsed time(in hour): ");
        t = sc.nextInt();

        if (t < 0){
            System.out.println("Please enter a value greater than 0 for hour!");
            System.exit(0);
        }

        T = (4 * pow(t, 2))/(t + 2) - 20;
        String result = String.format("%.2f", T);

        System.out.println("The temperature is " + result + " 'C");

        sc.close();
    }
}
