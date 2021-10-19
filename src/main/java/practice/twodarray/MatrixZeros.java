package practice.twodarray;

import java.util.HashSet;
import java.util.Set;

/*
주어진 행렬 m * n. 요소가 0이면 전체 행과 열을 0으로 설정합니다.

1 1 1         1 0 1
1 0 1    =>   0 0 0
1 1 1         1 0 1

1. 생각
2. 0의 위치를 알아내야 함 (좌표값)
3. 그 좌표에서 row가 1 column이 1인 녀석들을 다 바꿔주면 됨

고유한 좌표값 저장 -> Hashset사용
*/
public class MatrixZeros {
    public static void main(String[] args) {
        int[][] grid = {{1,1,1},
                        {1,0,1,1},
                        {1,1,1}};
        new MatrixZeros().solve(grid);
    }

    private void solve(int[][] grid) {
        print(grid);

        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0) {
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (rowSet.contains(i) || colSet.contains(j)) {
                    grid[i][j] = 0;
                }
            }
        }
        System.out.println("==============================="+System.lineSeparator());
        print(grid);
    }

    private void print(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print("["+i+"]["+j+"]"+grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
