package Lab2;

import java.util.Scanner;

public class Basicjava2 {

    public static void main (String[] args) {
        //input data from keboard

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Your name is "+name);

        System.out.print("Enter your Tel: ");
        String Tel = sc.nextLine();
        System.out.println("your Tel is: "+Tel);

        System.out.print("Enter your Email: ");
        String Email = sc.nextLine();
        System.out.println("your Email is: "+Email);


    }//main






}//class
