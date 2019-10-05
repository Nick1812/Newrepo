package Main.java.Modificatordeacces.World;

public class Field {private Plant plant =new Plant();
    public Field(){
        //size is protected;Field is in the
        System.out.println(plant.size);
    }
}
