class MyThread implements Runnable {
    Thread thread;

    public MyThread() {
        thread = new Thread(this);
    }

    public void run() {
        synchronized(this) { // synchronized block
            for(int i=1; i<=5; i++) {
                System.out.println(thread.getName() + ": " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }

    public void start() {
        thread.start();
    }

    public boolean isAlive() {
        return thread.isAlive();
    }

    public void join() throws InterruptedException {
        thread.join();
    }
}

public class MultiThread_Alive {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();

        System.out.println("Thread 1 is alive: " + thread1.isAlive());
        System.out.println("Thread 2 is alive: " + thread2.isAlive());

        thread1.join();
        thread2.join();

        System.out.println("Thread 1 is alive: " + thread1.isAlive());
        System.out.println("Thread 2 is alive: " + thread2.isAlive());
    }
}
