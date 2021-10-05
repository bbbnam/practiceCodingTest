package practice;

public class NewStringTest {
    public static void main(String[] args) {
        String str1 = "original";
        String str2 = "add";

        StringBuilder sb = new StringBuilder();
        String addedByPlus = str1 + str2;
        String addedByBuilder = sb.append(str1).append(str2).toString();
        String concat = str1.concat(str2);
        String addedByPlus_new = str1 + str2;
        String str1_new = "original";

        System.out.println("==>>" + (addedByPlus == addedByBuilder));  //false
        System.out.println("==>>" + (addedByPlus == concat));          //false
        System.out.println("==>>" + (addedByPlus == addedByPlus_new)); //false 이게 다른 이유는 내부적으로 StringBuilder를 생성하기 때문
        System.out.println("==>>" + (str1 == str1_new));               //true 상수풀에서 같은 값 바라봄
        System.out.println("equals>>" + (addedByPlus.equals(addedByBuilder)));  // 문자열 자체는 같음
    }
}
