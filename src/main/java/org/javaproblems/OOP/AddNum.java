package org.javaproblems.OOP;
// Create Object
// Designing is more important than assembling

// Actions will be done by the help of methods
class Calculator {
    int num; // This in an intance variable. It is a variable which is out side the body method, but within class.
    public int add(int x, int y){
        //int x, y // Local Variables: this variables are inside the method
        return x + y;
    }

    //Method overloading, methods with the same name, but different in parameter/type
    public int add(int x, int y, int z){
        return x + y + y;
    }
}

public class AddNum {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;


        //To call this add method, you need to create an object of that class to access the method
        // Every time when creating an object it will consume space memory
        Calculator obj = new Calculator();
        int result = obj.add(num1, num2, 5);
        System.out.println(result);

    }
}

