import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System Objects
        Scanner scan = new Scanner(System.in);

        //Variables
        String userInput;

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
                //Shop
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
}
