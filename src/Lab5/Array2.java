package Lab5;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x[] = new int[5]; //index 0-4
        //input data from user
        for (int i = 0; i < x.length; i++) {
            System.out.print("Enter an integer: ");
            x[i] = sc.nextInt();
        }
        showDataArray(x);
        //display data in array
    }
    private static void showDataArray ( int[] x){
        System.out.println("Data in array:");
        for (int val : x) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
