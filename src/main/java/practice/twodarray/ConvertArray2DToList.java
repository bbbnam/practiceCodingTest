package practice.twodarray;

import java.util.ArrayList;
import java.util.List;

public class ConvertArray2DToList {

    public static void main(String[] args) {
        int[][] A = {{1,2,3},
                     {4,5,6,10,11},
                     {7,8,9,20}};
        
        //1. 2dArray => list
        List<List<Integer>> list = convert(A);
        //System.out.println(list);
        
        //2. list => 2dArray
        int[][] arr2 = convert2(list);
        print(arr2);
    }

    //1. 2dArray => list
    private static List<List<Integer>> convert(int[][] array2d) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < array2d.length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < array2d[i].length; j++) {
                list.add(array2d[i][j]);
            }
            result.add(list);
        }
        return result;
    }

    //2. list => 2dArray
    private static int[][] convert2(List<List<Integer>> list) {
        int[][] result = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            result[i] = new int[list.get(i).size()];
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = list.get(i).get(j);
            }
        }
        return result;
    }

    private static void print(int[][] array2d) {
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.print(" a["+i+"]["+j+"]" + array2d[i][j]);
            }
            System.out.println("");
        }
    }
}
