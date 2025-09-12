package org.javaproblems.PracticeMakePerfect;

public class ReverseNum {
    public static void main(String[] args) {
        int x = 12345;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;            // get last digit
            reversed = reversed * 10 + digit; // build reversed number
            x = x / 10;                   // remove last digit
        }

        System.out.println("Reversed number: " + reversed);
    }
}
