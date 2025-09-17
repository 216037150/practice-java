package org.javaproblems.OOP.Encapsulation;


class  A{
    public A(){
        System.out.println("in A");
    }
}
class B extends A{
    public B(){
        super(); // This means call a constructor of the super class
        System.out.println("in B");
    }

    public  B(int N){
        System.out.println("in B with int");
    }
}



public class SuperClass {
    public static void main(String[] args) {
//        B obj = new B(); // This will call all the contractors. The constructor is called when an object is created
        B obj1 = new B(4); // This will call the constructor which takes integers as a parameter
    }
}
