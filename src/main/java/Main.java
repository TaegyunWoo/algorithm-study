import greedy.거스름돈;
import greedy.큰_수의_법칙;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //입력
        Scanner scn = new Scanner(System.in);

        System.out.println("Input");

        int n = scn.nextInt();
        int m = scn.nextInt();
        int k = scn.nextInt();

        int[] arr = new int[n];

        scn.nextLine();

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        TimeCheck.start();

        int answer = 큰_수의_법칙.solution3(n, m, k, arr);
        System.out.println("answer = " + answer);

        TimeCheck.end();
    }
}
