package chars;
import java.util.Random;

public class King extends Noble {
    private static final Random generator = new Random();
    public King() {
        super(5, 15);
    }

    @Override
    public void kick(Character c) {

    }
}
