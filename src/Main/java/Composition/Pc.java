package Main.java.Composition;

public class Pc {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;
    public Pc(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    public Case getTheCase() {
        return theCase;
    }
    public void setTheCase(Case theCase) {
        this.theCase = theCase;
    }
    public Monitor getMonitor() {
        return monitor;
    }
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    public Motherboard getMotherboard() {
        return motherboard;
    }
    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }
    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading...");
    }
}
