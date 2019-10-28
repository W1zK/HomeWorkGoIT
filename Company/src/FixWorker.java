public class FixWorker extends Worker {
    public FixWorker(String firstName, String secondName) {
        super(firstName, secondName);
    }

    @Override
    void show() {
        super.show();
        System.out.println("Payment: "+ (20.8*8)*14);
    }
}
