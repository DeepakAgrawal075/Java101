If you call _equals()_ method on two _StringBuilder_ instances, it will check the reference equality.

```java
public class StringBuilderExplained {
    public static void main(String[] args) {
        StringBuilder obj1 = new StringBuilder("Foo");
        StringBuilder obj2 = new StringBuilder("Foo");
        StringBuilder obj3 = obj1;
        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2));
        System.out.println("obj1.equals(obj3): " + obj1.equals(obj3));
    }
}
```
