package Main.java.Modificatordeacces.World;

public class Grass extends Plant {
    //Won`t work --- Grass not in the same packet
    public Grass(){
        System.out.println(this.height);
    }
}
