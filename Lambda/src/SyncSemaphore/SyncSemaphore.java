package SyncSemaphore;

import java.util.Scanner;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SyncSemaphore {

    public static void main(String[] args) {
        Creator creator = new Creator();
        creator.scan();
        creator.threadCreator();

    }
}

class Creator {
    private final boolean[] DOOR = new boolean[1];
    private int peopleCount;
    private int maxAmount;
    Semaphore sem;


    void scan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите peopleCount: ");
        peopleCount = scanner.nextInt();
        /*System.out.print("Введите maxAmount: ");
        maxAmount = scanner.nextInt();*/
        sem = new Semaphore(1, true);

    }

    void threadCreator() {

        for (int i = 0; i < peopleCount; i++) {
            new Thread(this::getEnter).start();

        }

    }

    void getEnter() {
        System.out.println("++++++++пришел ко входу в библиотеку: " + Thread.currentThread().getName());
        try {
            if (sem.availablePermits() == 0) {
                System.out.println("ждет входа в библиотеку: " + Thread.currentThread().getName());
            }
            sem.acquire();
            synchronized (DOOR) {
                System.out.println("подошел к двери с улицы: " + Thread.currentThread().getName());
                if (!DOOR[DOOR.length - 1]) {
                    DOOR[DOOR.length - 1] = true;
                    System.out.println(">>>>>>>>проходит через дверь внутрь: " + Thread.currentThread().getName());
                    Thread.sleep(500);
                }
                System.out.println("прошел через дверь внутрь: " + Thread.currentThread().getName());
            }
            System.out.println("????????читает книгу: " + Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(5);

            synchronized (DOOR) {
                System.out.println("подошел к двери изнутри: " + Thread.currentThread().getName());
                DOOR[DOOR.length - 1] = false;
                System.out.println("проходит через дверь наружу: " + Thread.currentThread().getName());
                Thread.sleep(500);
                System.out.println("прошел через дверь наружу: " + Thread.currentThread().getName());
            }
            sem.release();
            System.out.println("<<<<<<<<вышел из библиотеки: " + Thread.currentThread().getName());

        } catch (InterruptedException e) {
            //
        }

    }


}
