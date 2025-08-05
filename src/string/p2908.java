package string;

import java.util.Scanner;

public class p2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int reversedNum1 = Integer.parseInt(new StringBuilder(num1+"").reverse().toString());
        int reversedNum2 = Integer.parseInt(new StringBuilder(num2+"").reverse().toString());

        if (reversedNum1 > reversedNum2){
            System.out.println(reversedNum1);
        }
        else{
            System.out.println(reversedNum2);
        }
    }
}
