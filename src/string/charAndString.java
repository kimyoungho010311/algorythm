package string;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class charAndString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int num = sc.nextInt();
        List<String> itemList = Arrays.asList(s.split(""));

        System.out.println(itemList.get(num-1));
    }
}
