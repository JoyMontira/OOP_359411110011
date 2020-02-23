package Lab6;

import java.util.StringTokenizer;

public class ExstringToken {
    public static void main(String[] args) {

        StringTokenizer tokenizer = new StringTokenizer("I live in thungsong");

        System.out.println(tokenizer.countTokens());

        while (tokenizer.hasMoreElements()) {
            System.out.println(tokenizer.nextToken());
            //สลับตัวอัการแต่ละคำโดยใช้ StringBuilder
            StringBuilder str = new StringBuilder(tokenizer.nextToken());
            System.out.println(str.reverse());

        }
    }
}