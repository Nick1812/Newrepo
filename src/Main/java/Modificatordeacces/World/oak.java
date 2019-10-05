package Main.java.Modificatordeacces.World;

public class oak extends Plant{

    public oak(){
    //Won`t work --type is private
    //type ="tree";
    //this works --- size is protected,oak
    this.size ="large";
    //No acces specifier;work becouse
    this.height=10;
}
}
