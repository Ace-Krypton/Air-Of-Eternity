import java.util.Random;

public class Barbarian {

    //System objects
    Random rand = new Random();

    //Barbarian default base stats
    int HP = 150;

    //First we have to choose random weapon amongst axes (which is barbarian's default weapon)
    String weapon = Weapons.starterKit[rand.nextInt(Weapons.starterKit.length)];

    //Methods

}
