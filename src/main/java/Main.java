import greedy.거스름돈;
import greedy.숫자_카드_게임;
import greedy.숫자가_1이_될_때까지;
import greedy.큰_수의_법칙;
import implementation.게임_개발;
import implementation.상하좌우;
import implementation.시각;
import implementation.왕실의_나이트;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //--------- 입력 로직 ------------
        Scanner scn = new Scanner(System.in);

        System.out.println("Input");

        int mapHieght = scn.nextInt();
        int mapWidth = scn.nextInt();

        int[][] map = new int[mapHieght][mapWidth];

        scn.nextLine();

        int positionA = scn.nextInt();
        int positionB = scn.nextInt();
        int lookingSide = scn.nextInt();

        scn.nextLine();

        for (int i = 0; i < mapHieght; i++) {
            for (int u = 0; u < mapWidth; u++) {
                map[i][u] = scn.nextInt();
            }
            scn.nextLine();
        }

        //------------------------------------

        TimeCheck.start();


        //--------- Solution 호출 -----------

        int answer = 게임_개발.solution2(mapHieght, mapWidth, map, positionA, positionB, lookingSide);
        System.out.println("answer = " + answer);

        //------------------------------------


        TimeCheck.end();
    }
}
