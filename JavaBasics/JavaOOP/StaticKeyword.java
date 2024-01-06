package JavaOOP;

public class StaticKeyword {
    static void mymethod() {
        System.out.println("Static Keyword Used");
    }

    // A static method means that it
    // can be accessed without creating an
    // object of the class, unlike public

    public static void main(String[] args) {
        mymethod();

    }
}
