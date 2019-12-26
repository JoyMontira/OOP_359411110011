package Lab4;

public class Array1 {

    public static void main (String[] args){

        int X[] =new int[5];
        X[0] = 10;
        X[2] = X[0] * 2;
        X[3] = X[1]+100*2;

        System.out.println(0);

        System.out.println(X[0]);
        System.out.println(X[1]);
        System.out.println(X[2]);
        System.out.println(X[3]);
        System.out.println(X[4]);

        showArray(X);
        showArrayEach(X);
    }

    private static void showArrayEach(int[] x) {
        System.out.print("Each data in array: ");
        for (int val:x)
            System.out.println();
    }


    private static void showArray(int[] x) {
        System.out.print("Data in array: ");
        for (int i = 0; i < x.length ; i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
    }

}
