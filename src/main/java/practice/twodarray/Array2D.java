package practice.twodarray;

public class Array2D {

    public static void main(String[] args) {
        Array2D a = new Array2D();

        //1. 2차원 배열의 크기가 같다.
        int[][] grid = new int[3][4];
        System.out.println("===1번===");
        a.print(grid);
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
