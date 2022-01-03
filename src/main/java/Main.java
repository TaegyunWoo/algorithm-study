import greedy.거스름돈;
import greedy.숫자_카드_게임;
import greedy.큰_수의_법칙;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //--------- 입력 로직 ------------
        Scanner scn = new Scanner(System.in);

        System.out.println("Input");

        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];

        scn.nextLine();

        for (int i = 0; i < n; i++) {
            for (int u = 0; u < m; u++) {
                arr[i][u] = scn.nextInt();
            }
        }

        //------------------------------------

        TimeCheck.start();


        //--------- Solution 호출 ------------

        int answer = 숫자_카드_게임.solution1(n, m, arr);
        System.out.println("answer = " + answer);

        //------------------------------------


        TimeCheck.end();
    }
}
