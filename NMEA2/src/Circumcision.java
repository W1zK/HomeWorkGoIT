public interface Circumcision {


    default void circumcision(String name) {
        String delimeter = ",";
        Main.subStr = name.split(delimeter);
        Main.subStr[0] = Main.subStr[0].substring(1);
        Main.subStr[Main.subStr.length - 1] = Main.subStr[Main.subStr.length - 1].substring(0, Main.subStr[Main.subStr.length - 1].indexOf("*"));
    }

}
