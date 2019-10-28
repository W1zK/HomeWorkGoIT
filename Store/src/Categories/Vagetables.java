package Categories;
import Specific.ShelfLife;
import Specific.TechSpecification;
import Specific.Variety;


public class Vagetables extends Items implements TechSpecification {
    Variety variety;
    ShelfLife shelfLife;

    public Vagetables(int id, String name, double value, String other, double price) {
        super(id, name, value, other, price);
    }
    public Vagetables(int id, String name, double value, String other, double price, Variety variety, ShelfLife shelfLife) {
        super(id, name, value, other, price);
        this.shelfLife=shelfLife;
        this.variety=variety;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Сорт: "+variety+"\n"+"Годен до: "+shelfLife.getExp());
    }
}
