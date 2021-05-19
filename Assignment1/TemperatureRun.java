import java.util.*;

class Temperature{
    static int counTemp = 0;
    double degrees; //celcius

    public Temperature() {
        degrees = 0;
        counTemp++;
    }

    public Temperature(double d) {
        degrees = d;
        counTemp++;
    }

    public double getDegrees() {
        return degrees;
    }

    public void setDegrees(double d) {
        degrees = d;
    }

    public int getCounts() {
        return counTemp;
    }

    public void setCounts(int count) {
        counTemp = count;
    }

    public String toString() {
        return ("temperature is " + getDegrees() + " 'C");
    }

    public boolean equals(Temperature t) {
        double temp = t.getDegrees();
        return this.degrees == temp;
    }
}

class TemperatureRun{
    public static double convertToCelcius(double f){
        double c = (f - 32)*(5.0/9.0);
        return c;
    }

    public static double convertToFahrenheit(double c){
        double f = (c * (9.0/5.0)) + 32;
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temp;
        char ans;
        Temperature temp1, temp2 = new Temperature(30);

        System.out.print("Do you want to enter value in celcius or fahrenheit for 1st temperature: [1-Fahrenheit, 2-Celcius]: ");
        ans = sc.next().charAt(0);

        if (ans != '1' && ans != '2') {
            System.out.println("Please enter a value of 1 or 2!");
            System.exit(0);
        }

        if (ans == '1') {
            System.out.print("Temeprature[Fahrenheit, 'F]: ");
            temp = sc.nextDouble();
            temp1 = new Temperature(convertToCelcius(temp));
        }else {
            System.out.print("Temeprature[Celcius, 'C]: ");
            temp = sc.nextDouble();
            temp1 = new Temperature(temp);
        }

        System.out.println("\nIn Degree Celcius");
        System.out.println("1st " + temp1);
        System.out.println("2nd " + temp2);

        System.out.println("\nIn Degree Fahrenheit");
        System.out.println("1st temperature is " + convertToFahrenheit(temp1.getDegrees()) + " 'F");
        System.out.println("2nd temperature is " + convertToFahrenheit(temp2.getDegrees()) + " 'F");

        if (temp1.equals(temp2)) {
            System.out.println("\nThe 1st Temperature is same as the 2nd Temperature");
        }else{
            System.out.println("\nThe 1st Temperature is different with the 2nd Temperature");
        }


        System.out.println("\nThe total number of temperatures created in this code is " + temp1.getCounts());

        sc.close();
    }
}
