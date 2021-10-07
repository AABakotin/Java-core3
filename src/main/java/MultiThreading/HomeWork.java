package MultiThreading;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HomeWork {
    private static final Object mon = new Object();


    public static void main(String[] args) {


        threadWithPool3();
        startThread();


    }

    private static void startThread() {
        Thread t1 = new Thread(HomeWork::withSwitchCase);
        Thread t2 = new Thread(HomeWork::withSwitchCase);
        Thread t3 = new Thread(HomeWork::withSwitchCase);
        Thread t4 = new Thread(HomeWork::withSwitchCase);
        Thread t5 = new Thread(HomeWork::withSwitchCase);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

    private static void withSwitchCase() {
        synchronized (mon) {
            int flag = 0;
            switch (flag) {
                case 0:
                    wordA();
                case 1:
                    wordB();
                case 2:
                    wordC();
            }

        }
    }

    private static void threadWithPool3() {
        ExecutorService es = Executors.newFixedThreadPool(3);
        es.execute(() -> {
            for (int i = 0; i < 5; i++) {
                wordA();
                wordB();
                wordC();
            }

        });

        es.shutdown();
    }

    public static void wordA() {
        System.out.print("A");
        int flag = 1;
    }

    public static void wordB() {
        System.out.print("B");
       int flag = 2;
    }

    public static void wordC() {
        System.out.print("C ");
       int flag = 0;
    }
}
