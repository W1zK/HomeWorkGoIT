package Categories;

import Specific.ShelfLife;

public class Soda extends Items {
    ShelfLife shelfLife;

    public Soda(int id, String name, double value, String other, double price) {
        super(id, name, value, other, price);
    }

    public Soda(int id, String name, double value, String other, double price, ShelfLife shelfLife) {
        super(id, name, value, other, price);
        this.shelfLife=shelfLife;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Годен до: "+shelfLife.getExp());
    }
}
