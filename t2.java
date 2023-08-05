package lab12;
public class t2 {
    private static final Object lock = new Object();
    private static int count = 1;
    private static final int MAX_COUNT = 10;

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                printNumbers();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                printNumbers();
            }
        });
        thread1.start();
        thread2.start();
    }
    private static void printNumbers() {
        synchronized (lock) {
            while (count <= MAX_COUNT) {
                try {
                    System.out.println(Thread.currentThread().getName() + ": " + count);
                    count++;
                    lock.notify();
                    if (count <= MAX_COUNT) {
                        lock.wait(); 
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}