package com.bridgelabz;

public class GamblingSimulator {
    public static void main(String[] args) {
        System.out.println("***| Gambling Simulator Program |***");

        int initialStake = 100;
        int betAmount = 1;
        int win = 1;
        int currentAmount = 0;
        int days = 20;

        System.out.println("\nInitial Stake = " + initialStake + "\t||\tBet Amount = " + betAmount);

        System.out.println();

        for (int i = 0; i < days; i++){
            while(initialStake < 150 && initialStake > 50){
                int roll = (int)(Math.random() * 10) % 2;
                if (roll == win){
                    System.out.println("You Won !!");
                    initialStake = initialStake + betAmount;
                }else {
                    System.out.println("You Lost !!");
                    initialStake = initialStake - betAmount;
                }
            }
            currentAmount = currentAmount + initialStake;
        }
        System.out.println("Final Amount = " + currentAmount);
    }
}
