package javarush;

/**
 * Created by Yevhenii.Bryk on 07.12.2016.
 */
public class International {

    public static void main (String [] args){
            Ukrainian ukrainian = new Ukrainian();
            ukrainian.name = "Eliot";
            System.out.println(ukrainian.name);

            Spanish spanish = new Spanish();
            spanish.name = "Maks";
            System.out.println(spanish.name);

            English english = new English();
            english.name = "Matt";
            System.out.println(english.name);
    }

    public static class Ukrainian {
        public String name;
    }

    public static class Spanish {
        public String name;
    }

    public static class English{
        public String name;
    }
}
