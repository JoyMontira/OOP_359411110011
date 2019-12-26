package Lab3;

import java.util.Scanner;

public class Loop2 {
    public static void  main(String[]args) {

        Scanner sc= new Scanner(System.in);
        int total = 0;
        for (int i = 0; i <5; i++) {
            System.out.print("enter an integer: ");
            total+= sc.nextInt();
        }
        System.out.println("The total value is:"+total);
        System.out.println("The average value is:"+total/5);
    }


}
