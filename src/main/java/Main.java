import dfs_bfs.*;
import time.TimeCheck;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TimeCheck.start();


        //--------- Solution 호출 -----------

        int answer = 미로_탈출.execute();
        System.out.println("answer = " + answer);

        //---------- Solution 호출 끝 -------------


        TimeCheck.end();
    }
}
