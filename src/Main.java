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
                //First menu in shop
                menuShop();

                //User input and Switch
                System.out.print("> ");
                userInput = scan.next();

                switch (userInput) {
                    case "1" -> {     //Foods
                        //Menu for Foods
                        menuShopFood();

                        //User input
                        System.out.print("> ");
                        input = scan.nextInt();

                        //Switch
                        switch (input) {
                            case 1 -> {
                                //Bread
                                if (Player.balance >= Shop.getBreadPrice()) {
                                    Player.balance -= Shop.getBreadPrice();
                                    Player.inventory.add("Bread");
                                }

                                else System.out.println("Sorry, you don't have sufficient funds");
                            }

                            case 2 -> {
                                //Roll
                                if (Player.balance >= Shop.getRollPrice()) {
                                    Player.balance -= Shop.getRollPrice();
                                    Player.inventory.add("Roll");
                                }

                                else System.out.println("Sorry, you don't have sufficient funds");
                            }

                            case 3 -> {
                                //Apple
                                if (Player.balance >= Shop.getApplePrice()) {
                                    Player.balance -= Shop.getApplePrice();
                                    Player.inventory.add("Apple");
                                }

                                else System.out.println("Sorry, you don't have sufficient funds");
                            }

                            case 4 -> {
                                //Cherry
                                if (Player.balance >= Shop.getCherryPrice()) {
                                    Player.balance -= Shop.getCherryPrice();
                                    Player.inventory.add("Cherry");
                                }

                                else System.out.println("Sorry, you don't have sufficient funds");
                            }

                            case 5 -> {
                                //Walnut Bread
                                if (Player.balance >= Shop.getWalnutBreadPrice()) {
                                    Player.balance -= Shop.getWalnutBreadPrice();
                                    Player.inventory.add("Walnut Bread");
                                }

                                else System.out.println("Sorry, you don't have sufficient funds");
                            }

                            default -> System.out.println("Invalid command");
                        }
                    }

                    case "2" -> {   //Armor

                    }

                    case "3" -> {    //Potions

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
        System.out.println("[X] Exit");
    }

    public static void menuShopFood() {
        System.out.println("---------------------------------------------------------------");
        System.out.println("[1] Bread -- 2.87 gold");
        System.out.println("[2] Rolls -- 1.24 gold");
        System.out.println("[3] Apple -- 0.82 gold");
        System.out.println("[4] Cherry -- 0.24 gold");
        System.out.println("[5] Walnut Bread -- 5.78 gold");
        System.out.println("---------------------------------------------------------------");
    }
}
