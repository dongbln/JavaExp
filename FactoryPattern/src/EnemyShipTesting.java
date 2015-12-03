import java.util.Scanner;

/**
 * Created by TS on 03.12.15.
 */
public class EnemyShipTesting {

    public static void main(String[] args) {
        EnemyShipFactory shipFactory = new EnemyShipFactory();

        EnemyShip theEnemy = null;

        // Get input form console
        if (args.length == 0) {
            System.out.println("What type of ship ? (U / R / B)");
            Scanner userInput = new Scanner(System.in);

            if (userInput.hasNextLine()) {
                String typeOfShip = userInput.nextLine();

                // Create the ship
                theEnemy = shipFactory.makeEnemyShip(typeOfShip);

            }
        }

        // Get input form args
        else {
            /* get arguments */
            String userInput = args[0];

            if (userInput != null) {
                String typeOfShip = userInput;

                // Create the ship
                theEnemy = shipFactory.makeEnemyShip(typeOfShip);
            }
        }

        if (theEnemy != null) {
            doStuffEnemy(theEnemy);
        } else System.out.println("Enter U/R/B next time...");


    }

    private static void doStuffEnemy(EnemyShip anEnemyShip) {

        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }

}
