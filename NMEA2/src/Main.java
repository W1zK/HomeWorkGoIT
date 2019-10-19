import java.util.Scanner;

public class Main implements MassageStrings{
    static String[] subStr;
    public static void main(String[] args) {
        Glgsv glgsv = new Glgsv();
        Gpgsv gpgsv = new Gpgsv();
        Gngll gngll = new Gngll();
        Gnrmc gnrmc = new Gnrmc();
        Gnvtg gnvtg = new Gnvtg();
        Gngga gngga = new Gngga();
        Gngsa gngsa = new Gngsa();
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("1-GPGSV | 2-GLGSV | 3-GNGLL | 4-GNRMC | 5-GNVTG | 6-GNGGA | 7 -GNGSA" +
                "\nEnter number:");
        x = sc.nextInt();
        switch (x) {
            case 1:
                gpgsv.gpgsvMethod(GPGSV);
                break;
            case 2:
                glgsv.glgsvMethod(GLGSV);
                break;
            case 3:
                gngll.gngllMethod(GNGLL);
                break;
            case 4:
                gnrmc.gnrmcMethod(GNRMC);
                break;
            case 5:
                gnvtg.gnvtgMethod(GNVTG);
                break;
            case 6:
                gngga.gnggaMethod(GNGGA);
                break;
            case 7:
                gngsa.gngsaMethod(GNGSA);
                break;

            default:
                System.out.println("You type wrong number");
        }
    }
}
