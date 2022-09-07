import java.util.Arrays;
import java.util.Scanner;

public class VendingMachine {
    public static int[] money={1, 5, 10, 25, 50, 100};
    public static int[] rest=new int[6];
    public static int[] computeChange(double sum, double price){


        int change= (int) ((sum-price)*100);
        for( int i=5; i>=0;i--)
        {
            rest[i]=change/money[i];
            change=change%money[i];
        }
        return rest;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce your money: ");
        double sum = in.nextDouble();
        System.out.print("Introduce price: ");
        double price = in.nextDouble();
        in.close();
        if(sum<price)
            System.out.println("You don't have money!");
        else System.out.println("Your change is: " + Arrays.toString(computeChange(sum, price)));
    }

}