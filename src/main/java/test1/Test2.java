package test1;

import java.util.Optional;

public class Test2 {

  public static void main(String[] args) {
    TestRequest request = null;

    // 코드리뷰 중
    // 이렇게 찍는게 맞는건지
    System.out.println("request : " + Optional.ofNullable(request).map(Object::toString));

    // 아니면 이렇게 찍는게 맞는건지
    System.out.println("request : " + Optional.ofNullable(request).map(Object::toString).orElse(null));

    /*
    고민을 했었는데..
    코드 짜신 분 의도가 request : null 이 나오게끔 해서
    들어온 값이 null 이다 라는 로그를 찍기 위함 이었으므로 아래 것이 맞다
    참고로 위에건 Optional.empty로 리턴된다.
    */
  }
}
