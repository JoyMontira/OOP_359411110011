package Lab4;

import java.util.Scanner;

//เขียนโปรแกรมเพื่อรับจำนวนจริง 2 ค่า
//จากนั้นแสดงผล บวก ลบ คูณ หาร โดยการใช้ method
public class Method2 {
    public static void main (String[]args){
        Scanner SC = new Scanner(System.in);
        //inpud 2 real number
        System.out.print("Enter an number 1: ");
        double X = SC.nextDouble ();
        System.out.print("Enter an number 2: ");
        double Y = SC.nextDouble ();
        
        double Z = plus (X,Y);
        System.out.println(X+"+"+Y+"="+Z); //บวก

        double A = minus (X,Y);
        System.out.println(X+"-"+Y+"="+Z); //ลบ

        double B = times (X,Y);
        System.out.println(X+"*"+Y+"="+Z); //คูณ

        double C = divided (X,Y);
        System.out.println(X+"/"+Y+"="+Z); //หาร

    }

    private static double divided(double x, double y) {
        return x/y;
    }

    private static double times(double x, double y) {
        return x*y;
    }

    private static double minus(double x, double y) {
        return x-y;
    }

    private static double plus(double x, double y) {
        return x+y;
    }

}
