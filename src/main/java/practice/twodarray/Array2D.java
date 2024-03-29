package practice.twodarray;

public class Array2D {

    public static void main(String[] args) {
        Array2D a = new Array2D();

        //1. 2차원 배열의 크기가 같다.
        int[][] grid = new int[3][4];
        System.out.println("===1번===");
        a.print(grid);
        grid[0][1] = 10;
        System.out.println("=== after ===");
        a.print(grid);

        //2. 2차원 배열 크기가 다른경우
        int[][] grid2 = new int[3][];
        grid2[0] = new int[1];
        grid2[1] = new int[2];
        grid2[2] = new int[7];
        System.out.println("===2번 =====");
        a.print(grid2);

        //3. 직접 넣어주기
        int[][] grid3 = {{1,2},
                        {2,3},
                        {3,5}};
        System.out.println("==== 3번 ===");
        a.print(grid3);
    }

    private void print(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print("["+i+"]["+j+"]"+grid[i][j]+" ");
            }
            System.out.println();
        }
    }
}
