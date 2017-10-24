package task3;

import lombok.ToString;

@ToString(callSuper = true, includeFieldNames = true)
public class Elf extends Character {
    public Elf() {
        power = 10;
        hp = 10;

    }

    @Override
    public void kick(Character c) {
        if (this.power > c.power) {
            c.hp = 0;
        } else {
            c.power -= 1;
        }
    }
}
