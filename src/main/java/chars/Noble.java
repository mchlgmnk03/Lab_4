package chars;
import kicks.NobleKick;
import java.util.Random;

public abstract class Noble extends Character{
    private static final Random generator = new Random();

    public Noble(int min, int max) {
        super(generator.nextInt(max - min) + min, generator.nextInt(max - min) + min, new NobleKick());
    }

}
