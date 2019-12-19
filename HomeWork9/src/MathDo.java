import java.util.concurrent.*;

public interface MathDo {
    Show show = new Show();
    static void plus(double a, double b) {
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<Double> result = es.submit(() -> {
            System.out.println("Обрабатывается в потоке: " + Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(3);
            return a + b;
        });
        try {
           show.show(result.get());
        } catch (Exception e) {
            e.getMessage();
        }
        es.shutdown();
    }
    static void minus(double a, double b) {
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<Double> result = es.submit(() -> {
            System.out.println("Обрабатывается в потоке: " + Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(3);
            return a - b;
        });
        try {
            show.show(result.get());
        } catch (Exception e) {
            e.getMessage();
        }
        es.shutdown();
    }
    static void multiplication(double a, double b) {
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<Double> result = es.submit(() -> {
            System.out.println("Обрабатывается в потоке: " + Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(3);
            return a * b;
        });
        try {
            show.show(result.get());
        } catch (Exception e) {
            e.getMessage();
        }
        es.shutdown();
    }
    static void division(double a, double b) {
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<Double> result = es.submit(() -> {
            System.out.println("Обрабатывается в потоке: " + Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(3);
            return a / b;
        });
        try {
            show.show(result.get());
        } catch (Exception e) {
            e.getMessage();
        }
        es.shutdown();
    }
    static void modulo(double a, double b) {
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<Double> result = es.submit(() -> {
            System.out.println("Обрабатывается в потоке: " + Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(3);
            return a % b;
        });
        try {
            show.show(result.get());
        } catch (Exception e) {
            e.getMessage();
        }
        es.shutdown();
    }
    static void equally(double a, double b) {
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<Boolean> result = es.submit(() -> {
            System.out.println("Обрабатывается в потоке: " + Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(3);
            return a == b;
        });
        try {
            show.show(result.get());
        } catch (Exception e) {
            e.getMessage();
        }
        es.shutdown();
    }
    static void aMoreThan(double a, double b) {
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<Boolean> result = es.submit(() -> {
            System.out.println("Обрабатывается в потоке: " + Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(3);
            return a > b;
        });
        try {
            show.show(result.get());
        } catch (Exception e) {
            e.getMessage();
        }
        es.shutdown();
    }
    static void bMoreThan(double a, double b) {
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<Boolean> result = es.submit(() -> {
            System.out.println("Обрабатывается в потоке: " + Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(3);
            return a < b;
        });
        try {
            show.show(result.get());
        } catch (Exception e) {
            e.getMessage();
        }
        es.shutdown();
    }



}
