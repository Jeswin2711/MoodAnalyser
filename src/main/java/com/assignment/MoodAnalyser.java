package com.assignment;

import java.util.Scanner;

public class MoodAnalyser
{
    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyser Problem");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Mood");
        String mood = sc.nextLine();
        System.out.println(analyseMood(mood));
    }

    /*
 analyseMood function to return Mood is Happy or Sad
  */
    static String analyseMood(String msg)
    {
        String returnString = "";
        if(msg.equals("I am in Sad Mood"))
        {
            returnString = "SAD";
        }
        else if(msg.equals("I am in Any Mood")) {
            returnString = "HAPPY";
        }
        return returnString;
    }

}
