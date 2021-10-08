package MultiTreading2;


import java.util.concurrent.*;

public class MainClass {
    public static final int CARS_COUNT = 4;
    public static final CountDownLatch cdl = new CountDownLatch(CARS_COUNT);
    public static final CountDownLatch cdl2 = new CountDownLatch(CARS_COUNT);



    public static void main(String[] args) {


        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
        }
        for (Car car : cars) {
            new Thread(car).start();
        }


        start();
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
        finish();
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");


    }

    public static void finish () {
        try {
            cdl2.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void start() {
        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}




