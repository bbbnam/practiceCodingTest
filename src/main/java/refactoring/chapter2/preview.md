# 제어 플래그 삭제

### 제어 플래그를 삭제하여 프로그램 가독성을 높임

```java
flag = true;
while (flag) {
        ...
        if (A) {
          flag = false;  
        } else {
            ...
        }
    }
```
이런 형태에서 제어 플래그를 삭제 해준다

```java
while (true) {
        ...
        if (A) {
          break;
        } else {
            ...
        }
    }
```