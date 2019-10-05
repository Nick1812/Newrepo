package Main.java.Override;

public class App {
    public static void main(String[] args) {
        Person person=new Person();
        person.sayHello();
        Person student=new Student();
        student.sayHello();
    }
}
