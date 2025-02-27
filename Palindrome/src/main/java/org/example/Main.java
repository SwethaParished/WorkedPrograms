package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        palindrome();
    }
        //Given string is palindrome or not
        static void palindrome(){
            //String str = "banana";
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the String = ");
            String inputString = scan.next();
            //convert to lowercase
            String convertToLowercase = inputString.toLowerCase();
            System.out.println("Converted to Lowercase = " + convertToLowercase);
            //reverse the String using StringBuilder
            String reversedText = new StringBuilder(convertToLowercase).reverse().toString();
            System.out.println("Converted to Reversed Text = " + reversedText);
            if(convertToLowercase.equals(reversedText)){
                System.out.println(inputString + " is a Palindrome");
            }else{
                System.out.println(inputString + " is not a Palindrome");
            }

        }

}