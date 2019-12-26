package Lab3;

import java.util.Scanner;

public class Loop3 {
    public static void  main(String[]args) {

        Scanner sc =new Scanner(System.in);
        int x=1;


        while ( (x!=0)) {
            System.out.print("Enter integer:");
            x = sc.nextInt();
        }
        System.out.print("Good bey");
    }

}
