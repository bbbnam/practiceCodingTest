# 널 객체 도입

### 문제 : null 확인이 너무 많음
### 해답 : null 을 나타내는 특별한 객체를 도입해 ' 아무것도 안 함' 이라는 처리를 함

```java
if (_name ! = null) {
    _name.display();
}
```

### 널 객체 도입 리팩토링 후
```java
_name.display();
```
