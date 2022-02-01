import java.util.Random;

public class Barbarian {

    //System objects
    Random rand = new Random();

    //Barbarian default base stats
    int HP = 100;
    String weapon;

    //First we have to choose random weapon amongst axes (which is barbarian's default weapon)
    //Methods
    public void weaponRand() {
       weapon = Weapons.axes[rand.nextInt(Weapons.axes.length)];  //First Weapon (Random)
    }
}
