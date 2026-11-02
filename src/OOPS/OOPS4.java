package OOPS;

public class OOPS4 {
    public static void main(String[] args) {
//        Fish whale = new Fish();
//        whale.eats();
        Dog husky = new Dog();
        husky.eats();
        husky.legs = 4;
        System.out.println(husky.legs);
    }
}

class Animal{
    String color;
    void eats(){
        System.out.println("eats");
    }

    void breathes(){
        System.out.println("Breathes");
    }

}

class Mammal extends Animal{
    int legs;
}
class Dog extends Mammal{
    String breed;
}

//class Fish extends Animal{
//    int fins;
//    void swims(){
//        System.out.println("swims");
//    }
//}

