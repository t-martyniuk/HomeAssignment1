package task3;

import lombok.ToString;

@ToString(callSuper = true, includeFieldNames = true)
public class Hobbit extends Character {

    public Hobbit() {
        power = 0;
        hp = 3;

    }

    @Override
    public void kick(Character c) {
        System.out.println("I AM A HOBBIT MUHAHAHAHAHAHAHAHA");
    }


}
