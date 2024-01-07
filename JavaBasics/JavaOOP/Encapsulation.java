package JavaOOP;

/*
Why Encapsulation?
Better control of class attributes and methods
Class attributes can be made read-only (if you only use the get method),
 or write-only (if you only use the set method)
Flexible: the programmer can change one part of the code without affecting other parts
Increased security of data 
 */

class Person {
    String name;
    private float CGPA;

    // Getter
    public float getCGPA() {
        return this.CGPA;
    }

    // Setter
    public void setCGPA(float CGPA) {
        this.CGPA = CGPA;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Person p = new Person();
        p.setCGPA(8.95f);

        System.out.println(p.getCGPA());

    }
}
