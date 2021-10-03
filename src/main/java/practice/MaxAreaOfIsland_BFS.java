package practice;

import java.util.LinkedList;
import java.util.Queue;

public class MaxAreaOfIsland_BFS {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 0, 1, 1, 0},
                {1, 1, 0, 0, 1},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 0, 1},
                {1, 1, 1, 0, 0}
        };
        MaxAreaOfIsland_BFS bfs = new MaxAreaOfIsland_BFS();
        int maxArea = bfs.solve(grid);
        System.out.println("max>>"+maxArea);
    }
    int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    int m = 0;
    int n = 0;

    private int solve(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        m = grid.length;   // 5
        n = grid[0].length;// 5
        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int area = bfs(grid, i, j);
                    max = Math.max(max, area);
                }
            }
        }

        return max;
    }

    private int bfs(int[][] grid, int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x, y});  //0, 0
        int area = 0;
        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            for (int[] dir : dirs) {
                int findX = point[0] + dir[0];
                int findY = point[1] + dir[1];
                if (findX >= 0 && findY >= 0 && findX < m && findY < n
                        && grid[findX][findY] == 1) {
                    grid[findX][findY] = 0;
                    queue.offer(new int[] {findX, findY});
                    area++;
                }
            }
        }

        return area;
    }
}
