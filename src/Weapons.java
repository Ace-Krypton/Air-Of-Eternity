public class Weapons {

    //Weapons
    static String[] axes = {"Woodsman's Axe", "Battle Axe", "Raider Axe"};
    static String[] swords = {"Arming Sword", "Corsair's BackSword", "Tai-chi"};
    static String[] bows = {"Self Bow", "VileHawk Bow", "BloodWood Bow", "GraveWalker GreatBow"};
    static String[] staves = {"Scrimshaw Cane", "Rowan Crosier", "Saira's Staff"};

    //Starter Weapons For Barbarian
    static String[] starterKit = {"Iron Fists", "Hatchet"};

    //Starter Damage
    final public static double ironFistsDMG = 2;
    final public static double hatchetDMG = 3;

    //Axe damage
    final public static double woodsmanAxeDMG = 6;
    final public static double battleAxeDMG = 16;
    final public static double raiderAxeDMG = 20;

    //Getters
    public static double getWoodsmanAxeDMG() {
        return woodsmanAxeDMG;
    }

    public static double getBattleAxeDMG() {
        return battleAxeDMG;
    }

    public static double getRaiderAxeDMG() {
        return raiderAxeDMG;
    }

    public static double gethatchetDMG() {
        return hatchetDMG;
    }

    public static double getironFistsDMG() {
        return ironFistsDMG;
    }
}
