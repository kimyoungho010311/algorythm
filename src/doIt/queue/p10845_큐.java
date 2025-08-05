package doIt.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p10845_큐 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String command = sc.nextLine();
            String[] commands = command.split(" ");

            switch (commands[0]) {
                case "push":
                    queue.add(Integer.parseInt(commands[1]));
                    break;
                case "pop":
                    if (!queue.isEmpty()) sb.append(queue.poll()).append("\n");
                    else  sb.append("-1\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    if (!queue.isEmpty()) sb.append(queue.peek()).append("\n");
                    else sb.append("-1\n");
                    break;
                case "back":
                    if (!queue.isEmpty()) sb.append(((LinkedList<Integer>) queue).getLast()).append("\n");
                    else sb.append("-1\n");
                    break;
            }
        }
        System.out.print(sb);
        }
    }
