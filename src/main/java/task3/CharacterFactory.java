package task3;

import java.util.Random;

public class CharacterFactory {
    /**
     * Creates random character.
     *
     * @return random character.
     */
    public static Character createCharacter() {
        Character[] arr = {new Hobbit(), new Elf(), new King(), new Knight()};
        int rndm = new Random().nextInt(arr.length);
        return arr[rndm];
    }
}
