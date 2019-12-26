package Lab3;

import java.util.Scanner;

public class Control2 {

    public static void  main(String[]args) {
        int x=10;
        if ((x/2) > 5) {
            System.out.println("x more than 5.");
        } else {
            System.out.println("x less than 5.");
        }
        Scanner sc =new Scanner(System.in);
        System.out.print("How old are you?:");
        int age = sc.nextInt();

        if ((age>50)){
            System.out.println("you are old");
        }else {
            System.out.println("You are young");
        }
    }


}
