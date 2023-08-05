package lab12;
import java.util.Date;

public class t6 implements Runnable {
    private static final int NUM_TIMES = 10;
    private static final long SLEEP_INTERVAL = 100;

    @Override
    public void run() {
        for (int i = 1; i <= NUM_TIMES; i++) {
            System.out.println("Thread: " + Thread.currentThread().getId() + ", Current Date and Time: " + new Date());
            try {
                Thread.sleep(SLEEP_INTERVAL);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class MyMain {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new t6());
        Thread thread2 = new Thread(new t6());
        Thread thread3 = new Thread(new t6());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}