import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NMEA {
    static String GPGSV = "$GPGSV,5,3,12,02,52,128,20,01,48,240,30,03,33,054,29,14,27,314,25*47";
    static String GLGSV = "$GLGSV,3,1,11,04,76,148,32,02,62,242,35,01,27,067,35,,,,*47";
    static String GNGLL = "$GPGLL,4915.3920,N,12259.8072,W,222414.00,A*79";
    static String GNRMC = "$GNRMC,165111.98,A,5601.0318,N,01211.3503,E,0.08,43.53,190706,,*3E";
    static String GNVTG = "$GNVTG,30.60,T,,M,0.10,N,0.2,K,D*56";
    static String GNGGA = "$GPGGA,165116.000,5601.0318,N,01211.3504,E,1,07,1.2,22.8,M,41.6,M,2,5438*6E";
    static String GNGSA = "$GNGSA,M,3,17,02,30,04,05,10,09,06,31,12,,,1.2,0.8,0.9*2B";
    static String[] subStr;

    static void circumcision(String name) {
        String delimeter = ",";
        subStr = name.split(delimeter);
        subStr[0] = subStr[0].substring(1);
        subStr[subStr.length - 1] = subStr[subStr.length - 1].substring(0, subStr[subStr.length - 1].indexOf("*"));
    }

    static String timeConvert(int index) {
        Date time = null;
        try {
            time = new SimpleDateFormat("HHmmss.SSS").parse(subStr[index]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String timeToString = new SimpleDateFormat("HH:mm:ss:SS").format(time);
        return timeToString;
    }

    static String dateConvert(int index) {
        Date date = null;
        try {
            date = new SimpleDateFormat("ddMMyy").parse(subStr[index]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String dateToString = new SimpleDateFormat("dd/MM/yyyy").format(date);
        return dateToString;

    }

    static void gpgsvMethod() {

        circumcision(GPGSV);

        String type = subStr[0];
        int qMassage = subStr[1].equals("") ? 0 : Integer.valueOf(subStr[1]); //quantity massage
        int numMassage = subStr[2].equals("") ? 0 : Integer.valueOf(subStr[2]); // number massage
        int qSat = subStr[3].equals("") ? 0 : Integer.valueOf(subStr[3]); //quantity satellite
        int satId = subStr[4].equals("") ? 0 : Integer.valueOf(subStr[4]); //number satellite
        int elevation = subStr[5].equals("") ? 0 : Integer.valueOf(subStr[5]); //elevation angle
        int azimuth = subStr[6].equals("") ? 0 : Integer.valueOf(subStr[6]); //azimuth
        int snr = subStr[7].equals("") ? 0 : Integer.valueOf(subStr[7]); //signal strength
        int satId1 = subStr[8].equals("") ? 0 : Integer.valueOf(subStr[8]); //number satellite
        int elevation1 = subStr[9].equals("") ? 0 : Integer.valueOf(subStr[9]); //elevation angle
        int azimuth1 = subStr[10].equals("") ? 0 : Integer.valueOf(subStr[10]); //azimuth
        int snr1 = subStr[11].equals("") ? 0 : Integer.valueOf(subStr[11]); //signal strength
        int satId2 = subStr[12].equals("") ? 0 : Integer.valueOf(subStr[12]);
        int elevation2 = subStr[13].equals("") ? 0 : Integer.valueOf(subStr[13]);
        int azimuth2 = subStr[14].equals("") ? 0 : Integer.valueOf(subStr[14]);
        int snr2 = subStr[15].equals("") ? 0 : Integer.valueOf(subStr[15]);
        int satId3 = subStr[16].equals("") ? 0 : Integer.valueOf(subStr[16]);
        int elevation3 = subStr[17].equals("") ? 0 : Integer.valueOf(subStr[17]);
        int azimuth3 = subStr[18].equals("") ? 0 : Integer.valueOf(subStr[18]);
        int snr3 = subStr[19].equals("") ? 0 : Integer.valueOf(subStr[19]);

        System.out.println("Type of massage(String):" + type +
                "\nQuantity massage(int):" + qMassage +
                "\nNumber of massage(int):" + numMassage +
                "\nQuantity satellite(int):" + qSat +
                "\n-----------------------------" +
                "\nNumber satellite(int):" + satId +
                "\nElevation angle(int):" + elevation +
                "\nAzimuth(int):" + azimuth +
                "\nSignal strength(int):" + snr +
                "\n-----------------------------" +
                "\nNumber satellite(int):" + satId1 +
                "\nElevation angle(int):" + elevation1 +
                "\nAzimuth(Integer):" + azimuth1 +
                "\nSignal strength(int):" + snr1 +
                "\n-----------------------------" +
                "\nNumber satellite(int):" + satId2 +
                "\nElevation angle(int):" + elevation2 +
                "\nAzimuth(int):" + azimuth2 +
                "\nSignal strength(int):" + snr2 +
                "\n-----------------------------" +
                "\nNumber satellite(int):" + satId3 +
                "\nElevation angle(int):" + elevation3 +
                "\nAzimuth(int):" + azimuth3 +
                "\nSignal strength(int):" + snr3);


    }

    static void glgsvMethod() {
        circumcision(GLGSV);

        String type = subStr[0];
        int messQuant = subStr[1].equals("") ? 0 : Integer.valueOf(subStr[1]); //quantity massage
        int messageId = subStr[2].equals("") ? 0 : Integer.valueOf(subStr[2]); // number massage
        int qSat = subStr[3].equals("") ? 0 : Integer.valueOf(subStr[3]); //quantity satellite
        int satId = subStr[4].equals("") ? 0 : Integer.valueOf(subStr[4]); //number satellite
        int elevation = subStr[5].equals("") ? 0 : Integer.valueOf(subStr[5]); //elevation angle
        int azimuth = subStr[6].equals("") ? 0 : Integer.valueOf(subStr[6]); //azimuth
        int snr = subStr[7].equals("") ? 0 : Integer.valueOf(subStr[7]); //signal strength
        int satId1 = subStr[8].equals("") ? 0 : Integer.valueOf(subStr[8]); //number satellite
        int elevation1 = subStr[9].equals("") ? 0 : Integer.valueOf(subStr[9]); //elevation angle
        int azimuth1 = subStr[10].equals("") ? 0 : Integer.valueOf(subStr[10]); //azimuth
        int snr1 = subStr[11].equals("") ? 0 : Integer.valueOf(subStr[11]); //signal strength
        int satId2 = subStr[12].equals("") ? 0 : Integer.valueOf(subStr[12]);
        int elevation2 = subStr[13].equals("") ? 0 : Integer.valueOf(subStr[13]);
        int azimuth2 = subStr[14].equals("") ? 0 : Integer.valueOf(subStr[14]);
        int snr2 = subStr[15].equals("") ? 0 : Integer.valueOf(subStr[15]);

        System.out.println("Type of message(String):" + type +
                "\nQuantity message(int):" + messQuant +
                "\nNumber of message(int):" + messageId +
                "\nQuantity of satellite(int):" + qSat +
                "\n-----------------------------" +
                "\nNumber satellite(int):" + satId +
                "\nElevation angle(int):" + elevation +
                "\nAzimuth(int):" + azimuth +
                "\nSignal strength(int):" + snr +
                "\n-----------------------------" +
                "\nNumber satellite(int):" + satId1 +
                "\nElevation angle(int):" + elevation1 +
                "\nAzimuth(int):" + azimuth1 +
                "\nSignal strength(integer):" + snr1 +
                "\n-----------------------------" +
                "\nNumber satellite(int):" + satId2 +
                "\nElevation angle(int):" + elevation2 +
                "\nAzimuth(int):" + azimuth2 +
                "\nSignal strength(int):" + snr2);
    }

    static void gngllMethod() {

        circumcision(GNGLL);

        String type = subStr[0];
        double latitude = subStr[1].equals("") ? 0 : Double.valueOf(subStr[1]); //latitude
        char dir = subStr[2].equals("") ? '-' : subStr[2].charAt(0);
        double longitude = subStr[3].equals("") ? 0 : Double.valueOf(subStr[3]); //longitude
        char dir1 = subStr[4].equals("") ? '-' : subStr[4].charAt(0);
        char dataType = subStr[6].equals("") ? '-' : subStr[6].charAt(0);

        System.out.println("Type of message(String):" + type +
                "\nLatitude(double,char):" + latitude + "," + dir +
                "\nLongitude(double,char):" + longitude + "," + dir1 +
                "\nTime registration hhmmss.sss(String(Date)):" + timeConvert(5) +
                "\nValid data(char):" + dataType);
    }

    static void gnrmcMethod() {

        circumcision(GNRMC);

        String type = subStr[0];
        char status = subStr[2].equals("") ? '-' : subStr[2].charAt(0);
        double lat = subStr[3].equals("") ? 0 : Double.valueOf(subStr[3]);
        char dirLat = subStr[4].equals("") ? '-' : subStr[4].charAt(0);
        double lon = subStr[5].equals("") ? 0 : Double.valueOf(subStr[5]);
        char dirLon = subStr[6].equals("") ? '-' : subStr[6].charAt(0);
        double speed = subStr[7].equals("") ? 0 : Double.valueOf(subStr[7]);
        double course = subStr[8].equals("") ? 0 : Double.valueOf(subStr[8]);
        char mode = subStr[10].equals("") ? '-' : subStr[10].charAt(0);


        System.out.println("Message type(String):" + type +
                "\nTime(String(Date)):" + timeConvert(1) +
                "\nStatus(char):" + status +
                "\nLatitude(double,char):" + lat + "," + dirLat +
                "\nLongitude(double,char):" + lon + "," + dirLon +
                "\nSpeed(double):" + speed +
                "\nCourse(double):" + course +
                "\nDate(Date):" + dateConvert(9) +
                "\nMode(char):" + mode);
    }

    static void gnvtgMethod() {

        circumcision(GNVTG);

        String messType = subStr[0];
        double course1 = subStr[1].equals("") ? 0 : Double.valueOf(subStr[1]);
        char t = subStr[2].equals("") ? '-' : subStr[2].charAt(0);
        double course2 = subStr[3].equals("") ? 0 : Double.valueOf(subStr[3]);
        char m = subStr[4].equals("") ? '-' : subStr[4].charAt(0);
        double speed1 = subStr[5].equals("") ? 0 : Double.valueOf(subStr[5]);
        char n = subStr[6].equals("") ? '-' : subStr[6].charAt(0);
        double speed2 = subStr[7].equals("") ? 0 : Double.valueOf(subStr[7]);
        char k = subStr[8].equals("") ? '-' : subStr[8].charAt(0);
        char mode = subStr[9].equals("") ? '-' : subStr[9].charAt(0);

        System.out.println("Message type(String):" + messType +
                "\nCourse over ground, degrees True(double,char):" + course1 + t +
                "\nCourse over ground, degrees Magnetic(double,char):" + course2 + m +
                "\nSpeed over ground in knots(double,char):" + speed1 + n +
                "\nSpeed over ground in kilometers per hour(double,char):" + speed2 + k +
                "\nMode(char):" + mode);
    }

    static void gnggaMethod() {

        circumcision(GNGGA);

        String messType = subStr[0];
        double lat = subStr[2].equals("") ? 0 : Double.valueOf(subStr[2]); //latitude
        char dirLat = subStr[3].equals("") ? '-' : subStr[3].charAt(0);
        double lon = subStr[4].equals("") ? 0 : Double.valueOf(subStr[4]); //longitude
        char dirLon = subStr[5].equals("") ? '-' : subStr[5].charAt(0);
        int gpsIndic = subStr[6].equals("") ? 0 : Integer.valueOf(subStr[6]);
        int satUsed = subStr[7].equals("") ? 0 : Integer.valueOf(subStr[7]);
        double hdop = subStr[8].equals("") ? 0 : Double.valueOf(subStr[8]);
        double altitude = subStr[9].equals("") ? 0 : Double.valueOf(subStr[9]);
        char m1 = subStr[10].equals("") ? '-' : subStr[10].charAt(0);
        double geoSepar = subStr[11].equals("") ? 0 : Double.valueOf(subStr[11]);
        char m2 = subStr[12].equals("") ? '-' : subStr[12].charAt(0);
        String nothing = subStr[13];
        int dgpsId = subStr[14].equals("") ? 0 : Integer.valueOf(subStr[14]);

        System.out.println("Message type(String):" + messType +
                "\nTime(String(Date)):" + timeConvert(1) +
                "\nLatitude(double,char):" + lat + "," + dirLat +
                "\nLongitude(double,char):" + lon + "," + dirLon +
                "\nGPS indicate(int):" + gpsIndic +
                "\nSatellite used(int):" + satUsed +
                "\nHorizontal dilution of precision(double):" + hdop +
                "\nAltitude(double,char):" + altitude + m1 +
                "\nGeoidal Separation(double,char):" + geoSepar + m2 +
                "\nDGPS Station ID(int):" + dgpsId);
    }

    static void gngsaMethod() {

        circumcision(GNGSA);

        String messType = subStr[0];
        char mode = subStr[1].equals("") ? '-' : subStr[1].charAt(0);
        int mode1 = subStr[2].equals("") ? 0 : Integer.valueOf(subStr[2]);
        int sat1 = subStr[3].equals("") ? 0 : Integer.valueOf(subStr[3]);
        int sat2 = subStr[4].equals("") ? 0 : Integer.valueOf(subStr[4]);
        int sat3 = subStr[5].equals("") ? 0 : Integer.valueOf(subStr[5]);
        int sat4 = subStr[6].equals("") ? 0 : Integer.valueOf(subStr[6]);
        int sat5 = subStr[7].equals("") ? 0 : Integer.valueOf(subStr[7]);
        int sat6 = subStr[8].equals("") ? 0 : Integer.valueOf(subStr[8]);
        int sat7 = subStr[9].equals("") ? 0 : Integer.valueOf(subStr[9]);
        int sat8 = subStr[10].equals("") ? 0 : Integer.valueOf(subStr[10]);
        int sat9 = subStr[11].equals("") ? 0 : Integer.valueOf(subStr[11]);
        int sat10 = subStr[12].equals("") ? 0 : Integer.valueOf(subStr[12]);
        int sat11 = subStr[13].equals("") ? 0 : Integer.valueOf(subStr[13]);
        int sat12 = subStr[14].equals("") ? 0 : Integer.valueOf(subStr[14]);
        double pdop = subStr[15].equals("") ? 0 : Double.valueOf(subStr[15]);
        double hdop = subStr[16].equals("") ? 0 : Double.valueOf(subStr[16]);
        double vdop = subStr[17].equals("") ? 0 : Double.valueOf(subStr[17]);

        System.out.println("Type of message(String):" + messType +
                "\nMode 'M/A'(char):" + mode +
                "\nMode '1/2/3'(int):" + mode1 +
                "\nSatellite #1(int)" + sat1 +
                "\nSatellite #2(int)" + sat2 +
                "\nSatellite #3(int)" + sat3 +
                "\nSatellite #4(int)" + sat4 +
                "\nSatellite #5(int)" + sat5 +
                "\nSatellite #6(int)" + sat6 +
                "\nSatellite #7(int)" + sat7 +
                "\nSatellite #8(int)" + sat8 +
                "\nSatellite #9(int)" + sat9 +
                "\nSatellite #10(int)" + sat10 +
                "\nSatellite #11(int)" + sat11 +
                "\nSatellite #12(int)" + sat12 +
                "\nPDOP(double):" + pdop +
                "\nHDOP(double):" + hdop +
                "\nVDOP(double):" + vdop);


    }

    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("1-GPGSV | 2-GLGSV | 3-GNGLL | 4-GNRMC | 5-GNVTG | 6-GNGGA | 7 -GNGSA" +
                "\nEnter number:");
        x = sc.nextInt();
        switch (x) {
            case 1:
                gpgsvMethod();
                break;
            case 2:
                glgsvMethod();
                break;
            case 3:
                gngllMethod();
                break;
            case 4:
                gnrmcMethod();
                break;
            case 5:
                gnvtgMethod();
                break;
            case 6:
                gnggaMethod();
                break;
            case 7:
                gngsaMethod();
                break;

            default:
                System.out.println("You type wrong number");
        }


    }
}
