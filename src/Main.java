import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System Objects
        Scanner scan = new Scanner(System.in);

        //Methods
        menu();

        //User Input
        System.out.print("-> ");
        int input = scan.nextInt();
    }

    public static void menu() {    //Menu for start screen
        System.out.println("---------------------------------------------------------------");
        System.out.println("[1] Play");
        System.out.println("[2] Settings");
        System.out.println("[3] Trials");
        System.out.println("[4] Credits\n");
        System.out.println("[X] Exit");
        System.out.println("---------------------------------------------------------------");
    }
}
