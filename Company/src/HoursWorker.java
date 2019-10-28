public class HoursWorker extends Worker {
    double payment;
    public HoursWorker(String firstName, String secondName) {
        super(firstName, secondName);
    }
    public HoursWorker(String firstName, String secondName,double day,double hours) {
        super(firstName, secondName);
        this.payment = day*hours*14;

    }

    @Override
    void show() {
        super.show();
        System.out.print("Payment: "+payment);
    }
}
