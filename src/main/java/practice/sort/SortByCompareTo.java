package practice.sort;

/*버전 번호를 version1 하고 version2, 비교한다

version1 < version2 반환 -1합니다
version1 > version2 반환 1합니다
그 외 0
*/

public class SortByCompareTo {
    public static void main(String[] args) {
        String version1 = "8.5.2.4";
        String version2 = "8.5.3";
        System.out.println(solve(version1, version2));
        //compareToTest();
    }

    public static void compareToTest() {
        Integer a = 1;
        Integer b = 3;
        System.out.println(a.compareTo(b)); // -1
    }

    private static int solve(String version1, String version2) {
        // 1
        String[] version1Array = version1.split("\\.");
        String[] version2Array = version2.split("\\.");

        int length = Math.max(version1Array.length, version2Array.length);
        for (int i = 0; i < length; i++) {
            Integer version1Integer = i < version1Array.length? Integer.parseInt(version1Array[i]) : 0;
            Integer version2Integer = i < version2Array.length? Integer.parseInt(version2Array[i]) : 0;

            int comp = version1Integer.compareTo(version2Integer);
            if (comp != 0) {
                return comp;
            }
        }
        return 0;
    }
}
