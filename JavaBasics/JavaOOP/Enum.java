package JavaOOP;

/*
 An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).

To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters:

Enum is short for "enumerations", which means "specifically listed".

 */

//  Difference between Enums and Classes
// An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).

// An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).

// Why And When To Use Enums?
// Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.

enum Level {
    Low,
    Medium,
    High
}

public class Enum {

    // Enum can be also used inside a class

    enum Car {
        SUV,
        XUV,
        HatchBack,
        Normal
    }

    public static void main(String[] args) {
        // Level myLevel=Level.Medium;
        // System.out.println(myLevel);

        Car myCar = Car.SUV;
        System.out.println(myCar);

        // Enum can be also used in switch statements

        switch (myCar) {
            case SUV:
                System.out.println("SUV Car");
                break;

            case XUV:
                System.out.println("XUV Car");
                break;

            default:
                break;
        }

        // Enum could also be used in for loops

    }
}
