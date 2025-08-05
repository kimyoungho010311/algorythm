package string;

import java.util.Scanner;

public class p2444 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();



        // 삼각형 코드 (정삼각형)
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = N - 2; i >= 0; i--) {
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
