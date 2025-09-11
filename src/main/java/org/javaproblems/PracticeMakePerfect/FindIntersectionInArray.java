package org.javaproblems.PracticeMakePerfect;

import java.util.ArrayList;

// ArrayList use size, get
public class FindIntersectionInArray {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(6);
        list2.add(9);
        list2.add(1);

        ArrayList<Integer> results=  common(list1, list2);
        System.out.println(results);

    }

    public static ArrayList<Integer> common(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> commonElements = new ArrayList<>();
        //Enhance for loop
        for (Integer i : list1) {
            for (Integer j : list2) {
                if (i.equals(j)) {
                    commonElements.add(i);
                }
            }
        }
        return commonElements;
    }
}
