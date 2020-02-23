package Lab7;

public class MobileStore {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("1001","Wiko", "Sunny 4 Plus", 2090.00, "Android 9 Go");

        System.out.println(m1.toString());

        //change price
        m1.setPrice(1500.00);
        System.out.println(m1.toString());
    }

}
