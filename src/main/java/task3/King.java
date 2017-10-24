package task3;

import lombok.ToString;

import java.util.Random;

@ToString(callSuper = true, includeFieldNames = true, exclude = "rndm")
public class King extends Character {
    private Random rndm = new Random();

    public King() {
        power = rndm.nextInt(11) + 5;
        hp = rndm.nextInt(11) + 5;

    }

    @Override
    public void kick(Character c) {
        c.hp -= rndm.nextInt(this.power);
    }
}
