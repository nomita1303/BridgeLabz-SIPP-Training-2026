public class AdventureGame {

    public static void main(String[] args) {

        GameCharacter[] characters = {
                new Warrior("Thor"),
                new Mage("Merlin"),
                new Archer("Robin"),
                new Warrior("Leon"),
                new Mage("Gandalf")
        };

        BattleManager.startBattle(characters);
    }
}