If you call equals() on two StringBuilder instances, it will check the reference equality.

```
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
