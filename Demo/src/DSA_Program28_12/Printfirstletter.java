package DSA_Program28_12;

import java.util.Scanner;

public class Printfirstletter{
    public static void printFirstLetter(String name) {
    	    	
    	
        String[] words = name.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word.charAt(0));
        }
        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        String name1 = "Nagarjuna reddy";
        printFirstLetter(name1);
    }
}
