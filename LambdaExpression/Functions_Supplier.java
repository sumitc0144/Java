package LambdaExpression;

import java.util.function.Supplier;
import java.time.LocalDateTime;
import java.util.Random;

public class Functions_Supplier {
    public static void main(String[] args) {

        // 1. Simple Supplier: returns a string
        Supplier<String> greet = () -> "Hello, Supplier!";
        System.out.println(greet.get()); // Output: Hello, Supplier!

        // 2. Supplier: returns current time
        Supplier<LocalDateTime> currentTime = () -> LocalDateTime.now();
        System.out.println("Current time: " + currentTime.get());

        // 3. Supplier: returns random number
        Supplier<Integer> randomNumber = () -> new Random().nextInt(100);
        System.out.println("Random number: " + randomNumber.get());

        // 4. Supplier: returns a new object
        Supplier<Person> personSupplier = () -> new Person("Sumit", 25);
        Person p = personSupplier.get();
        System.out.println("Person: " + p);

        // 5. Supplier with method reference
        Supplier<Double> randomValue = Math::random;
        System.out.println("Random value: " + randomValue.get());
    }
}

// Helper class for Supplier example
class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
