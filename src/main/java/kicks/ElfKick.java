package kicks;

import chars.Character;

public class ElfKick implements BasicKick {
    @Override
    public void kick(Character whoKicks, Character whoIsKicked) {
        if (whoKicks.getPower() > whoIsKicked.getPower()) {
            whoIsKicked.setHp(0);
        } else {
            whoKicks.setPower(whoKicks.getPower() - 1);
        }
    }
}
