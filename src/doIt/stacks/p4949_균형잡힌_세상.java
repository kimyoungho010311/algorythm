package doIt.stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class p4949_균형잡힌_세상 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.nextLine();
            if (input.equals(".")) break;

            Stack<Character> stack = new Stack<Character>();
            boolean balance = true;

            for (char c : input.toCharArray()) {
                if (c == '(' || c == '[') stack.push(c);
                else if (c == ')'){
                    if (stack.isEmpty() || stack.pop() != '('){
                        balance = false;
                        break;
                    }
                }
                else if (c == ']'){
                    if (stack.isEmpty() || stack.pop() != '['){
                        balance = false;
                        break;
                    }
                }
            }

            if(!stack.isEmpty()) balance = false;

            System.out.println(balance ? "yes" : "no");


        }
    }
}
