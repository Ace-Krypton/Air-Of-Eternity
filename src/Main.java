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
                        menuShopFood();

                    }
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
