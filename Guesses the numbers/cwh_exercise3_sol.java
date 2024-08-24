package com.company;

import java.util.Random;
import java.util.Scanner;

class Game {
    public int number;
    public int inputnumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }


     Game() {
        Random rand = new Random();
        this.number = rand.nextInt(0,100);

    }
    void takeUserInput() {
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();


    }
    boolean isCorrectNumber(){
        if(inputnumber==number) {
            System.out.format("Yes you have guessed it right, it was %d\n You guessed it in %d attempts ", number, noOfGuesses );
            return true;
        }
        else if (inputnumber<number){
            System.out.println("Too low...");
        }
        else if (inputnumber>number){
            System.out.println("Too high...");
        }
        return false;


        }


    }



public class cwh_exercise3_sol {
    public static void main(String[] args) {


        Game g = new Game() ;
        boolean b = false;
        while(!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
            System.out.println(b);
        }

        }
    }


