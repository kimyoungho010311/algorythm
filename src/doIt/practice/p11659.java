package doIt.practice; // 패키지 이름 선언

import java.io.BufferedReader; // 빠른 입력을 위한 BufferedReader import
import java.io.IOException; // 입출력 예외 처리를 위한 IOException import
import java.io.InputStreamReader; // InputStreamReader import
import java.util.StringTokenizer; // 문자열을 공백 기준으로 나누기 위한 StringTokenizer import

public class p11659 { // 클래스 선언
    public static void main(String[] args) throws IOException { // main 메서드, IOException 처리 필요
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int SuNo = Integer.parseInt(st.nextToken());
        int quizNo = Integer.parseInt(st.nextToken());
        long[] S = new long[SuNo + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= SuNo; i++) {
            S[i] = S[i - 1] + Long.parseLong(st.nextToken());
        }
        for(int q = 0; q < quizNo; q++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(S[j] = S[i - 1]);
        }
    }
}
