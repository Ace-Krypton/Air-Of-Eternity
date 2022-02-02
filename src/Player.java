import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {

    //System objects
    public static List<String> inventory = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    //Player stats (Balance, Name, Inventory Space, etc)
    public static double balance;
    String name;
    int inventorySpace = 11;
    int defaultBackpack = 10;
}
