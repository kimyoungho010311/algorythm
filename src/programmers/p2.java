package programmers;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        String a = new Scanner(System.in).next();
        char A;
        String result = "";
        for (int i =0;i<a.length();i++){
            A = a.charAt(i);
            if (Character.isUpperCase(A)){
                result += Character.toLowerCase(A);
            }
            else{
                result += Character.toUpperCase(A);
            }
        }
        System.out.println(result);
    }
}
