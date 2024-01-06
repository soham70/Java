package JavaOOP;

/*
You will often see Java programs that have either static or public attributes and methods.

In the example above, we created a static method,
 which means that it can be accessed without 
creating an object of the class, unlike public, 
which can only be accessed by objects:
 */

 class ClassMethods {  
     static void func1()
        {
            System.out.println("Static keyword used");
        }

        public void func2()
        {
            System.out.println("Public Keyword Used");
        }

      public static void main(String [] args)
    {
        func1();
        // func2(); //compile an error

        ClassMethods obj=new ClassMethods();
        obj.func2();;
    }
}


    
// }


    
// }
