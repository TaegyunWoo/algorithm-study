import dfs_bfs.DFS_MatrixGraph;

public class Main {
    public static void main(String[] args) {
        //--------- 입력 로직 ------------


        //---------- 입력 로직 끝 -----------------

        TimeCheck.start();


        //--------- Solution 호출 -----------

        DFS_MatrixGraph.execute();

        //---------- Solution 호출 끝 -------------


        TimeCheck.end();
    }
}
