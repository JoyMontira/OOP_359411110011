package Lab4;

public class Methodl {
    public static void main (String[] args) {
        System.out.println("Hello from Main method");
        //calling method
        A();
        System.out.println("Hello from Main method 2");
        A();
        A();
        B("JOY");
        String myName = C("Montira","Kliengtapong");
        System.out.println(myName);
        //2.
        System.out.println(C("Montira","Kliengtapong"));
    }

    // Method type 1: no parameter, no return value
    public static void A () {
        System.out.println("Hello from A method");
    }
    // Method type2: 1 or more parameters, n return value
    public static void B (String msg){
        System.out.println("Hello from A method."+msg);
    }
    // Method type3: 1 or more parameters, n return value
    public static String C(String fName,String Lname){
        System.out.println("Hello from C method.");
        String myName = fName + " " + Lname;

        return myName;
    }

}//class
