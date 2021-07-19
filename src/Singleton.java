public class Singleton {
 private static Singleton Singleton =new Singleton();
    private Singleton()
    {}

    public static Singleton getInstance()
    {
        return Singleton;
    }

    public void show()
    {
        System.out.println("Singleton pattern");
    }
}
