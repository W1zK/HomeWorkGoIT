public class Show<T> {
    void show (T obj){
        new  Thread(()-> System.out.println(obj + "--" + Thread.currentThread().getName())).run();

    }

}
