package kicks;

import chars.Character;

public class CryKick implements BasicKick {
    @Override
    public void kick(Character whoKicks, Character whoIsKicked) {
        System.out.println("Hrr");
    }
}
