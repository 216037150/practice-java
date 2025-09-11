package org.javaproblems.PracticeMakePerfect;

public class OddEven {
    public static void main(String[] args) {
        String result = EvenOdd(3);
        System.out.println("This number is " + result);

    }

    public static String EvenOdd(int numbers){
            if(numbers%2 == 0){
                return  "Even";
            }else{
                return "odd";
            }
    }
}
