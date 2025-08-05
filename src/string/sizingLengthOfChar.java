package string;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class sizingLengthOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<String> itemList = Arrays.asList(s.split(""));
        System.out.println(itemList.size());
    }
}
