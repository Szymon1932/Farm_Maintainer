package src;

public class Thread1 extends Thread {
    private final int threadNumber;
    public Thread1 (int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++){
            System.out.println(i + " from thread no. "+ threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
