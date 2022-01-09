import dfs_bfs.BFS_ListGraph;
import dfs_bfs.BFS_MatrixGraph;
import dfs_bfs.DFS_ListGraph;
import dfs_bfs.DFS_MatrixGraph;

public class Main {
    public static void main(String[] args) {
        //--------- 입력 로직 ------------


        //---------- 입력 로직 끝 -----------------

        TimeCheck.start();


        //--------- Solution 호출 -----------

        BFS_MatrixGraph.execute();

        //---------- Solution 호출 끝 -------------


        TimeCheck.end();
    }
}
