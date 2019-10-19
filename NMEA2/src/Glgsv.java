public class Glgsv implements Circumcision {
    void glgsvMethod(String gpsType) {
        Main main = new Main();
        circumcision(gpsType);

        String type = main.subStr[0];
        int messQuant = main.subStr[1].equals("") ? 0 : Integer.parseInt(main.subStr[1]); //quantity massage
        int messageId = main.subStr[2].equals("") ? 0 : Integer.parseInt(main.subStr[2]); // number massage
        int qSat = main.subStr[3].equals("") ? 0 : Integer.parseInt(main.subStr[3]); //quantity satellite
        int satId = main.subStr[4].equals("") ? 0 : Integer.parseInt(main.subStr[4]); //number satellite
        int elevation = main.subStr[5].equals("") ? 0 : Integer.parseInt(main.subStr[5]); //elevation angle
        int azimuth = main.subStr[6].equals("") ? 0 : Integer.parseInt(main.subStr[6]); //azimuth
        int snr = main.subStr[7].equals("") ? 0 : Integer.parseInt(main.subStr[7]); //signal strength
        int satId1 = main.subStr[8].equals("") ? 0 : Integer.parseInt(main.subStr[8]); //number satellite
        int elevation1 = main.subStr[9].equals("") ? 0 : Integer.parseInt(main.subStr[9]); //elevation angle
        int azimuth1 = main.subStr[10].equals("") ? 0 : Integer.parseInt(main.subStr[10]); //azimuth
        int snr1 = main.subStr[11].equals("") ? 0 : Integer.parseInt(main.subStr[11]); //signal strength
        int satId2 = main.subStr[12].equals("") ? 0 : Integer.parseInt(main.subStr[12]);
        int elevation2 = main.subStr[13].equals("") ? 0 : Integer.parseInt(main.subStr[13]);
        int azimuth2 = main.subStr[14].equals("") ? 0 : Integer.parseInt(main.subStr[14]);
        int snr2 = main.subStr[15].equals("") ? 0 : Integer.parseInt(main.subStr[15]);

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
}
