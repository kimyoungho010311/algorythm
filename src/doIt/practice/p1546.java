package doIt.practice;

import java.util.Scanner;

public class p1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] arr = new double[N];
        double Max = 0;
        int sum = 0;
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] =  sc.nextInt();
            sum += arr[i];
            if (arr[i] > Max) {
                Max = arr[i];
            }
        }
        double result = sum * 100 / Max / N;
        System.out.println(result);
    }
}
