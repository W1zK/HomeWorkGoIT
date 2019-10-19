import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public interface TimeConvert {
    Main main = new Main();

    default String timeConvert(int index) {
        Date time = null;
        try {
            time = new SimpleDateFormat("HHmmss.SSS").parse(Main.subStr[index]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new SimpleDateFormat("HH:mm:ss:SS").format(time);

    }

}
