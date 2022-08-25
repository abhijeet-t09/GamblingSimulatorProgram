package com.bridgelabz;

public class GamblingSimulator {
    public static void main(String[] args) {
        System.out.println("***| Gambling Simulator Program |***");

        int initialStake = 100;
        int betAmount = 1;
        int win = 1;

        System.out.println("\nInitial Stake = " + initialStake + "\t||\tBet Amount = " + betAmount);

        int roll = (int)(Math.random() * 10) % 2;

        System.out.println();
        if (roll == win){
            System.out.println("You Won !!");
        }else {
            System.out.println("You Lost !!");
        }
    }
}
