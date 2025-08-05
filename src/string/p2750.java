package string;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class p2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[sc.nextInt()];
        for (int i = 0; i < a.length; a[i++] = sc.nextInt());
        Arrays.sort(a);
        for (int i : a) System.out.println(i);

    }

}
