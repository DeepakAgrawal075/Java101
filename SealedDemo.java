/**
 * Only the classes listed in the permits clause can implement this interface.
 * Sealed classes allow you to restrict which other classes or interfaces can extend or implement them.
 * This feature provides more control over the inheritance hierarchy, ensuring that only specific classes
 * can subclass or implement a sealed class or interface.
 */
sealed interface Shape permits Circle, Rectangle, Triangle {
}

/**
 * A final class representing a Circle.
 * This class implements the Shape interface.
 */
final class Circle implements Shape {}

/**
 * A final class representing a Rectangle.
 * This class implements the Shape interface.
 */
final class Rectangle implements Shape {}

/**
 * A final class representing a Triangle.
 * This class implements the Shape interface.
 */
final class Triangle implements Shape {}

// ERROR - java: class is not allowed to extend sealed class: Shape (as it is not listed in its 'permits' clause)
// final class Square implements Shape {}
/**
 * The main class to demonstrate the usage of sealed classes and interfaces.
 */
public class SealedDemo {
    /**
     * The main method to run the SealedDemo.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Shape shape = new Circle();
        System.out.println(shape);
    }
}