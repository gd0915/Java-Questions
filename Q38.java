package questions;

import java.util.Scanner;

public class Q38 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //Create a method to count all characters different from space in a string get the string from user
        System.out.println(numOfAllCharsDifferentFromSpace("Learn Java"));

    }

    public static int numOfAllCharsDifferentFromSpace(String str) {

        System.out.println("Enter a String to check how many characters different from space in it, please");
        str= input.nextLine();

        str = str.replaceAll("\\s", "").replaceAll("\\p{Punct}", "");
        String [] arr = str.split("");
        int numOfAllChars = arr.length;
        return numOfAllChars;

    }




}
