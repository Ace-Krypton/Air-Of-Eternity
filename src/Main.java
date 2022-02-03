import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System Objects
        Scanner scan = new Scanner(System.in);

        //Boolean
        boolean mainWhile = true;

        //Loop
        MAINWHILE:
        while (mainWhile) {

            //Getting instance and creating object
            CreateCharacter create = new CreateCharacter();
            Shop shop = new Shop();
            Player player = new Player();
            Barbarian barbarian = new Barbarian();

            //Variables
            String userInput;   //For letters
            int input;  //For numbers

            //Methods
            menuForStartScreen();

            //User Input
            System.out.print("-> ");
            userInput = scan.next();

            //Option selecting
            switch (userInput.toUpperCase()) {
                case "1" -> {   //Play
                    while (true) {
                        //Character Creating Menu
                        create.menuForCharacterCreating();

                        //User Input
                        System.out.print("> ");
                        userInput = scan.next();

                        //Flow Control
                        switch (userInput.toUpperCase()) {
                            case "1" -> {   //Barbarian
                                System.out.println("+---------------------------------------------------------------+");
                                System.out.println("""
                            You are Barbarian, and enjoy copious amounts of STRENGTH and VITALITY!
                            Beating things over the head is one of your primary goals in life.
                            You are the most brutal warrior to have ever walked the planet.
                            Resilience is in your nature, and fear does not exist in your vocabulary.\s""");
                                System.out.println("+---------------------------------------------------------------+");
                                System.out.println("Press 'F' to continue");

                                //User Input
                                System.out.print("> ");
                                userInput = scan.next();

                                //Checking that user enters something besides "F"
                                while (!userInput.equalsIgnoreCase("F")) {
                                    System.out.println("Invalid command! Please try again");
                                    System.out.println("Press 'F' to continue");
                                    System.out.print("> ");
                                    userInput = scan.next();
                                }

                                //Flow control
                                if (userInput.equalsIgnoreCase("F")) {
                                    System.out.println("Your default weapon is " + barbarian.weapon + " , your HP is "
                                    + barbarian.HP);
                                }
                            }

                            case "2" -> {   //Paladin

                            }

                            case "3" -> {   //Assassin

                            }

                            case "4" -> {   //Wizard

                            }

                            case "5" -> {   //Druid

                            }

                            case "6" -> {   //Ranger

                            }

                            case "Q" -> {   //Swap

                            }

                            case "X" -> {   //Exit
                                continue MAINWHILE;
                            }

                            default -> System.out.println("Invalid command, Please try again");
                        }
                    }

                }

                case "2" -> {   //Settings

                }

                case "3" -> {   //Shop

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

                            //Loop
                            while (true) {

                                //BackPack Menu
                                shop.menuForBackPacks();

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

                                    case "X" -> { //Return
                                        continue MAINWHILE;
                                    }

                                    default -> System.out.println("Invalid command");
                                }
                            }
                        }
                        else shop.removeItem();
                    }

                    shop.menuShop();

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

                            //Loop
                            while (true) {
                                //Menu for Foods
                                shop.menuShopFood();

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

                                    case "X" -> {
                                        continue MAINWHILE;
                                    }

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

                case "4" -> //Credits
                        System.out.println("Developer Ramiz aka \"Krypton\"");

                case "X" -> //Exit
                        mainWhile = false;

                default -> System.out.println("Invalid command");
            }
        }
    }

    public static void menuForStartScreen() {    //Menu for start screen
        System.out.println("---------------------------------------------------------------");
        System.out.println("[1] Play (Under Development)");
        System.out.println("[2] Settings (Under Development)");
        System.out.println("[3] Shop");
        System.out.println("[4] Credits\n");
        System.out.println("[X] Exit");
        System.out.println("---------------------------------------------------------------");
    }
}
