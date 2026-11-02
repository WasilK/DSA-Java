package OOPS;

public class OOPS5 {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
        h.walk();
        h.eat();
    }
}

abstract class Animals{
    String color;
    Animals(){
        color = "black";
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}

class Horse extends Animals{
    void walk(){
        System.out.println("Horse walks on 4 legs.");
    }
}

class Chicken extends Animals{
    void walk(){
        System.out.println("Chicken walks on 2 legs.");
    }
}
