package Lab3;

import java.util.Scanner;

public class Control3 {
    public static void main (String[]args) {

        // if () {
        // คำสั่งเมื่อมีเงื่องไข 1 เป็นจริง
        // }else if (เงื่อนไข 2 );
        // คำสั่งเงื่อนไขที่ 2 เป็นจริง
        // }else if (เงื่อนไข 3 );
        // คำสั่งเงื่อนไขที่ 3 เป็นจริง
        // }else if (เงื่อนไข n );
        // คำสั่งเงื่อนไขที่ n เป็นจริง
        // }else {
        //คำสั่งการทำงานเมื่อทุกเงื่อนไขเป็นเท็จทั้งหมด;

        Scanner sc = new Scanner((System.in));
        System.out.print("How old are?:");
        int age = sc.nextInt();

        if (age > 50) {
            System.out.println("You are old.");
        }else if(age > 20) {
            System.out.println("You are teenager.");
        }else {
            System.out.println("You are young.");


        }

    }

}
