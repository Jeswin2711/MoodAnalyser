package com.assignment;

import java.util.Scanner;

public class MoodAnalyserMain
{
    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyser Problem");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Mood");
        String mood = sc.nextLine();
        MoodAnalyser moodAnalyser = new MoodAnalyser(mood);
        System.out.println(moodAnalyser.analyseMood());
    }
}
