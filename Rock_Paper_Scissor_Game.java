package com.company;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor_Game {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        while(true) {
            String[] arr = {"rock", "paper", "scissor"};
            String ComputerMove = arr[new Random().nextInt(arr.length)];
            String MyMove;
            while (true) {
                System.out.println("Please enter your move (rock,paper or scissor)");
                MyMove = Sc.nextLine();
                // to check user input is correct or not
                if (MyMove.equals("rock") || MyMove.equals("paper") || MyMove.equals("scissor")) {
                    break;
                }
                System.out.println(MyMove + " is not valid answer.Please enter valid answer");
            }
            System.out.println("Computer Move: " + ComputerMove);
            if (MyMove.equals(ComputerMove)) {
                System.out.println("game is tie!");
            }
            else if (MyMove.equals("rock")) {
                if (ComputerMove.equals("scissor")) {
                    System.out.println("you win!");
                } else if (ComputerMove.equals("paper")) {
                    System.out.println("you lose!");
                }
            }
            else if (MyMove.equals("paper")) {
                if (ComputerMove.equals("rock")) {
                    System.out.println("you win!");
                } else if (ComputerMove.equals("scissor")) {
                    System.out.println("you lose!");
                }
            } else if (MyMove.equals("scissor")) {
                if (ComputerMove.equals("paper")) {
                    System.out.println("you win!");
                } else if (ComputerMove.equals("rock")) {
                    System.out.println("you lose!");
                }
            }
            System.out.println("do you want to play again? (y/n)");
            String PlayAgain = Sc.nextLine();
            if(PlayAgain.equals("n")){
                break;
            }
        }
        System.out.println("thank you for playing.");

    }
}
