package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        checkForPalindrome("Racecar");
    }
public static Boolean checkForPalindrome(String text){
        String editedText = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = editedText.length() - 1;
        while(left < right){
            if(editedText.charAt(left) != editedText.charAt(right)){
                return false;
            }
            left ++;
            right --;

        }
        return true;
}
}