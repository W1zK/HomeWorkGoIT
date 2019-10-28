package Categories;

import Specific.ShelfLife;
import Specific.TechSpecification;

public class Candy extends Items implements TechSpecification {
    ShelfLife shelfLife;

    public Candy(int id, String name, double value, String other, double price) {
        super(id, name, value, other, price);
    }

    public Candy(int id, String name, double value, String other, double price, ShelfLife shelfLife) {
        super(id, name, value, other, price);
        this.shelfLife = shelfLife;
    }

    @Override
    public void show() {
        super.show();
        System.out.println(shelfLife.getExp());
    }
}
