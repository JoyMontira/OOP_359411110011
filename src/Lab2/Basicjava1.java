package Lab2;

public class Basicjava1 {

    public static void main(String[] args) {
       //variables
       //integer - จำนวนเต็ม
       int x;
       x =10;
       System.out.println(x);
       int y = -100;
       System.out.println(y);
       int z = x+y; // z=?
        System.out.println(z);

        //floating - จำนวนจริง ตัวเลขที่ทศนิยม
        //float , double
        float n = 10.10f;
        System.out.println(n);
        double d = 50.55;
        System.out.println(d);
        System.out.println(n*d);

        //character ตัวอักษร 1 อัขระ เท่านั้น
        char c = '#';
        System.out.println(c);

        //String ข้อความ คือตัวอักษรที่เรียงต่อกันตั้งแต่ 2 ตัวขึ้นไป
        //String เป็นคลาสใน Java ดังนั้นการประกาศตัวแปรคือการสร้าง object ของคลาส
        String s = "Montira Kliengtapong";
        System.out.println(s);
        int count = s.length();
        System.out.println(count);
        System.out.println(s.length());
        System.out.println(s.toUpperCase());

        //concatination String การต่อ String
        String myAdsress = "@SAIYAI";
        String msg = s +" "+ myAdsress;  //msg = ?

        System.out.println(msg);
        System.out.println(s.concat(" "+myAdsress));

        //Boolean ข้อมูลที่เป็นประเภทจริง (true) และ เท็จ (false)
        boolean b = true;
        boolean r = false;
        System.out.println(b+" "+r);






    } //main



}//class
