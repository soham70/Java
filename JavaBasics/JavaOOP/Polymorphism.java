package JavaOOP;

/* 
Polymorphism means "many forms",
and it occurs when we have many classes 
that are related to each other by inheritance.

For example, think of a superclass called Animal that
 has a method called animalclass(). Subclasses 
of Animals could be Pigs, Cats, Dogs, Birds - 
And they also have their own implementation of
an animal class (the pig oinks, and the cat meows, etc.):

*/

class Animal {
    public void animalclass() {
        System.out.println("Animal class called...");
    }
}

class Pig extends Animal {
    public void animalclass() {
        System.out.println("Pig Class Called..");
    }
}

class Dog extends Animal {
    public void animalclass() {
        System.out.println("Dog Class Called..");
    }
}

public class Polymorphism {

    public static void main(String[] args) {

        Animal myanimal = new Animal();
        Animal mypig = new Pig();
        Animal mydog = new Dog();

        myanimal.animalclass();
        mypig.animalclass();
        mydog.animalclass();

    }
}
