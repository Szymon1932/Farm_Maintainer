package src;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++){
            Thread1 myThing = new Thread1(i);
            Thread t = new Thread(myThing);
            t.start();
        }

    }
}
