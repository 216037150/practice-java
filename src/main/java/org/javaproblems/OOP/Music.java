package org.javaproblems.OOP;

class Computer{
    public void playMusic(){
        System.out.println("Music is playing ...");
    }

    public String getMeAPen(int cost){
        if(cost >= 10)
            return "You got pen";
       return "No Pen";
    }
}

public class Music {
    public static void main(String[] args) {
        Computer obj = new Computer();
        String re = obj.getMeAPen(3);
        obj.playMusic();
        System.out.println(re);
    }
}
