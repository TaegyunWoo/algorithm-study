import greedy.거스름돈;
import greedy.숫자_카드_게임;
import greedy.숫자가_1이_될_때까지;
import greedy.큰_수의_법칙;
import implementation.상하좌우;
import implementation.시각;
import implementation.왕실의_나이트;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //--------- 입력 로직 ------------
        Scanner scn = new Scanner(System.in);

        System.out.println("Input");

        String[] s = scn.nextLine().split("");

        int row = Integer.parseInt(s[1]);
        char col = Character.valueOf(s[0].charAt(0));

        //------------------------------------

        TimeCheck.start();


        //--------- Solution 호출 ------------

        int answer = 왕실의_나이트.solution1(row, col);
        System.out.println("answer = " + answer);

        //------------------------------------


        TimeCheck.end();
    }
}
