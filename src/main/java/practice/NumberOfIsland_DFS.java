package practice;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIsland_DFS {

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '1', '1'}};
        NumberOfIsland_DFS dfs = new NumberOfIsland_DFS();
        int count = dfs.solution(grid);
        System.out.println("count : "+ count);
    }
    int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    int m, n;

    private int solution(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        m = grid.length;    //4
        n = grid[0].length; //5
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int x, int y) {
       // error check
       if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] != '1') {
            return;
       }
       grid[x][y] = 'X'; //visited

       for (int[] dir : dirs) {
           dfs(grid, x + dir[0], y + dir[1]);
       }
    }
}
