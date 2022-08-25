package com.bridgelabz;

public class GamblingSimulator {
    public static void main(String[] args) {
        System.out.println("***| Gambling Simulator Program |***");

        int initialStake = 100;
        int betAmount = 1;
        int win = 1;
        int currentAmount = initialStake;

        System.out.println("\nInitial Stake = " + initialStake + "\t||\tBet Amount = " + betAmount);

        System.out.println();

        while(currentAmount < 150 && currentAmount > 50){
            int roll = (int)(Math.random() * 10) % 2;
            if (roll == win){
                System.out.println("You Won !!");
                currentAmount = currentAmount + betAmount;
            }else {
                System.out.println("You Lost !!");
                currentAmount = currentAmount - betAmount;
            }
        }
        System.out.println("Final Amount = " + currentAmount);
    }
}
