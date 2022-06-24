/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner guess = new Scanner(System.in);
        int guessNumb;
        double randomNum = Math.random()*20+1;
        int rand = (int)randomNum;
        int tries = 0;

        while(tries < 5) {
            System.out.println("Please guess a number between 1 and 20. You have 5 tries!");
            guessNumb = guess.nextInt();
            tries++;

            if (tries == 5){
                System.out.println("You are out of tries!");
            }

            if (guessNumb == rand) {
                System.out.println("You got it!");
                break;
            } else if (guessNumb > rand) {
                System.out.println("The number is too high");
            } else {
                System.out.println("The number is too low");
            }
        }
    }
}
