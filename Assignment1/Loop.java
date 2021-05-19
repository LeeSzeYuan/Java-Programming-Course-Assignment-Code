// Lee Sze Yuan
// A19EC0068
// Section 02

import java.util.*;

class Loop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double value, sum = 0;
        char ans;
        boolean cont = true;

        while(cont == true){
            System.out.print("Please enter a value: ");
            value = sc.nextInt();

            sum += value;

            System.out.print("Do you want to continue? [1-yes, 0-No]: ");
            ans = sc.next().charAt(0);

            if (ans != '1' && ans != '0'){
                System.out.println("Please enter a value of 0 or 1!");
                System.exit(0);
            }

            cont = (ans == '1');
        }

        System.out.println("\nThe sum is " + sum);
        sc.close();
    }
}