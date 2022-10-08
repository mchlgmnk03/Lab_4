package chars;

import org.reflections.Reflections;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class CharacterFactory {
    private static final Random generator = new Random();
    private static final Reflections reflections = new Reflections("chars");
    private static final Set<Class<? extends Character>> subTypes =
            reflections.getSubTypesOf(Character.class);
    static {subTypes.remove(Noble.class);}
    private static final List<Class> subList = Arrays.asList(subTypes.toArray(new Class[0]));
    public static Character createCharacter() throws InstantiationException, IllegalAccessException {
        return (Character) subList.get(generator.nextInt(3)).newInstance();
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        int i = 0;
        while (i < 10) {
            System.out.println(createCharacter().toString());
            ++i;
        }
    }
}
