package org.example;

import java.util.ArrayList;

public class SpecificNameExist {
    // Use equals key word in a String
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Siyabonga");
        names.add("Daras");
        names.add("Ishefa");
        names.add("Manzini");

        for(String name : names){
            if(name.equals("Masiya")){
                System.out.println("Masiya exist");
            }else{
                System.out.println("The name cannot found");
                break;
            }
        }
    }
}
