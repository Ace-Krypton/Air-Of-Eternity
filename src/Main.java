import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System Objects
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

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
            Dungeon dungeon = new Dungeon();
            Quests quests = new Quests();

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
                                    System.out.println("+---------------------------------------------------------------+");
                                    System.out.println("Your default weapon is " + barbarian.weapon + " , your HP is "
                                    + barbarian.HP);
                                    System.out.println("+---------------------------------------------------------------+");
                                }

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

                                if (userInput.equalsIgnoreCase("F")) {
                                    System.out.println("+---------------------------------------------------------------+");
                                    System.out.println("Please enter your name");
                                    System.out.print("> ");
                                    player.name = scan.next();
                                    System.out.println("+---------------------------------------------------------------+");
                                    System.out.println("Your name is " + player.name + ". You are a Barbarian, of Human descent.");
                                    System.out.println("""
                                        You were born mysteriously. People always asked you how is bobby formed.
                                        Raised by a rabbi, you lived in constant fear of scissors.
                                        You always regretted being a Bokononian. So it goes.
                                        One who can tie a cherry stem with your tongue, you are downright sexy.
                                        Today you woke up hungry... ...a strange odor makes its way into your eyes. You cry.
                                        Suddenly, a woman carrying another woman tosses the other woman into you.
                                        Unsure of your sexuality, you kiss the woman, then punch her in the face.
                                        This is your story.
                                        
                                        Press 'F' to continue\s""");
                                    System.out.println("+---------------------------------------------------------------+");

                                    //User Input
                                    System.out.print("> ");
                                    userInput = scan.next();

                                    while (!userInput.equalsIgnoreCase("F")) {
                                        System.out.println("Invalid command! Please try again");
                                        System.out.println("Press 'F' to continue");
                                        System.out.print("> ");
                                        userInput = scan.next();
                                    }

                                    while (true) {
                                        if (userInput.equalsIgnoreCase("F")) {
                                            System.out.println("+---------------------------------------------------------------+");
                                            System.out.println("What you want to do?");
                                            System.out.println("[1] Enter The Story Mode (Under Development)");
                                            System.out.println("[2] Enter The Dungeon");
                                            System.out.println("+---------------------------------------------------------------+");
                                            System.out.print("> ");
                                            userInput = scan.next();

                                            switch (userInput.toUpperCase()) {
                                                case "1" -> {   //Story Mode
                                                    System.out.println("+---------------------------------------------------------------+");
                                                    System.out.println("\t\t\t\tUnknown Stranger");
                                                    System.out.println("+---------------------------------------------------------------+");
                                                    System.out.println("> I *knew* you were alive!");
                                                    System.out.println("+---------------------------------------------------------------+");
                                                    System.out.println("Press 'F' to continue");
                                                    System.out.print("> ");
                                                    userInput = scan.next();

                                                    //Checking that user enters something besides "F"
                                                    while (!userInput.equalsIgnoreCase("F")) {
                                                        System.out.println("Invalid command! Please try again");
                                                        System.out.println("Press 'F' to continue");
                                                        System.out.print("> ");
                                                        userInput = scan.next();
                                                    }

                                                    if (userInput.equalsIgnoreCase("F")) {
                                                        System.out.println("+---------------------------------------------------------------+");
                                                        System.out.println("\t\t\t\tUnknown Stranger");
                                                        System.out.println("+---------------------------------------------------------------+");
                                                        System.out.println("> Here, have some of these items to keep you company.");
                                                        System.out.println("+---------------------------------------------------------------+");
                                                        System.out.println("Press 'F' to continue");
                                                        System.out.print("> ");
                                                        userInput = scan.next();

                                                        //Checking that user enters something besides "F"
                                                        while (!userInput.equalsIgnoreCase("F")) {
                                                            System.out.println("Invalid command! Please try again");
                                                            System.out.println("Press 'F' to continue");
                                                            System.out.print("> ");
                                                            userInput = scan.next();
                                                        }

                                                        if (userInput.equalsIgnoreCase("F")) {
                                                            System.out.println("+---------------------------------------------------------------+");
                                                            System.out.println("\t\t\t\tUnknown Stranger");
                                                            System.out.println("+---------------------------------------------------------------+");
                                                            System.out.println("> Do listen, go to Gate 16, you may find solace there");
                                                            System.out.println("+---------------------------------------------------------------+");
                                                            System.out.println("Press 'F' to continue");
                                                            System.out.print("> ");
                                                            userInput = scan.next();

                                                            //Checking that user enters something besides "F"
                                                            while (!userInput.equalsIgnoreCase("F")) {
                                                                System.out.println("Invalid command! Please try again");
                                                                System.out.println("Press 'F' to continue");
                                                                System.out.print("> ");
                                                                userInput = scan.next();
                                                            }

                                                            if (userInput.equalsIgnoreCase("F")) {
                                                                System.out.println("+---------------------------------------------------------------+");
                                                                System.out.println("LOOT: You have received a heavy create of Gold Pieces!");
                                                                System.out.println("+---------------------------------------------------------------+");
                                                                System.out.println("Press 'F' to continue");
                                                                System.out.print("> ");
                                                                userInput = scan.next();

                                                                while (!userInput.equalsIgnoreCase("F")) {
                                                                    System.out.println("Invalid command! Please try again");
                                                                    System.out.println("Press 'F' to continue");
                                                                    System.out.print("> ");
                                                                    userInput = scan.next();
                                                                }

                                                                if (userInput.equalsIgnoreCase("F")) {
                                                                    System.out.println("+---------------------------------------------------------------+");
                                                                    String randomNewWeapon = Weapons.axes[rand.nextInt(Weapons.axes.length)];
                                                                    //while (randomNewWeapon.equals(barbarian.weapon)) randomNewWeapon = Weapons.axes[rand.nextInt(Weapons.axes.length)];
                                                                    System.out.println("Your new weapon is " + randomNewWeapon);
                                                                    System.out.println("Your old weapon is " + barbarian.weapon);
                                                                    System.out.println("[E] Equip      [S] Salvage");
                                                                    System.out.print("> ");
                                                                    userInput = scan.next();

                                                                    while (!userInput.equalsIgnoreCase("E") && !userInput.equalsIgnoreCase("S")) {
                                                                        System.out.println("Invalid command! Please try again");
                                                                        System.out.println("[E] Equip      [S] Salvage");
                                                                        System.out.print("> ");
                                                                        userInput = scan.next();
                                                                    }

                                                                    if (userInput.equalsIgnoreCase("E")) {  //Equip
                                                                        switch (randomNewWeapon.toUpperCase()) {
                                                                            case "RAIDER AXE" -> {
                                                                                System.out.print("Your new weapon is Raider Axe");
                                                                                System.out.println(" [DMG] -> " + Weapons.raiderAxeDMG);
                                                                                barbarian.weapon = randomNewWeapon;
                                                                            }

                                                                            case "BATTLE AXE" -> {
                                                                                System.out.print("Your new weapon is Battle Axe");
                                                                                System.out.println(" [DMG] -> " + Weapons.battleAxeDMG);
                                                                                barbarian.weapon = randomNewWeapon;
                                                                            }

                                                                            case "WOODSMAN'S AXE" -> {
                                                                                System.out.print("Your new weapon is Woodsman's Axe");
                                                                                System.out.println(" [DMG] -> " + Weapons.woodsmanAxeDMG);
                                                                                barbarian.weapon = randomNewWeapon;
                                                                            }

                                                                        }
                                                                    }

                                                                    System.out.println("Press 'F' to continue");
                                                                    System.out.print("> ");
                                                                    userInput = scan.next();

                                                                    while (!userInput.equalsIgnoreCase("F")) {
                                                                        System.out.println("Invalid command! Please try again");
                                                                        System.out.println("Press 'F' to continue");
                                                                        System.out.print("> ");
                                                                        userInput = scan.next();
                                                                    }

                                                                    System.out.println("+---------------------------------------------------------------+");
                                                                    System.out.println("| HP: " + barbarian.HP + " / " + barbarian.maxHP + " ATK: " + barbarian.weapon + " GOLD: " + player.gold + "                       |");
                                                                    System.out.println("+---------------------------------------------------------------+");
                                                                    quests.randomQuest();
                                                                    System.out.println("| [Quest] " + quests.story + "        |                                |");
                                                                    System.out.println("+---------------------------------------------------------------+");
                                                                    System.out.println("|                              |                                |");
                                                                    quests.questState();
                                                                    System.out.println("|                              |                                |");
                                                                    System.out.println("+---------------------------------------------------------------+");
                                                                }
                                                            }
                                                        }
                                                    }
                                                }

                                                case "2" -> //Dungeon
                                                        dungeon.adventure();

                                                default -> System.out.println("Invalid command");
                                            }
                                        }
                                    }
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
                                switch (userInput.toUpperCase()) {
                                    case "1" -> {
                                        //Bread
                                        if (Player.balance >= Shop.getBreadPrice() && !shop.cooks.isEmpty()) {
                                            Player.balance -= Shop.getBreadPrice();
                                            Player.inventory.add("Bread");
                                            player.inventorySpace++;
                                            System.out.println("You have successfully bought \"Bread\"");
                                        }

                                        else System.out.println("Sorry, you don't have sufficient funds or shop is empty" +
                                                " please preheat oven");
                                    }

                                    case "2" -> {
                                        //Roll
                                        if (Player.balance >= Shop.getRollPrice() && !shop.cooks.isEmpty()) {
                                            Player.balance -= Shop.getRollPrice();
                                            Player.inventory.add("Roll");
                                            player.inventorySpace++;
                                            System.out.println("You have successfully bought \"Roll\"");
                                        }

                                        System.out.println("Sorry, you don't have sufficient funds or shop is empty" +
                                                " please preheat oven");
                                    }

                                    case "3" -> {
                                        //Apple
                                        if (Player.balance >= Shop.getApplePrice() && !shop.cooks.isEmpty()) {
                                            Player.balance -= Shop.getApplePrice();
                                            Player.inventory.add("Apple");
                                            player.inventorySpace++;
                                            System.out.println("You have successfully bought \"Apple\"");
                                        }

                                        else System.out.println("Sorry, you don't have sufficient funds or shop is empty" +
                                                " please preheat oven");
                                    }

                                    case "4" -> {
                                        //Cherry
                                        if (Player.balance >= Shop.getCherryPrice() && !shop.cooks.isEmpty()) {
                                            Player.balance -= Shop.getCherryPrice();
                                            Player.inventory.add("Cherry");
                                            player.inventorySpace++;
                                            System.out.println("You have successfully bought \"Cherry\"");
                                        }

                                        else System.out.println("Sorry, you don't have sufficient funds or shop is empty" +
                                                " please preheat oven");
                                    }

                                    case "5" -> {
                                        //Walnut Bread
                                        if (Player.balance >= Shop.getWalnutBreadPrice() && !shop.cooks.isEmpty()) {
                                            Player.balance -= Shop.getWalnutBreadPrice();
                                            Player.inventory.add("Walnut Bread");
                                            player.inventorySpace++;
                                            System.out.println("You have successfully bought \"Walnut Bread\"");
                                        }

                                        else System.out.println("Sorry, you don't have sufficient funds or shop is empty" +
                                                " please preheat oven");
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
                            //Loop
                            while (true) {
                                shop.menuForBackPacks();

                                //User input and Switch
                                System.out.print("> ");
                                userInput = scan.next();



                                switch (userInput.toUpperCase()) {
                                    case "1" -> {   //Level 1 backpack
                                        if (Player.balance >= Shop.getLvl1BackPackPrice()) {
                                            Player.balance -= Shop.getLvl1BackPackPrice();
                                            player.defaultBackpack = Shop.getLvl1BackPackSpace();
                                            System.out.println("You have successfully bought \"Level 1 BackPack\"");
                                        }

                                        else System.out.println("You don't have sufficient funds");
                                    }

                                    case "2" -> {   //Level 2 backpack
                                        if (Player.balance >= Shop.getLvl2BackPackPrice()) {
                                            Player.balance -= Shop.getLvl2BackPackPrice();
                                            player.defaultBackpack = Shop.getLvl2BackPackSpace();
                                            System.out.println("You have successfully bought \"Level 2 BackPack\"");
                                        }

                                        else System.out.println("You don't have sufficient funds");
                                    }

                                    case "3" -> {   //Level 3 backpack
                                        if (Player.balance >= Shop.getLvl3BackPackPrice()) {
                                            Player.balance -= Shop.getLvl3BackPackPrice();
                                            player.defaultBackpack = Shop.getLvl3BackPackSpace();
                                            System.out.println("You have successfully bought \"Level 3 BackPack\"");
                                        }

                                        else System.out.println("You don't have sufficient funds");
                                    }

                                    case "X" -> {
                                        continue MAINWHILE;
                                    }

                                    default -> System.out.println("Invalid Command");
                                }
                            }
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
