package doIt.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11660_구간합구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int quizNum = Integer.parseInt(st.nextToken());

//        System.out.println("M : " + M);
//        System.out.println("quizNum : " + quizNum);
        int [][] A = new int [M+1][M+1];
        int [][] D = new int [M+1][M+1];
        for (int i = 1; i< M+1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < M+1; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 1; i < M+1; i++) {
            for (int j = 1; j < M+1; j++) {
                D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i][j];
            }
        }

        for (int i = 1; i < quizNum+1; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

//            System.out.println("X1 : "+x1);
//            System.out.println("Y1 : "+y1);
//            System.out.println("X2 : "+x2);
//            System.out.println("Y2 : "+y2);
            System.out.println(D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1]);
        }
//        for (int i = 1; i < M+1; i++) {
//            for (int j = 1; j < M+1; j++) {
//                System.out.print(D[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
