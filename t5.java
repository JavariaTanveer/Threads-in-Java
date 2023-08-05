package lab12;

public class t5 {
    public static void main(String[] args) {
        Thread messageThread = new Thread(new MessagePrinter());

        try {
            messageThread.start();
            messageThread.join(); 
            System.out.println("Thread execution completed.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MessagePrinter implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Thread is sleeping for 2 seconds...");
            Thread.sleep(2000); 

            System.out.println("Thread execution completed.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}