import java.util.Random;
import java.util.Scanner;

public class Dungeon {
    //System objects
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    //Game variables
    String[] enemies = {"Skeleton", "Zombie", "Warrior", "Assassin"};
    int maxEnemyHealth = 75;
    int enemyattackDamage = 25;
    int goldFromEnemy = 20;
    static int goldEarned;

    //Player variables
    static String[] potions = {"Fire Burst", "Fire Ball", "Ice", "Thunder"};
    int playerLevel = 1;
    int playerXP;
    int percentageXP = 5;  //Percentage
    int health = 100;
    int attackDamage = 50;
    int numHealthPotions = 3;
    int healthPotionHealAmount = 30;
    int healthPotionDropChance = 20;  //Percentage
    int damageFireBurst = 20;
    int damageFireBall = 35;
    int damageIce = 15;
    int damageThunder = 50;
    int spellDropChance = 5;  //Percentage
    int numPotions = 1;


    //Methods
    public void adventure() {
        boolean running = true;
        GAME:
        while(running) {
            System.out.println("----------------------------------------------------------------");
            int enemyHealth = rand.nextInt(maxEnemyHealth);
            String enemy = enemies[rand.nextInt(enemies.length)];
            System.out.println("\t" + enemy + " has appeared!\n");

            while(enemyHealth > 0) {
                System.out.println("\tYour HP: " + health);
                System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Drink Health Potion");
                System.out.println("\t3. Use Potion");
                System.out.println("\t4. Run!");
                System.out.println("\t5. Exit From Dungeon");

                System.out.print("-> ");
                String input;

                try {
                    input = scan.nextLine();
                }
                catch (Exception e) {
                    System.out.println("Please enter a number");
                    input = scan.next();
                }

                switch (input) {
                    case "1" -> {
                        int damageDealt = rand.nextInt(attackDamage);
                        int damageTaken = rand.nextInt(enemyattackDamage);

                        enemyHealth -= damageDealt;
                        health -=damageTaken;
                        System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " damage.");
                        System.out.println("\t> You receive " + damageTaken + " in retaliation\n");

                        if(health < 10) {
                            System.out.println("\t> You have taken too much damage, you are too weak to go on");
                            System.out.println("Do you want to continue? Press 'Y' for yes 'N' for no");
                            System.out.print("-> ");
                            String choice = scan.nextLine();

                            if (choice.equalsIgnoreCase("N")) {
                                System.out.println("You have " + health + " HP, you might wanna drink the potion if any left" +
                                        ", if not, you have to meet with 'Death', he can borrow you some, but always remember" +
                                        " nothing is free in this game, when you got potion you will give something in return");
                                System.out.println("Do you want to visit 'Death's office'? 'Y' for yes, 'N' for no");

                                System.out.print("-> ");
                                String press = scan.next();

                                if (press.equalsIgnoreCase("Y")) {
                                    System.out.println("I assume you are here for health potion, well I will give you the potion," +
                                            " but in return I want your gold and everyday the gold will multiplied by 2, at the end of the 3 days" +
                                            " I will take your life if you won't pay your dept, you still have chance to think" +
                                            " and make a decision");

                                    System.out.println("Do you want to make a deal? 'Y' for yes, 'N' for no");
                                    System.out.print("-> ");
                                    press = scan.next();

                                    if (press.equalsIgnoreCase("Y")) {
                                        System.out.println("Take that potion and heal yourself, but remember.........");
                                        numHealthPotions++;
                                    }
                                    continue GAME;
                                }
                            }
                            if (health <= 0) {
                                System.out.println("You died!");
                                return;
                            }
                            continue GAME;
                        }
                        if (enemyHealth <= 0) {
                            System.out.println("You have defeated the " + enemy);
                            goldEarned = rand.nextInt(goldFromEnemy);
                            System.out.println("You earned " + goldEarned + " from " + enemy);
                        }
                    }

                    case "2" -> {
                        if(numHealthPotions > 0) {
                            health += healthPotionHealAmount;
                            if (health > 100) health = 100;
                            numHealthPotions--;
                            System.out.println("\t> You drink the health potion, healing yourself for " + healthPotionHealAmount + "."
                                    + "\n\t> You now have " + health + " HP."
                                    + "\n\t> You have " + numHealthPotions + " health potions left.\n");
                        }
                        else {
                            System.out.println("\t> You have no health potions left! Defeat enemies for a chance of get one");
                        }
                    }

                    case "3" -> {
                        while(numPotions > 0) {
                            System.out.println("----------------------------------------------------------------");
                            System.out.println("Which potion do you want to use?\n");
                            int count = 1;
                            for (String potion : potions) {
                                System.out.println("\t" + count + ". " + potion);
                                count++;
                            }
                            System.out.println();
                            System.out.println("\tDamage Fire Burst -> " + damageFireBurst + "\n" + "\tDamage Fire Ball -> "
                                    + damageFireBall + "\n" + "\tDamage Ice -> " + damageIce + "\n" + "\tDamage Thunder -> " + damageThunder);
                            System.out.print("-> ");
                            String press = scan.nextLine();
                            switch(press) {
                                case "1" -> {
                                    System.out.println("----------------------------------------------------------------");
                                    System.out.println("You have used Fire Burst");
                                    enemyHealth -= damageFireBurst;
                                    if (enemyHealth > 0) System.out.println(enemy +" Health -> " + enemyHealth);
                                    numPotions--;
                                }

                                case "2" -> {
                                    System.out.println("----------------------------------------------------------------");
                                    System.out.println("You have used Fire Ball");
                                    enemyHealth -= damageFireBall;
                                    if (enemyHealth > 0) System.out.println(enemy +" Health -> " + enemyHealth);
                                    numPotions--;
                                }

                                case "3" -> {
                                    System.out.println("----------------------------------------------------------------");
                                    System.out.println("You have used Ice");
                                    enemyHealth -= damageIce;
                                    if (enemyHealth > 0) System.out.println(enemy +" Health -> " + enemyHealth);
                                    numPotions--;
                                }

                                case "4" -> {
                                    System.out.println("----------------------------------------------------------------");
                                    System.out.println("You have used Thunder");
                                    enemyHealth -= damageThunder;
                                    if (enemyHealth > 0) System.out.println(enemy +" Health -> " + enemyHealth);
                                    numPotions--;
                                }
                            }
                            if (enemyHealth <= 0) {
                                System.out.println("You have defeated the " + enemy);
                                goldEarned = rand.nextInt(goldFromEnemy);
                                System.out.println("You earned " + goldEarned + " from " + enemy);
                                int randomXP = rand.nextInt(percentageXP);
                                System.out.println("You gained " + randomXP + " XP");
                                playerXP += randomXP;
                                continue GAME;
                            }
                        }
                    }

                    case "4" -> {
                        System.out.println("\tYou run away from the " + enemy + "!");
                        continue GAME;
                    }

                    case "5" -> {
                        System.out.println("Exiting from dungeon");
                        running = false;
                    }

                    default -> {
                        System.out.println("Invalid command!");
                        continue GAME;
                    }
                }
                if  (health < 1) {
                    System.out.println("You limp out of the dungeon, weak from the battle");
                    break;
                }
            }
            System.out.println("----------------------------------------------------------------");
            System.out.println("You have " + health + " HP left");
            int randomXP = rand.nextInt(percentageXP);
            System.out.println("You gained " + randomXP + " XP");
            playerXP += randomXP;
            if (playerXP >= 100) playerLevel++;

            if (rand.nextInt(100) < healthPotionDropChance && rand.nextInt(100) < spellDropChance) {
                numHealthPotions++;
                System.out.println("The " + enemy + " dropped a health potion" );
                System.out.println("You now have " + numHealthPotions + " health potion(s)");
                numPotions++;
                System.out.println("The " + enemy + " dropped a potion" );
                System.out.println("You now have " + numPotions + " potion(s)");
            }

            System.out.println("----------------------------------------------------------------");
            System.out.println("What would you like to do now?");
            System.out.println("1. Continue fighting");
            System.out.println("2. Exit dungeon");

            System.out.print("-> ");
            String input = scan.nextLine();

            while(!input.equals("1") && !input.equals("2")) {
                System.out.println("Invalid command! Please try again");
                System.out.print("-> ");
                input = scan.nextLine();
            }

            if (input.equals("1")) {
                System.out.println("You continue on your adventure!");
            }

            else {
                System.out.println("You exit from the dungeon, successful from your adventures!");
                System.out.println(showXP());
                break;
            }
        }
    }

    public StringBuilder showXP() {
        StringBuilder builder = new StringBuilder();
        if (playerXP <= 100 && playerXP % 10 == 0){
            builder.append("-");
        }
        return builder;
    }
}
