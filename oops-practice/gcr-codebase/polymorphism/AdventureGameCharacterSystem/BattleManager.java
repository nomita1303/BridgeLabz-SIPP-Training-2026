public class BattleManager {

    public static void startBattle(GameCharacter[] characters) {

        int warriorCount = 0;
        int mageCount = 0;
        int archerCount = 0;

        System.out.println("Battle Starts!\n");

        for (GameCharacter character : characters) {

            character.performAttack();

            if (character instanceof Warrior)
                warriorCount++;
            else if (character instanceof Mage)
                mageCount++;
            else if (character instanceof Archer)
                archerCount++;
        }

        System.out.println("\nCharacter Count:");
        System.out.println("Warriors : " + warriorCount);
        System.out.println("Mages    : " + mageCount);
        System.out.println("Archers  : " + archerCount);
    }
}