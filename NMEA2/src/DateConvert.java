import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public interface DateConvert {
    default String dateConvert(int index) {
        Date date = null;
        try {
            date = new SimpleDateFormat("ddMMyy").parse(Main.subStr[index]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new SimpleDateFormat("dd/MM/yyyy").format(date);


    }
}
