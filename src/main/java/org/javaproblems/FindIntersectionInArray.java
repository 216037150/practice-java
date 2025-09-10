package org.javaproblems;

import java.util.ArrayList;

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

        ArrayList<Integer> common = commonNumbers(list1, list2);

        System.out.println("Common elements: " + common);
    }

    public static ArrayList<Integer> commonNumbers(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> commonset = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).equals(list2.get(j))) {
                    commonset.add(list1.get(i));
                }
            }
        }

        return commonset;
    }
}
