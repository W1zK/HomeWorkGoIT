package Specific;

import Categories.*;

import java.text.ParseException;
import java.util.Scanner;


public abstract class AddItems extends Param {
    public static final Scanner scanner = new Scanner(System.in);

    public Smartphone[] smartphones = new Smartphone[1];
    public Computer[] computers = new Computer[1];
    public Vagetables[] vagetables = new Vagetables[1];
    public Candy[] candies = new Candy[1];
    public Water[] water = new Water[1];
    public Soda[] soda = new Soda[1];
    public Dress[] dresses = new Dress[1];


    public abstract void addItem(Computer[] mass) throws ParseException;

    public abstract void addItem(Smartphone[] mass) throws ParseException;

    public abstract void addItem(Vagetables[] mass) throws ParseException;

    public abstract void addItem(Candy[] mass) throws ParseException;

    public abstract void addItem(Water[] mass) throws ParseException;

    public abstract void addItem(Soda[] mass) throws ParseException;

    public abstract void addItem(Dress[] mass) throws ParseException;


    public abstract void sellItem(Computer[] mass);

    public abstract void sellItem(Smartphone[] mass);

    public abstract void sellItem(Vagetables[] mass);

    public abstract void sellItem(Candy[] mass);

    public abstract void sellItem(Water[] mass);

    public abstract void sellItem(Soda[] mass);

    public abstract void sellItem(Dress[] mass);


    public abstract void doType(Smartphone[] mass) throws ParseException;

    public abstract void doType(Computer[] mass) throws ParseException;

    public abstract void doType(Vagetables[] mass) throws ParseException;

    public abstract void doType(Candy[] mass) throws ParseException;

    public abstract void doType(Water[] mass) throws ParseException;

    public abstract void doType(Soda[] mass) throws ParseException;

    public abstract void doType(Dress[] mass) throws ParseException;


}
