
class Student {
    String name;
    int age;

    public void printname() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Create a basic constructor for this class

    Student() {
        System.out.println("Constructor called\n");
    }

    /*
     * // This is a parameterized constructor.
     * Student(String name, int age) {
     * this.name = name;
     * this.age = age;
     * }
     *
     */

    // This is a copy constructor.
    Student(Student s) {
        System.out.println("copy constructor\n");
        this.name = s.name;
        this.age = s.age;
    }

}

public class Basic_oop {

    public static void main(String[] args) {

        // When I use the 'new' keyword, it allocates memory on the heap to store the
        // object data.
        Student s1 = new Student(); // Here, Student() is a constructor. We use the constructor to initialize the
                                    // object.in java 3 type constructor avaiable;

        s1.name = "Arif";
        s1.age = 21;

        /*
         * // Calling the parameterized constructor
         * Student s2 = new Student("Araf", 2);
         */

        // Calling the copy constructor
        Student s2 = new Student(s1);
        s2.printname();
    }

}