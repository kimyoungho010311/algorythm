package string;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        
        int repeat = sc.nextInt();
        for (int i = 0; i < repeat; i++) {
            String s = sc.next();
            char first = s.charAt(0);
            char last = s.charAt(s.length() - 1);
            System.out.println("" + first + last);
        }
    }
}
