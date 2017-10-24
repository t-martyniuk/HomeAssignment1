package task3;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
public abstract class Character {
    protected int power;
    protected int hp;

    public Character() {
    }

    /**
     * Kicks enemy.
     *
     * @param c enemy.
     */
    public abstract void kick(Character c);

    /**
     * Decides whether a character is still alive.
     *
     * @return true if alive, false if dead.
     */
    public boolean isAlive() {
        return hp > 0;
    }


}
