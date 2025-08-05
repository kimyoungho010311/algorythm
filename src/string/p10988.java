package string;

import java.util.Scanner;

public class p10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String reversedStr = new StringBuffer(str).reverse().toString();
        if(str.equals(reversedStr)){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
