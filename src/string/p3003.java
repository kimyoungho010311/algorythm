package string;
import java.util.Scanner;

public class p3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ches = {1, 1, 2, 2, 2, 8};
        String[] input = sc.nextLine().split(" ");
        for (int i = 0; i < ches.length; i++) {
            System.out.print((ches[i] - Integer.parseInt(input[i])) + " ");
        }
    }
}