
// Number Guessing Game 
// Program generates a random number 
// User gets the number and the program provides hints until the user gets the number correct. 

package Java.Vlog4;

import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class Vlog4 {
    public static void main(String[]args){     

        int max = 100000;
        int min = 1;
        int range = max - min + 1;

        int rand = (int)(Math.random() * range) + min;
        int i = rand - 1;

        while(rand != i) {

            Scanner input = new Scanner(System.in);
            System.out.println("Guess the Number: ");
            String theinput = input.nextLine();

            i=Integer.parseInt(theinput);

            if(rand == i){
                System.out.println("You guessed the correct number!");
                break;
            }else if(rand < i){
                System.out.println("You guessed higher");
            }else if(rand > i){
                System.out.println("You guessed lower");
            }
        }

    }
}
