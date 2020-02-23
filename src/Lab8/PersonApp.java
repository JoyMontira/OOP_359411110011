package Lab8;

public class PersonApp {
    public static void main (String[] args){
        //create objects
        Person P1 = new Person("1111111111111",
                "Montira Kliengtapong",
                "09/09/1997");
        System.out.println(P1.toString());

        Student S1 = new Student("2222222222222",
                "Nudchanad Sansom",
                "15/03/1997",
                "STD025","Information System");

        S1.running();
        S1.addSubject();
        //P1.addSubject();
        // object ของ super-class ไม่สามารถเรียกใช้ method ของ sub-class
    }


}
