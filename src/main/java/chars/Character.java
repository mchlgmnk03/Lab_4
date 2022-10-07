package chars;

import kicks.BasicKick;
import lombok.Getter;
import lombok.Setter;

public abstract class Character {
    @Getter
    private int hp;
    @Getter
    @Setter
    private int power;

    private BasicKick kick;

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    public Character(int hp, int power, BasicKick kick) {
        this.hp = hp;
        this.power = power;
        this.kick = kick;
    }

    public void kick(Character c) {
        this.kick.kick(this, c);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                "{hp=" + hp +
                ", power=" + power +
                '}';
    }
}