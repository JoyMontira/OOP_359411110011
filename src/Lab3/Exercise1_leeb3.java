package Lab3;

import java.util.Scanner;

public class Exercise1_leeb3 {
    public static void  main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a real number x :");
        double x = sc.nextDouble();
        System.out.print("Enter a real number y :");
        double y = sc.nextDouble();


        if (x>y)
            System.out.println(x+"more than"+y);
        else
            System.out.println(y+"more than "+x);
    }

}
