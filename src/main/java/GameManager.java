import chars.Character;
import chars.CharacterFactory;
import chars.Elf;
import chars.Hobbit;

public class GameManager {
    private static final String line = "-------------------------";
    public static void fight(Character c1, Character c2) {
        int round_counter = 1;
        System.out.println(line);
        System.out.println("The " + c1.getClass().getSimpleName() + "\nHP: " + c1.getHp() + "\nATK: " + c1.getPower());
        System.out.println(line);
        System.out.println("The " + c2.getClass().getSimpleName() + "\nHP: " + c2.getHp() + "\nATK: " + c2.getPower());
        if (c1 instanceof Hobbit && c2 instanceof Hobbit) {
            System.out.println(line);
            System.out.println("They are both Hobbits. They can only make noise.\nHrr");
            System.out.println(line);
            return;
        }
        if (c1 instanceof Elf && c2 instanceof Elf) {
            System.out.println(line);
            System.out.println("They are both Elves. The second to hit always wins.");
            System.out.println(line);
        }
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println(line);
            System.out.println("Round " + round_counter);
            System.out.println("The " + c1.getClass().getSimpleName() + " hits the " + c2.getClass().getSimpleName());
            c1.kick(c2);
            if (!c2.isAlive()) {
                break;
            }
            System.out.println("The " + c2.getClass().getSimpleName() + " hits the " + c1.getClass().getSimpleName());
            c2.kick(c1);
            ++round_counter;
        }
        System.out.println(line);
        if (c1.isAlive()) {
            System.out.println("The " + c1.getClass().getSimpleName() + " won.");
            System.out.println(line);
        } else {
            System.out.println("The " + c2.getClass().getSimpleName() + " won.");
            System.out.println(line);
        }
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Character c1 = CharacterFactory.createCharacter();
        Character c2 = CharacterFactory.createCharacter();
        fight(c1, c2);
    }
}
