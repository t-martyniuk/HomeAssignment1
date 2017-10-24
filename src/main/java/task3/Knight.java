package task3;

import lombok.ToString;

import java.util.Random;

@ToString(callSuper = true, includeFieldNames = true, exclude = "rndm")
public class Knight extends Character {
    private Random rndm = new Random();

    public Knight() {
        power = rndm.nextInt(11) + 2;
        hp = rndm.nextInt(11) + 2;

    }

    @Override
    public void kick(Character c) {
        c.hp -= rndm.nextInt(this.power);
    }
}
