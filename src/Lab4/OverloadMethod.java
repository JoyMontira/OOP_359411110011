package Lab4;

import java.util.Scanner;

public class OverloadMethod {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println(plus(10,20));
        System.out.println(plus(10.0,20.0));
        System.out.println(plus(10.0,20));


    }
    public static int plus (int x,int y){
        return x+y;
    }
    public static double plus (double x, double y){
        return x+y;
    }
}
