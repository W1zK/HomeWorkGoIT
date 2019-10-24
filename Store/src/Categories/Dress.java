package Categories;

import Specific.Brend;

public class Dress extends Items {
    Brend brend;
    public Dress(int id, String name, double value, String other, double price) {
        super(id, name, value, other, price);
    }

    public Dress(int id, String name, double value, String other, double price, Brend brend) {
        super(id, name, value, other, price);
        this.brend = brend;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Brend: "+brend.getName()+
                "\n"+"Year: "+brend.getYear()+
                "\n"+"Personal: "+brend.getPersons()+
                "\n"+"Country: "+brend.getCountry());
    }
}
