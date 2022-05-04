package src;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++){
            Thread1 thread1 = new Thread1(i);
            thread1.start();
        }

    }
}
