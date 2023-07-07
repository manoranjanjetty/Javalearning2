import java.util.Random;
import java.util.Scanner;

public class Dicesimulation {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("PLEASE ENTER THE NO OF ROLLS");
        Scanner keyboard = new Scanner(System.in);
        int input = keyboard.nextInt();
        for(int i=1; i<=input;i++){
            int Dice = random.nextInt(6) + 1;
            System.out.println("Rolling the " +i+ " dice and result is: " + Dice);
        }//end for
    }//end main
}
