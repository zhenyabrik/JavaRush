package javarush;

/**
 * Created by User on 04.12.2016.
 */
public class Solution
{
    public static void main(String[] args) {
        int i;
        for(i=1; i<=10;i++)
        {
            Zerg zerg = new Zerg();
            zerg.name = "zerg"+i;
            System.out.println(zerg.name);
        }
        int y;
        for(y=1; y<=5;y++)
        {
            Protos protos = new Protos();
            protos.name = "protos"+y;
            System.out.println(protos.name);
        }
        int x;
        for(x=1; x<=12;x++)
        {
            Terran terran = new Terran();
            terran.name = "terran"+x;
            System.out.println(terran.name);
        }
    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}
