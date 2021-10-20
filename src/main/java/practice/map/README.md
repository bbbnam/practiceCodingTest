# MAP 개념
- key, value 형태
- key만 알면 value를 가져올 수 있다 (시간 복잡도 O(1))

1. Map + String(getOrDefault())
2. Map + Array
3. Map + Math.max
4. Map + Set
5. Map + Map
6. Set + Set

```java
map에서 value를 get하는 방법

1. keySet 방법
for (String key : map.keySet()) {
    System.out.println("key : "+ key + ", value: " + map.get(key));
        }

2. entrySet 방법
for (Map.Entry<String, String> elem : map.entrySet()) {
    System.out.println("key : " + elem.getKey() + ", value : " + elem.getValue());
        }

3. Iterator 방법
Iterator<String> keys = map.keySet().iterator();
while (keys.hasNext()) {
    String key = keys.next();
    System.out.println("key : " + key + ", value : " + map.get(key));
        }
```
