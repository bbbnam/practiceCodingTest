package practice;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIsland_BFS {

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '1', '1'}};
        NumberOfIsland_BFS bfs = new NumberOfIsland_BFS();
        int count = bfs.solution(grid);
        System.out.println("count : "+ count);
    }
    int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    int m, n;

    private int solution(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        m = grid.length;    //4
        n = grid[0].length; //5
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    bfs(grid, i, j);
                }
            }
        }
        return count;
    }

    private void bfs(char[][] grid, int x, int y) {
        grid[x][y] = 'X'; //visited 대용으로 일단 X표시 해둠
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x, y}); // 0,0

        while (!queue.isEmpty()) { //큐에 값이 있으면..
            int[] cur = queue.poll(); //현재값을 뽑아서

            for (int[] dir : dirs) { //방향대로 사방으로 돌려서 확인할 것임
                int findX = cur[0] + dir[0]; //x좌표
                int findY = cur[1] + dir[1]; //y좌표

                System.out.println("x>>"+findX + "< y>"+findY);
                if (findX >= 0 && findY >= 0 && findX < m && findY < n && grid[findX][findY] == '1') {
                    grid[findX][findY] = 'X';
                    queue.offer(new int[] {findX, findY});
                }
            }
        }
    }
}
