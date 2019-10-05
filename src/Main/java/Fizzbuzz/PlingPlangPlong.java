package Main.java.Fizzbuzz;

public class PlingPlangPlong {public static String Metoda(int i) {
    String s = "";
    if (i % 3 == 0) {
        System.out.println("Pling");
    }
    if (i % 5 == 0) {
        System.out.println("Plang");
    }
    if (i % 7 == 0) {
        System.out.println("Plong");
    }
    if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
        System.out.println(i);
    }
    return s;
}
    public static void main(String[] args) {
        System.out.println(Metoda(105));
    }
}
