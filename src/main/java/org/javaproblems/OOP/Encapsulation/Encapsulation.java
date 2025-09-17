package org.javaproblems.OOP.Encapsulation;
//Encapsulation can be achieved with the help of private key word
// The data is accessible within the same class
class Human{
    // private fields (data is hidden from outside classes)
    private String name;
    private int age;

    //Contractor is a special method, with the same name as a class, does not have the return types.Just specify the access like public
    public Human(){   //Default constructor
        age = 12;
        name = "john";
    }


    // Parametrize constructor
    public Human(int a, String b){
        age = a;
        name = b;
    }

    // public getter and setter methods to access/update data
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public  void setAge(int age){
        this.age = age;
    }
}


public class Encapsulation {
    public static void main(String[] args) {
         Human obj = new Human();
        Human obj1  = new Human(12, "siya");
//         obj.setAge(30);
//         obj.setName("siyabonga");

        System.out.println(obj.getAge() + " : " + obj.getName());
    }
}
