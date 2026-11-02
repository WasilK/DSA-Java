package OOPS;

public class OOPS2 {
    public static void main(String[] args) {
         Car c1 = new Car();
         c1.setColor("Blue");
        System.out.println(c1.getColor());
        c1.setModel("SUV");
        System.out.println(c1.getModel());
        c1.setColor("Black");
        System.out.println(c1.getColor());
    }
}

class Car{
    private String color;
    private String model;

    String getColor(){
        return color;
    }

    String getModel(){
        return model;
    }

    void setColor(String color){
        this.color = color;
    }

    void setModel(String model){
        this.model = model;
    }
}
