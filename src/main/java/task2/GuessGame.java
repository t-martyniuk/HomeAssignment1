package task2;

import javax.swing.*;
import java.util.*;


public class GuessGame {

    public double maxScore;

    /**
     * Dispays a dialogue window for user to input his/her guess.
     *
     * @param message message to the user about his/her guess being too large or too small.
     * @return user's input.
     */
    private String getNumber(String message) {
        return JOptionPane.showInputDialog(new JFrame(), message);
    }

    /**
     * Plays single game of guessing with a user.
     *
     * @param max maximal possible number that computer can ask you to guess.
     */
    public void play(int max) {
        String message = "Try to guess a number, max = " + max;
        // Generate random number.
        Random rndm = new Random();
        int computerNumber = rndm.nextInt(max) + 1;

        int count = 0; // Number of attempts.
        int userNumber = -1;

        // THE GAME IS ON.
        while (userNumber != computerNumber) {
            count += 1;
            //User's guess.
            userNumber = Integer.parseInt(getNumber(message));

            if (userNumber < computerNumber) {
                message = "The number is bigger, try again";
            } else if (userNumber > computerNumber) {
                message = "The number is smaller, try again";
            }
        }

        //Computing the score of the game.
        float score = (float) max / count;
        JOptionPane.showMessageDialog(new JFrame(), "Your score is " + score);
        if (score > maxScore) {
            maxScore = score;
        }

    }

    /**
     * Prints best score through all the games played.
     */
    public void printBestScore() {
        System.out.println("Best score is: " + maxScore);
    }
}
