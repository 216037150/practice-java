package org.javaproblems.OOP;
class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + " : " + price + " : "+ name);
    }
}
public class StaticKetWord {
    public static void main(String[] args) {
        Mobile obj1 =  new Mobile();
        Mobile obj2 =  new Mobile();
        obj1.brand = "IPHONE";
        obj1.price = 123;
        obj1.name = "SMART Phone";


        obj2.brand = "SUmSung";
        obj2.price = 156;
        obj2.name = "SMART Phone";

        //Static key word
        //The name will be changed in both object even if we changed one object because of static key
        //Static variable is shared by all the object
        obj2.name = "Normal Phone";

        obj1.show();
        obj2.show();



    }
}
