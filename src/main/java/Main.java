import greedy.거스름돈;
import greedy.숫자_카드_게임;
import greedy.숫자가_1이_될_때까지;
import greedy.큰_수의_법칙;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //--------- 입력 로직 ------------
        Scanner scn = new Scanner(System.in);

        System.out.println("Input");

        int n = scn.nextInt();
        int k = scn.nextInt();

        scn.nextLine();

        //------------------------------------

        TimeCheck.start();


        //--------- Solution 호출 ------------

        int answer = 숫자가_1이_될_때까지.solution1(n, k);
        System.out.println("answer = " + answer);

        //------------------------------------


        TimeCheck.end();
    }
}
