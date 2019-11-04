package Workers;

public class HoursWorker extends Worker {
    private float payment;
    private float hours;
    private float days;
    private float price;

    @Override
    public float payCalc() {
        return payment;
    }

    public HoursWorker(String firstName, String secondName, float payment, float hours, float days, float price) {
        super(firstName, secondName);
        this.payment = payment;
        this.hours = hours;
        this.days = days;
        this.price = price;
    }

    public HoursWorker(String firstName, String secondName, float hours, float days, float price) {
        super(firstName, secondName);
        this.hours = hours;
        this.days = days;
        this.price = price;
        this.payment = days*hours*price;
    }

    public float getHours() {
        return hours;
    }

    public float getDays() {
        return days;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Workers.HoursWorker{" +
                "payment=" + payment +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }

}
