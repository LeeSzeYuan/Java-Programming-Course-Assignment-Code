

enum Day {SUNDAY}

class Output{
    static int a =5;
    public static void main(String args[]){
        int [][] number = new int[3][3];
        number[0][1]=20;

        int total=0;
        for (int i=0; i<number.length;i++)
            total+=number[i].length;

        System.out.println(total);
    }
}