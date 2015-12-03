/**
 * Created by TS on 03.12.15.
 */
public class AnimalMain {

    public static void main(String[] args) {


        Animal dog1 = new Dog();
        Animal bd1 = new Bird();

        System.out.println("bd1 = " + bd1.tryToFly());
        System.out.println("dog1 = " + dog1.tryToFly());

        // Change the ability
        dog1.setFlyingAbility(new ItFlys());
        System.out.println("dog1 = " + dog1.tryToFly());
    }


}
