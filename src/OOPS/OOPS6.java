package OOPS;

public class OOPS6 {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        Bear b = new Bear();
        b.eats();
        b.walks();
    }
}

interface Herbivore{
    void eats();
}

interface Carnivore{
    void walks();
}

class Bear implements Herbivore, Carnivore{
    public void eats(){
        System.out.println("Eats both");
    }
    public void walks(){
        System.out.println("walks");
    }
}



interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal - in all directions");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal - single step");
    }
}
