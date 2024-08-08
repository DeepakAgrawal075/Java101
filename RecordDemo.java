/*
Records are a special kind of class in Java that are designed to hold immutable data.
They significantly reduce the boilerplate code required to create simple data carriers
by automatically providing implementations for methods like equals(), hashCode(),
and toString(), as well as getters for the fields.
*/

/**
 * A record representing a person with a name and age.
 *
 * @param name The name of the person.
 * @param age The age of the person.
 */
record Person(String name, int age) {
}

/**
 * The RecordDemo class demonstrates the use of records in Java.
 * It contains a main method to test the equality and properties of Person records.
 */
public class RecordDemo {

    /**
     * The main method to test the Person record.
     * It creates instances of Person and tests their equality and properties.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Person person1 = new Person("John", 30);
        Person person2 = new Person("John", 30);
        Person person3 = new Person("Tom", 25);

        // Test equality of person1 and person2 (should be true)
        System.out.println(person1.equals(person2));

        // Test equality of person1 and person3 (should be false)
        System.out.println(person1.equals(person3));

        // Test reference equality of person1 and person2 (should be false)
        System.out.println(person1 == person2);

        // Print the age of person1
        System.out.println(person1.age());
    }
}