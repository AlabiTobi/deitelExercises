package chapterNine;

public class Animal extends LivingThing{
    public Animal(){
        System.out.println ("I am creating Animal");
    }

@Override
    public void move(){
    super.move();
    System.out.println ("move like animal");
    }
    public void yourFatherMove(){
    super.move ();
    }
}
