import combination.조합_경우의_수;
import combination.조합_구하기;

import java.io.*;
import java.util.*;

/*
 * [해결 Point]
 *
 */

public class Main {



  public static void main(String[] ags) throws Exception {
    int[] numAry = {1, 2, 3};
    boolean[] visited = new boolean[numAry.length];
    조합_구하기 s = new 조합_구하기();

    s.getCombination(numAry, visited, 0, 3, 2);

  }

}