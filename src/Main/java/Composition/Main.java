package Main.java.Composition;

public class Main {
    public static void main(String[] args) {
    Dimensions dimensions= new Dimensions(20,20,5);
    Case theCase= new Case("2208","Dell","240",dimensions);
    Monitor theMonitor= new Monitor("27inch Beast","Acer",27,
            new Resolution(2540,1440));
    Motherboard theMotherboard=new Motherboard("BJ-200","Asus",6,5,"v2.44");
    Pc thePc=new Pc(theCase, theMonitor,theMotherboard);
    thePc.getMonitor().drawPixelAt(1500,1200,"red");
    thePc.getMotherboard().loadProgram("win 1.0");
    thePc.getTheCase().pressPowerButton();
}
}
