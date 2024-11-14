//Kate Spencer
//2.14.2024
//CSC 1120-01: Programming 2
//Pledge: I have neither given nor received unauthorized aid on this program
//Description: FourNRow is a program that allows users to play the game Connect Four/Four in a Row.


import java.util.Scanner;
public class FourNRow {
    //Declares variables for players, board
    public static void main(String[] args){
        String player_1;
        String player_2;

        board_game b = new board_game();

        Scanner input = new Scanner(System.in);
        //Prompt the users to enter names
        System.out.println("Welcome to Four in a Row");
        System.out.println("Please enter the name of Player 1");
        player_1 = input.next();
        System.out.println("Please enter the name of Player 2");
        player_2 = input.next();

        //Declarations of players
        System.out.println("Player 1: " + player_1 + " " + "Player 2: " + player_2);

        //value that sets player1 as the starting move and helps switch between player 1 and 2

        boolean player1Turn = true;

        //loop that repeats each turn of the game. takes in player input for columns and row and implements it

        while(true){

            b.print_board();

            if(player1Turn){
                System.out.println(player_1 + " enter a number for the column you want to pick");
                int column = input.nextInt();
                System.out.println(player_1 + " enter a number for the row you want to pick");
                int row = input.nextInt();
                if(b.legalMove(row, column)) {
                    b.red(row, column);
                }
            }else{
                System.out.println(player_2 + " enter a number for the column you want to pick");
                int column = input.nextInt();
                System.out.println(player_2 + " enter a number for the row you want to pick");
                int row = input.nextInt();
                if (b.legalMove(row, column)) {
                    b.blue(row, column);
                }
            }
            player1Turn = !player1Turn;

        }


    }
}
