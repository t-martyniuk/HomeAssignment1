# HomeAssignment1
First home assignment for Advanced Programming course.

## Task 1 - Never Use SWITCH
Find the alternative for SWITCH

## Task 2 - Guessing Game
* A game where the Computer picks a number (up to max) and asks the User to guess it. The Computer answers greater/less. 

* The class GuessGame has methods play(int max) and printBestScore().

* For the input class JOptionPane.showInputDialog(...) is used.

* The score is calculated by the formula max/numberOfAttempts. The best score is saved then.

## Task 3 - Heroes Game
### Requirements:
* class Character (int power, int hp, void kick (Character c), boolean isAlive())
* class CharacterFactory (Character createCharacter()) 
* class GameManager (Character c1, Character c2)

### Types of characters:
* Hobbit - power = 0, hp = 3, kick(toCry();)
* Elf - power = 10, hp = 10, kick(kill everybody who is weaker than him, otherwise decrease the power of another character by 1)
* King - power = 5-15, hp = 5-15, kick(decrease the number of hp of the enemy by a random number which is in range of his power)
* Knight - power = 2-12, hp = 2-12, kick(decrease the number of hp of the enemy by a random number which is in range of his power)

### The task:
To provide a figth between 2 characters and explain via command line what happens during the fight, till both of the characters are alive.
