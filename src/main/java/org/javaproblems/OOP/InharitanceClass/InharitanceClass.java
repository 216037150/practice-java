package org.javaproblems.OOP.InharitanceClass;




public class InharitanceClass {
    public static void main(String[] args) {

        VeryAdvanceCalculator obj = new VeryAdvanceCalculator();
        int r1 = obj.add(3,4);
        int r2 = obj.multiplication(3,5);
        int r3 = obj.division(5,4);
        double r4 = obj.power(2,3);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

    }
}
