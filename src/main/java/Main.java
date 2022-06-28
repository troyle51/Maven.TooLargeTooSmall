/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner guess = new Scanner(System.in);
        int guessNumb;
        double randomNum = Math.random() * 20 + 1;
        int rand = (int) randomNum;
        int tries = 0;
        int inputHolder = 0;

        while (tries < 5) {
            System.out.println("Please guess a number between 1 and 20. You have 5 tries!");
            guessNumb = guess.nextInt();
            tries++;

            ///Need to add check on consecutive tries.
//            System.out.println(tries);
//
//            if(tries => 1){
//                inputHolder = guessNumb;
//            } else {
//                tries--;
//            }

            if (guessNumb == rand) {
                System.out.println("You got it!");
                System.out.println("It took you " + tries + " tries to get it right!");
                break;
            } else if (guessNumb > rand) {
                System.out.println("The number is too high");
            } else {
                System.out.println("The number is too low");
            }

            if (tries == 5) {
                System.out.println("You are out of tries!");
                break;
            }

        }
    }
}


