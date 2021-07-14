package pl.pwilkosz.designpatterns.strategy;

public class Demo {
    public static void main(String[] argc){
        System.out.println("*** Strategy Design Pattern Demo ***");

        Heroe heroe = new Viking();
        heroe.changeFightingStrategy(
                new KnifeFighting()
        );

        System.out.println(heroe.startFighting());

        /* Changing fighting strategy */
        heroe.changeFightingStrategy(
                new SwordFighting()
        );

        System.out.println(heroe.startFighting());
    }
}
