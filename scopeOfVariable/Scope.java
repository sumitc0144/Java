package scopeOfVariable;

class Student {
    // Instance variable
//	Declared inside a class but outside methods.Stores in heap


    String name;

    // Static variable
    static String college = "ABC University";

    // Final variable (constant per object)
    final int rollNo;

    // Constructor
    Student(String n, int r) {
        name = n;
        rollNo = r;  // final variable must be initialized once
    }

    void display() {
        // Local variable
        int age = 20;

        // Final local variable
        final String section = "A";

        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Age: " + age);
        System.out.println("Section: " + section);
        System.out.println("College: " + college);

        // Block variable
        for (int i = 1; i <= 3; i++) {
            System.out.println("Loop iteration: " + i);
        }
    }
}

public class Scope {
    public static void main(String[] args) {
        Student s1 = new Student("Sumit", 101);
        s1.display();
    }
}

