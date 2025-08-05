package doIt.stacks;

import java.util.Scanner;
import java.util.Stack;

public class p10773_제로 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int[] A = new int[K];
        int sum = 0;

        for (int i = 0; i < K; i++) A[i] = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < K; i++){
            if (A[i] != 0) stack.push(A[i]);
            else stack.pop();
        }
        for(int n : stack) sum += n;
        System.out.println(sum);
    }
}
