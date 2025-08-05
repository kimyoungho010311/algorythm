package doIt.stacks;

import java.util.Scanner;
import java.util.*;

public class p9012_괄호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String input = sc.next();
            Stack<Character> stack = new Stack<>();
            boolean isValid = true;

            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == '(') stack.push('(');
                else if (input.charAt(j) == ')') {
                    if (stack.isEmpty()) {
                        isValid = false;
                        break;}
                } stack.pop();
            }
            if (!stack.isEmpty()) isValid = false;
            System.out.println(isValid ? "YES" : "NO");
            stack.clear();
        }
    }
}
