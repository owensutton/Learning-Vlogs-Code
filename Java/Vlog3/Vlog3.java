package Java.Vlog3;
import java.io.*;
import java.util.Scanner;

public class Vlog3 {
    public static void main(String[]args){

        char ch;
        String newstring = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Input: ");
        String theinput = input.nextLine();

        System.out.println("Input word = " + theinput);

        for (int i=0; i<theinput.length(); i++){
            ch = theinput.charAt(i);
            newstring = ch + newstring;
        }
        
        System.out.println("Output word = " + newstring);

    }
}
