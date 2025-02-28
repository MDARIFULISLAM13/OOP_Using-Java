
abstract class animal {
    public String name;

    abstract void walk();

}

class horse extends animal {
    public void walk() {
        System.out.println("Walk on 4 legs");
    }
}

class chicken extends animal {
    public void walk() {
        System.out.println("Walk on 2 legs");
    }
}

public class abstraction {
    public static void main(String[] args) {

        chicken c1 = new chicken();
        c1.walk();

        horse h1 = new horse();
        h1.walk();
        h1.name = "A";
        System.out.println(h1.name);


    }
}
