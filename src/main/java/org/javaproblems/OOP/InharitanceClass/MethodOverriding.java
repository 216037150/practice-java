package org.javaproblems.OOP.InharitanceClass;
/*
What is Method Overriding?
Method overriding happens when a child class provides its own implementation of a method that already exists in the parent class.
The overriding method must have:
The same method name
The same parameters
The same return type (or compatible)
**/

class  A{
    public void show(){
        System.out.println("In A show");
    }

    public void config(){
        System.out.println("In config");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B show");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();
    }
}
