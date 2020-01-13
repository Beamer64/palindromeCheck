package com.company;

public class Main {
    
    public static void main(String[] args) {
        results();
    }
    
    //compares the stripped input with its reverse to check for palindrome
    private static Boolean compareStrings(String stripped, String reverse) {
    
        return stripped.equals(reverse);
    }
    
    //removes all special characters, spaces and numbers to only leave letters
    private static String removeSpecialChar(String str) {
        
        String strip = str.replaceAll("[^a-zA-Z]", "");
        
        //returns the stripped input in lowercase form
        return strip.toLowerCase();
    }
    
    //reverses the string and returns it
    //normally the string will be stripped first
    private static String reverseInput(String str) {
        
        StringBuilder reverse = new StringBuilder();
        
        for (int i = str.length() - 1; i >= 0; i--) {
            
            reverse.append(str.charAt(i));
        }
        return reverse.toString();
    }
    
    public static void results(){
        System.out.println("Type out a word:");
        
        String input    = TextIO.getln();
        String stripped = removeSpecialChar(input);
        String reverse  = reverseInput(stripped);
        
        Boolean stringsMatch = compareStrings(stripped, reverse);
    
        if(input.contains("exit")){
            System.exit(0);
        }
        
        System.out.println("Stripped: " + stripped + "\n");
        System.out.println("Reversed  " + reverse + "\n");
        
        if (stringsMatch) {
            System.out.println("This IS a palindrome!" + "\n");
        }
        else {
            System.out.println("This is NOT a palindrome!" + "\n");
        }
        results();
    }
}