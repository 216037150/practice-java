package org.javaproblems.OOP.InharitanceClass;


// The feature of Calculator class come here in advanced calculator through extends keyword
public class AdvanceCalculator extends Calculator{
    // AdvanceCalculator is a subclass
    // Calculator is a super class
    //extends gives the privilege of using the feature son supper class
    public int multiplication(int x, int y){
        return x*y;
    }

    public int division(int x, int y){
        return x/y;
    }
}
