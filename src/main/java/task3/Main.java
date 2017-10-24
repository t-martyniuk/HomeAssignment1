package task3;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.net.SocketPermission;

public class Main {
    public static void main(String[] args) {
        Character c1 = CharacterFactory.createCharacter();
        Character c2 = CharacterFactory.createCharacter();
        System.out.println(c1);
        System.out.println(c2);
        GameManager.fight(c1, c2);
    }
}
