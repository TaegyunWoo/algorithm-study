import greedy.거스름돈;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //입력
        Scanner scn = new Scanner(System.in);
        System.out.print("input: ");
        int input = scn.nextInt();

        TimeCheck.start();

        int answer = 거스름돈.solution(input);
        System.out.println("answer = " + answer);

        TimeCheck.end();
    }
}
