package Semophore;

import java.util.Scanner;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        Creator creator = new Creator();
        creator.scan();
        creator.threadCreator();

    }
}

class Creator {
    private int peopleCount;
    private Semaphore sem;



    void scan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите peopleCount: ");
        peopleCount = scanner.nextInt();
        System.out.print("Введите maxAmount: ");
        int maxAmount = scanner.nextInt();
        sem = new Semaphore(maxAmount);

    }

    void threadCreator() {

            for (int i = 0; i < peopleCount; i++) {
                new Thread(() -> {
                    try {
                        getEnter();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }).start();

            }

    }

    private void  getEnter() throws InterruptedException {
        System.out.println("++++++++пришел ко входу в библиотеку: " + Thread.currentThread().getName());
        if (sem.availablePermits() == 0) {
            System.out.println("ждет входа в библиотеку: " + Thread.currentThread().getName());
        }
        sem.acquire();
        System.out.println(">>>>>>>>вошел в библиотеку: " + Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(5);
        System.out.println("????????читает книгу: " + Thread.currentThread().getName());
        sem.release();
        System.out.println("<<<<<<<<вышел из библиотеки: " + Thread.currentThread().getName());
    }


}
