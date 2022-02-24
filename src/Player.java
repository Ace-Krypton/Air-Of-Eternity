import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {

    //System objects
    public static List<String> inventory = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    //Player stats (Balance, Name, Inventory Space, etc)
    public static double balance = 90;
    String name;
    int inventorySpace;
    double defaultBackpack = 10;
    double gold;

    //Methods
    public void showInventory() {   //Displaying items in inventory
        for (String inv : inventory) {
            System.out.print(inv + " ");
        }
    }

    public void dayMechanics() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
