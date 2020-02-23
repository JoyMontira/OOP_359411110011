package Lab5;


import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        //Array 2D
        // ใช้เลข index 2 ตัวในการระบุตำแหน่งของ Array แบบ [row] [column]
        Scanner sc = new Scanner(System.in);

        int x[][] = new int[2][3]; //ทุก block จะมีค่า ช 0

        //input data to array2D
        x[0][0] = 10;
        x[1][2] = 50;
        System.out.println(x[0][0]);
        System.out.println(x[0][1]);
        System.out.println(x[1][2]);

        //input data form user
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print("Enter an integer:");
                x[i][j] =sc.nextInt();

            }
        }
        showDataArray2D(x);
    }

    private static void showDataArray2D(int[][] x) {
        System.out.println();
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

    }
}
