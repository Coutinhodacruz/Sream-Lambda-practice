package chapter17;

public class Main {
    public static void main(String[] args) {
        Flyable plane = () ->{
            System.out.println("If you like no fly na you sabi");
        };
        plane.fly();
    }
}
