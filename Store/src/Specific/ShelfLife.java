package Specific;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ShelfLife implements TechSpecification {
    private String dt;
    private double temperature;
    private int day;
    private String exp;

    public ShelfLife(String dt, double temperature, int day, String exp) {
        this.dt = dt;
        this.temperature = temperature;
        this.day = day;
        this.exp = exp;
    }

    public ShelfLife(String date,double temperature, int expiriance) throws ParseException {
        this.dt=date;
        this.temperature=temperature;
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(sdf.parse(date));
        c.add(Calendar.DATE,expiriance);
        this.exp =sdf.format(c.getTime());
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }
}
