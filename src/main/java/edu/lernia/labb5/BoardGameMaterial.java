package edu.lernia.labb5;

import java.util.Scanner;

public class BoardGameMaterial {
    public static Die[] dice;
    
    public static boolean bGameIsOn = true;


    public static void main(String[] args){
        NewGame();
        StartGame();
    }

    
    public static void NewGame(String[] args) {
        int Playerturn = 0;
        dice = new Die[5];
        for(int d=0;d<5;d++) {
            dice[d] = new Die();}
        } 
     
    public static void StartGame(){     
        while(bGameIsOn == true) {
            Playerturn = 0;
            System.out.println("Welcome to Yatzi!");
            while(Playerturn < 3) {
                System.out.println("Starting turn " + (Playerturn+1) + " of 3, rolling dice.");
                for(int i=0;i<dice.length;i++) {
                    dice[i].DieRoll();
                    
                    System.out.println(i + ": " + dice[i].getString());
                }}
    }
                boolean yatzi = true;
                for(int i=1;i < 5;i++) {
                    if(dice[i].value!=dice[i-1].value) {
                        
                        yatzi = false;
                    }
                }
                if(yatzi == true) {
                    System.out.println("You got YATZI! in " + dice[0].value + "'s");
                    return;
                } else {
                  
                    if(Playerturn != 2) {
                        System.out.println("Want to throw again? (y for yes, anything else for no)");
                        try (Scanner RollDice = new Scanner(System.in)) {
                            if(RollDice.next().equals("y")) {
                                ++Playerturn;
                            } else {
                                bGameIsOn = !bGameIsOn;
                                break;
                            }
                        }
                    } else {
                        System.out.println("Game over! Want to play again?");
                        try (Scanner PlayAgain = new Scanner(System.in)) {
                            if(PlayAgain.next().equals("y")) {
                                Playerturn = 0;
                            } else {
                                bGameIsOn = !bGameIsOn;
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}