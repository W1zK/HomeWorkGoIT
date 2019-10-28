package Categories;

public class Items {

    private int id;
    private String name;
    private double  value;
    private String other;
    private double price;
    //static int k=1;
    //public static Items[] smartphones; = new Smartphone[1];

    public Items(int id, String name, double value, String other, double price) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.other = other;
        this.price = price;
    }

    public Items() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void show(){
        System.out.println("Название:" + name+"\nКоличество:"+value+"\nОписание:"+other+"\nЦена:"+price);
    }
}
