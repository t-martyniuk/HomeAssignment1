package task2;

public class Main {

    public static void main(String[] args) {

        GuessGame newGame = new GuessGame();

        for (int i = 0; i < 3; i++) {
            newGame.play(100);
        }

        newGame.printBestScore();
    }
}
