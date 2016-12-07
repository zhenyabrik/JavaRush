package javarush;

/**
 * Created by User on 05.12.2016.
 */

public class Converter {

    public static int MeterToMilimeter(int x){
        int y = x * 1000;
        return y;
    }
    public static int MeterToSantimeter(int x) {
        int z = x * 100;
        return z;
    }
    public static double DollarsToUAH(double courseD){
        double a = courseD * 55.78;
        return a;
    }
    public  static double EuroToUAH(double courseE){
        double b = courseE * 100;
        return b;
    }


    public static void main(String[] args) {
        //System.out.println(MeterToMilimeter(199));
        //System.out.println(MeterToSantimeter(199));
        System.out.println(DollarsToUAH(27.10));
        //System.out.println(EuroToUAH(29.55));
    }
}