import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System Objects
        Scanner scan = new Scanner(System.in);

        //Variables
        String userInput;   //For letters
        int input;  //For numbers

        //Methods
        menu();

        //User Input
        System.out.print("-> ");
        userInput = scan.next();

        //Option selecting
        switch (userInput.toUpperCase()) {
            case "1" -> {
                CreateCharacter create = new CreateCharacter();
                create.menuForCharacterCreating();
            }

            case "2" -> {
                //Settings
            }

            case "3" -> {
                //Getting instance and creating object
                Shop shop = new Shop();
                Player player = new Player();

                //I have to write while loop here

                    //First menu in shop
                    if (player.inventorySpace > player.defaultBackpack) {
                        System.out.println("---------------------------------------------------------------");
                        System.out.println("""
                            You don't have empty space in your inventory
                            You either buy new backpack or remove your items
                            Type "remove" to remove your item
                            If you don't want to remove item from your inventory go and buy fucking backpack you idiot
                            Type "backpack" for buying backpack\s""");

                        //User Input
                        System.out.print("> ");
                        userInput = scan.next();

                        //Loop
                        while (!userInput.equalsIgnoreCase("remove") && !userInput.equalsIgnoreCase("backpack")) {
                            System.out.println("Invalid command! Please try again");
                            System.out.println("""
                            You don't have empty space in your inventory
                            You either buy new backpack or remove your items
                            Type "remove" to remove your item
                            If you don't want to remove item from your inventory go and buy fucking backpack you idiot
                            Type "backpack" for buying backpack\s""");
                            System.out.print("> ");
                            userInput = scan.next();
                        }

                        //Flow Control
                        if (userInput.equalsIgnoreCase("backpack")) {
                            boolean backPackLoop = true;

                            //Loop
                            while (backPackLoop) {

                                //BackPack Menu
                                menuForBackPacks();

                                //User Input
                                System.out.print("> ");
                                userInput = scan.next();

                                switch (userInput.toUpperCase()) {
                                    case "1" -> {   //Level 1 BackPack
                                        if (Player.balance >= Shop.getLvl1BackPackPrice()) {
                                            Player.balance -= Shop.getLvl1BackPackPrice();
                                            player.defaultBackpack += 5;
                                            System.out.println("You have successfully bought \"Level 1 BackPack\"");
                                        }
                                        else {
                                            System.out.println("Sorry, you don't have sufficient funds");
                                        }
                                    }

                                    case "2" -> {   //Level 2 BackPack
                                        if (Player.balance >= Shop.getLvl2BackPackPrice()) {
                                            Player.balance -= Shop.getLvl2BackPackPrice();
                                            player.defaultBackpack += 10;
                                            System.out.println("You have successfully bought \"Level 2 BackPack\"");
                                        }
                                        else System.out.println("Sorry, you don't have sufficient funds");
                                    }

                                    case "3" -> {   //Level 3 BackPack
                                        if (Player.balance >= Shop.getLvl3BackPackPrice()) {
                                            Player.balance -= Shop.getLvl3BackPackPrice();
                                            player.defaultBackpack += 15;
                                            System.out.println("You have successfully bought \"Level 3 BackPack\"");
                                        }
                                        else System.out.println("Sorry, you don't have sufficient funds");
                                    }

                                    case "X" -> //Return
                                            backPackLoop = false;

                                    default -> System.out.println("Invalid command");
                                }
                            }
                        }
                        else shop.removeItem();
                    }
                menuShop();

                //User input and Switch
                System.out.print("> ");
                userInput = scan.next();

                switch (userInput) {
                    case "1" -> {     //Foods
                        while (true) {
                            //Preheat Stove
                            System.out.println("---------------------------------------------------------------");
                            System.out.println("Do you want to preheat stove? 'Y' for yes 'N' for no");

                            //User input
                            System.out.print("> ");
                            userInput = scan.next();

                            //If user enters something besides 'Y' or 'N'
                            while (!userInput.equalsIgnoreCase("Y") && !userInput.equalsIgnoreCase("N") ) {
                                System.out.println("Invalid command! Please try again");
                                System.out.println("Do you want to preheat stove? 'Y' for yes, 'N' for no");
                                System.out.print("> ");
                                userInput = scan.next();
                            }

                            //Flow control
                            if (userInput.equalsIgnoreCase("Y")) shop.preheatStove();    //Heating stove
                            else break;
                        }

                            //Displaying foods
                            System.out.println("---------------------------------------------------------------");
                            System.out.println("Do you want to display foods in shop? 'Y' for yes, 'N' for no");

                            //User Input
                            System.out.print("> ");
                            userInput = scan.next();

                            //If user enters something besides 'Y' or 'N'
                            while (!userInput.equalsIgnoreCase("Y") && !userInput.equalsIgnoreCase("N") ) {
                                System.out.println("Invalid command! Please try again");
                                System.out.println("Do you want to display foods in shop? 'Y' for yes, 'N' for no");
                                System.out.print("> ");
                                userInput = scan.next();
                            }

                            //Flow Control
                            if (userInput.equalsIgnoreCase("Y")) {
                                System.out.println("---------------------------------------------------------------");
                                shop.showCooks();
                                System.out.println("\n");
                            }


                        boolean foodLoop = true;
                        //Loop
                        while (foodLoop) {
                            //Menu for Foods
                            menuShopFood();

                            //User input
                            System.out.print("> ");
                            userInput = scan.next();

                            //Switch
                            switch (userInput) {
                                case "1" -> {
                                    //Bread
                                    if (Player.balance >= Shop.getBreadPrice()) {
                                        Player.balance -= Shop.getBreadPrice();
                                        Player.inventory.add("Bread");
                                        player.inventorySpace++;
                                        System.out.println("You have successfully bought \"Bread\"");

                                    }
                                    else System.out.println("Sorry, you don't have sufficient funds");
                                }

                                case "2" -> {
                                    //Roll
                                    if (Player.balance >= Shop.getRollPrice()) {
                                        Player.balance -= Shop.getRollPrice();
                                        Player.inventory.add("Roll");
                                        player.inventorySpace++;
                                        System.out.println("You have successfully bought \"Roll\"");
                                    }

                                    else System.out.println("Sorry, you don't have sufficient funds");
                                }

                                case "3" -> {
                                    //Apple
                                    if (Player.balance >= Shop.getApplePrice()) {
                                        Player.balance -= Shop.getApplePrice();
                                        Player.inventory.add("Apple");
                                        player.inventorySpace++;
                                        System.out.println("You have successfully bought \"Apple\"");
                                    }

                                    else System.out.println("Sorry, you don't have sufficient funds");
                                }

                                case "4" -> {
                                    //Cherry
                                    if (Player.balance >= Shop.getCherryPrice()) {
                                        Player.balance -= Shop.getCherryPrice();
                                        Player.inventory.add("Cherry");
                                        player.inventorySpace++;
                                        System.out.println("You have successfully bought \"Cherry\"");
                                    }

                                    else System.out.println("Sorry, you don't have sufficient funds");
                                }

                                case "5" -> {
                                    //Walnut Bread
                                    if (Player.balance >= Shop.getWalnutBreadPrice()) {
                                        Player.balance -= Shop.getWalnutBreadPrice();
                                        Player.inventory.add("Walnut Bread");
                                        player.inventorySpace++;
                                        System.out.println("You have successfully bought \"Walnut Bread\"");
                                    }

                                    else System.out.println("Sorry, you don't have sufficient funds");
                                }

                                case "X" -> foodLoop = false;

                                default -> System.out.println("Invalid command");
                            }
                        }
                    }

                    case "2" -> {   //Armor

                    }

                    case "3" -> {    //Potions

                    }

                    case "4" -> {   //BackPacks

                    }

                    default -> System.out.println("Invalid command");
                }
            }

            case "4" -> {
                //Credits
            }

            case "X" -> {
                //Exit
            }

            default -> System.out.println("Invalid command");
        }
    }

    public static void menu() {    //Menu for start screen
        System.out.println("---------------------------------------------------------------");
        System.out.println("[1] Play");
        System.out.println("[2] Settings");
        System.out.println("[3] Shop");
        System.out.println("[4] Credits\n");
        System.out.println("[X] Exit");
        System.out.println("---------------------------------------------------------------");
    }

    public static void menuShop() {
        System.out.println("---------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\tWelcome to Shop");
        System.out.println("[1] Foods");
        System.out.println("[2] Armor");
        System.out.println("[3] Potions");
        System.out.println("[4] BackPacks");
        System.out.println("[X] Exit");
    }

    public static void menuShopFood() {
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

    public static void menuForBackPacks() {
        System.out.println("---------------------------------------------------------------");
        System.out.println("\t\t\t\t\tWelcome to BackPack Shop");
        System.out.println("[1] Level 1 (BackPack) -- 50 gold");
        System.out.println("[2] Level 2 (BackPack) -- 80 gold");
        System.out.println("[3] Level 3 (BackPack) -- 130 gold");
        System.out.println("[X] Exit");
        System.out.println("---------------------------------------------------------------");
    }
}
