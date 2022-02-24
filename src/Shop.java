import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {

    //Menu Shop

    public void menuShop() {
        System.out.println("---------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\tWelcome to Shop");
        System.out.println("[1] Foods");
        System.out.println("[2] Armor (Under Development)");
        System.out.println("[3] Potions (Under Development)");
        System.out.println("[4] BackPacks");
        System.out.println("[X] Exit");
    }

    //Food Shop

    List<String> cooks = new ArrayList<>();
    String[] foods = {"Rolls", "Breads", "Apple", "Cherry", "Walnut Bread"};
    Scanner scan = new Scanner(System.in);

    //Variables

    String userInput;   //For letters
    int input;  //For numbers

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

    public void removeItem() {
        try {
            System.out.println("\nType the name of the item that you wanna remove");
            System.out.print("> ");
            userInput = scan.next();
            for (String items : Player.inventory) {
                if (items.equalsIgnoreCase(userInput)) {
                    Player.inventory.remove(userInput);
                }
            }
        } catch (Exception e) {
            System.out.println("You don't have anything in your inventory");
        }
    }

    public void menuShopFood() {
        System.out.println("---------------------------------------------------------------");
        System.out.println("\t\t\t\t\tWelcome to Food Shop");
        System.out.println("[1] Bread -- 2.87 gold");
        System.out.println("[2] Rolls -- 1.24 gold");
        System.out.println("[3] Apple -- 0.82 gold");
        System.out.println("[4] Cherry -- 0.24 gold");
        System.out.println("[5] Walnut Bread -- 5.78 gold");
        System.out.println("[X] Exit");
        System.out.println("---------------------------------------------------------------");
    }

    //Armor Shop

    List<String> armorsAsList = new ArrayList<>();
    String[] heavyArmors = {"Half plate", "Iron Mail", "Plate Mail", "Fluted", "Reflex", "Element Mail"};
    String[] lightArmors = {"Leather Breastplate", "Ring Armor", "Scale Armor", "Segmentator", "Talisman Breasplate", "Brigandine"};
    String[] robes = {"Hemp Clothes", "Adventure's Clothes", "Leather Armor", "Robe of Calm", "Cape of Prayer", "Gypsy Dress", "Holy Veil"};

    //Heavy armor prices

    final private static double halfPlatePrice = 540;
    final private static double ironMailPrice = 1880;
    final private static double plateMailPrice = 2600;
    final private static double flutedPrice = 4040;
    final private static double reflexPrice = 7000;
    final private static double elementMailPrice = 9000;

    //Light armor prices

    final private static double leatherBreastPlatePrice = 36;
    final private static double ringArmorPrice = 194;
    final private static double scaleArmorPrice = 870;
    final private static double segmentatorPrice = 1500;
    final private static double talismanBreasplatePrice = 3660;
    final private static double brigandinePrice = 4980;

    //Robes prices

    final private static double hempClothesPrice = 12;
    final private static double adventureClothePrice = 96;
    final private static double leatherArmorPrice = 340;
    final private static double robeOfCalmPrice = 674;
    final private static double capeOfPrayerPrice = 1128;
    final private static double gypsyDressPrice = 1580;
    final private static double holyVeilPrice = 3080;

    //Getters for Heavy Armors

    public static double getHalfPlatePrice() {
        return halfPlatePrice;
    }

    public static double getIronMailPrice() {
        return ironMailPrice;
    }

    public static double getPlateMailPrice() {
        return plateMailPrice;
    }

    public static double getFlutedPrice() {
        return flutedPrice;
    }

    public static double getReflexPrice() {
        return reflexPrice;
    }

    public static double getElementMailPrice() {
        return elementMailPrice;
    }

    //Getters for Light Armors

    public static double getLeatherBreastPlatePrice() {
        return leatherBreastPlatePrice;
    }

    public static double getRingArmorPrice() {
        return ringArmorPrice;
    }

    public static double getScaleArmorPrice() {
        return scaleArmorPrice;
    }

    public static double getSegmentatorPrice() {
        return segmentatorPrice;
    }

    public static double getTalismanBreasplatePrice() {
        return talismanBreasplatePrice;
    }

    public static double getBrigandinePrice() {
        return brigandinePrice;
    }

    //Getters for Robes

    public static double getHempClothesPrice() {
        return hempClothesPrice;
    }

    public static double getAdventureClothePrice() {
        return adventureClothePrice;
    }

    public static double getLeatherArmorPrice() {
        return leatherArmorPrice;
    }

    public static double getRobeOfCalmPrice() {
        return robeOfCalmPrice;
    }

    public static double getCapeOfPrayerPrice() {
        return capeOfPrayerPrice;
    }

    public static double getGypsyDressPrice() {
        return gypsyDressPrice;
    }

    public static double getHolyVeilPrice() {
        return holyVeilPrice;
    }


    //BackPacks

    List<String> backPacksAsList = new ArrayList<>(); //BackPacks as List (Just In Case)
    String[] backPacksAsArray = {"LVL 1 BackPack", "LVL 2 BackPack", "LVL 3 BackPack"}; //BackPacks as Array

    //BackPack Spaces
    final private static double lvl1BackPackSpace = 20;
    final private static double lvl2BackPackSpace = 40;
    final private static double lvl3BackPackSpace = 60;


    //BackPack Prices

    final private static double lvl1BackPackPrice = 50;
    final private static double lvl2BackPackPrice = 80;
    final private static double lvl3BackPackPrice = 130;

    //Getters

    public static double getLvl1BackPackPrice() {
        return lvl1BackPackPrice;
    }

    public static double getLvl2BackPackPrice() {
        return lvl2BackPackPrice;
    }

    public static double getLvl3BackPackPrice() {
        return lvl3BackPackPrice;
    }

    public static double getLvl1BackPackSpace() {
        return lvl1BackPackSpace;
    }

    public static double getLvl2BackPackSpace() {
        return lvl2BackPackSpace;
    }

    public static double getLvl3BackPackSpace() {
        return lvl3BackPackSpace;
    }


    public void menuForBackPacks() {
        System.out.println("---------------------------------------------------------------");
        System.out.println("\t\t\t\t\tWelcome to BackPack Shop");
        System.out.println("[1] Level 1 (BackPack) -- 50 gold");
        System.out.println("[2] Level 2 (BackPack) -- 80 gold");
        System.out.println("[3] Level 3 (BackPack) -- 130 gold");
        System.out.println("[X] Exit");
        System.out.println("---------------------------------------------------------------");
    }
}
