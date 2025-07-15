public class Lösung_0
{
    public static void main(String[] args)
    {
        //Künstler k = new Künstler(); // Nicht möglich, da Künstler abstrakt ist

        Künstler maler = new Künstler()
        {
            @Override
            public void kunstErstellen()
            {
                System.out.println("Ich male ein Bild");
            }
        };

        Künstler sänger = new Künstler()
        {
            @Override
            public void kunstErstellen()
            {
                System.out.println("Ich singe einen Song");
            }
        };

        maler.kunstErstellen();
        sänger.kunstErstellen();

    }
}

abstract class Künstler
{
    public abstract void kunstErstellen();
}