package Main.java.Modificatordeacces.World;

public class Plant  {
    //bad practice
    public String name;
    //Acceptable practice --- it`s final;
    public static int ID =8;
    private String type;
    protected  String size;
    int height;
    public Plant(){
        this.name="Freddy";
        this.type="plant";
        this.size="medium";
        this.height=8;
    }
}
