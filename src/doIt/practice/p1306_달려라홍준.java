package doIt.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1306_달려라홍준 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken()); // 월세 내기 전까지 날
        int M = Integer.parseInt(st.nextToken()); // 일할 수 있는 날

        long[] T = new long[N]; // 급여 리스트
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) T[i] = Long.parseLong(st.nextToken());

        long sum = 0;
        for (int i = 0; i < M; i++) sum += T[i];
        long max_sal = sum;

        for (int i = M; i < N; i++){
            sum += T[i] - T[i-M];
            if (sum > max_sal) max_sal = sum;
        }

        System.out.println(max_sal);
    }
}
