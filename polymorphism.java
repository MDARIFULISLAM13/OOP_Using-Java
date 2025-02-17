
class student {
    String name;
    int age;

    void print(String name) {
        System.out.println(name);
    }

    void print(int name) {
        System.out.println(age);
    }

    void print(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class polymorphism {
    public static void main(String args[]) {

        student s1 = new student();

        s1.name = "Arif";
        s1.age = 21;
        s1.print(s1.age);
        s1.print(s1.name);
        s1.print(s1.name, s1.age);

    }
}
