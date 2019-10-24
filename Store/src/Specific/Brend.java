package Specific;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Brend implements TechSpecification{
    private Date year;
    private String name;
    private int persons;
    private int country;

    public Brend(Date year, String name, int persons, int country) {
        this.year = year;
        this.name = name;
        this.persons = persons;
        this.country = country;
    }

    public Brend(String year, String name, int persons, int country) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        sdf.parse(year);
        this.year= sdf.getCalendar().getTime();
        this.name = name;
        this.persons = persons;
        this.country = country;
    }


    public Date getYear() {

        return year;
    }

    public String getName() {
        return name;
    }

    public int getPersons() {
        return persons;
    }

    public int getCountry() {
        return country;
    }
}
