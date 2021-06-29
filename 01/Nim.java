import java.util.Scanner;
import java.util.Random;

/*
* To simulate the game of Nim, we plan to create three methods, one to
* represent the "choices" of the AI player, one to embody the rules of Nim, and one to NIX that - we thought about doing this in a more complex manner; then we realized that time wise it would be better to do this more simply and this is where we are.
*/
public class Nim {

  public static void main (String[] args) {
    int totalStones = 12;
    Scanner in = new Scanner(System.in);
    System.out.println("This is the game of Nim. We start with 12 stones in a bag. Players choose 1, 2, or 3 stones each turn. The object of the game is to choose the last stone.");

    System.out.print("Player 1: How many stones would you like to choose? Choose 1, 2, or 3: ");
    int playerStones = in.nextInt();

    System.out.print("Player AI: How many stones would you like to choose?");
    Random random = new Random();
    int aiStones = random.nextInt(2) + 1;
    System.out.println(" " + aiStones);
}
}
