import java.util.ArrayList;
import java.util.List;

public class Shop {

    //Food Shop
    List<String> cooks = new ArrayList<>();
    String[] foods = {"Rolls", "Breads", "Apple", "Cherry", "Walnut Bread"};

    //Fields
    final private static double breadPrice = 2.87;
    final private static double rollPrice = 1.24;
    final private static double applePrice = 0.82;
    final private static double cherryPrice = 0.24;
    final private static double walnutBreadPrice = 5.78;

    //Getters
    public static double getBreadPrice() {
        return breadPrice;
    }

    public static double getRollPrice() {
        return rollPrice;
    }

    public static double getApplePrice() {
        return applePrice;
    }

    public static double getCherryPrice() {
        return cherryPrice;
    }

    public static double getWalnutBreadPrice() {
        return walnutBreadPrice;
    }

    //Methods
    public void preheatStove() {
        cooks.addAll(List.of(foods));
    }

    public void showCooks() {
        for (String cook : cooks) {
            System.out.print(cook + " ");
        }
    }

    //Armor Shop
    List<String> armorsAsList = new ArrayList<>();
    String[] heavyArmors = {"Half plate", "Iron Mail", "Plate Mail", "Fluted", "Reflex", "Element Mail", "Megaton Mail", "Fighting Armor"};
    String[] lightArmors = {"Leather Breastplate", "Ring Armor", "Scale Armor", "Segmentator", "Talisman Breasplate", "Brigandine"};
    String[] robes = {"Hemp Clothes", "Adventure's Clothes", "Leather Armor", "Robe of Calm", "Cape of Prayer", "Gypsy Dress", "Holy Veil"};
}
