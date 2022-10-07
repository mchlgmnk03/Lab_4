package kicks;

import chars.Character;

public class NobleKick implements BasicKick {
    @Override
    public void kick(Character whoKicks, Character whoIsKicked) {
        whoIsKicked.setHp(whoIsKicked.getHp() - whoKicks.getPower());
    }
}
