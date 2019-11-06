import Categories.*;

public interface AddSell {
    Smartphone[] smartphones = new Smartphone[1];
    Computer[] computers = new Computer[1];
    Vagetables[] vagetables = new Vagetables[1];
    Candy[] candies = new Candy[1];
    Water[] water = new Water[1];
    Soda[] soda = new Soda[1];
    Dress[] dresses = new Dress[1];
      void addItem(Computer[] mass);

      void addItem(Smartphone[] mass);

      void addItem(Vagetables[] mass);

      void addItem(Candy[] mass);

      void addItem(Water[] mass);

      void addItem(Soda[] mass);

      void addItem(Dress[] mass);


      void sellItem(Computer[] mass);

      void sellItem(Smartphone[] mass);

      void sellItem(Vagetables[] mass);

      void sellItem(Candy[] mass);

      void sellItem(Water[] mass);

      void sellItem(Soda[] mass);

      void sellItem(Dress[] mass);


      void doType(Smartphone[] mass);

      void doType(Computer[] mass);

      void doType(Vagetables[] mass);

      void doType(Candy[] mass);

      void doType(Water[] mass);

      void doType(Soda[] mass);

      void doType(Dress[] mass);
}
