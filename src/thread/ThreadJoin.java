package thread;

public class ThreadJoin extends Thread {
    @Override
    public void run() {
        System.out.println("t1 is running : ");
        for (int i = 0; i < 10; i++) {
            System.out.println("TextOne " + i );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

class ThreadJoin2 implements Runnable {
    @Override
    public void run() {
        System.out.println("t2 is running :");
        for (int i = 0; i < 10; i++) {
            System.out.println("TextTwo " + i );
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
        /*try {
            System.out.println("join t1 into t2");
            t1.join()
            System.out.println("t1 is waiting!!!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("t2 is running ");
        for (int i = 0; i < 10; i++) {
            System.out.println("TextTwo " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("t2 is finishing");*/
    }
    public static void main(String[] args) {
        System.out.println("Start!!!"); // main
        Thread t1 = new ThreadJoin();
        Thread t2 = new Thread(new ThreadJoin2());
        t1.start(); // main & t1

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Over!!!");
        t2.start(); // main & t1 & t2

    }
}
