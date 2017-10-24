package task3;

public class GameManager {
    /**
     * The scenario of the fight of 2 characters.
     *
     * @param c1 first character.
     * @param c2 second character.
     */
    public static void fight(Character c1, Character c2) {

        System.out.println(c1.toString() + " and " + c2.toString() + " are fighting.");
        //If 2 Hobbits are playing, we get infinite loop.
        if ((c1.power == 0) && (c2.power == 0)) {
            System.out.println("Two Hobbits are fighting, no one dies.");
            return;
        }
        //Both characters kick each other in turns.
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("1st character " + c1.toString() + " kicks 2nd character " + c2.toString() + ".");
            c1.kick(c2);
            System.out.println("New state of the 2nd character: " + c2.toString() + ".");
            if (c2.isAlive()) {
                System.out.println("2nd character " + c2.toString() + " kicks 1st character " + c1.toString() + ".");
                c2.kick(c1);
                System.out.println("New state of the 1st character: " + c1.toString() + ".");
            }

        }
        //Final message.
        if (c1.isAlive()) {
            System.out.println("First character " + c1.toString() + " is the winner.");
        } else {
            System.out.println("Second character " + c2.toString() + " is the winner.");
        }
    }
}
