import java.util.*;

class GameRPS{

    public static void main(String []ekada){
        Scanner sandra = new Scanner(System.in);
        Random panama = new Random();

        int value = 1;
        int playAgain;

        do{
            System.out.println("Enter 1 for Rock, 2 for paper and 3 for S");

        int player = sandra.nextInt();
        
        int computer = 1 + panama.nextInt(3);

        if (computer == player){
            System.out.println("ITS A TIE");
            System.out.println("computer picked "+computer);
            System.out.println("you picked "+player);
        }else if(player == 1 && computer  == 2){
            System.out.println("COMPUTER  WINS BECAUSE PAPER WRAPS ROCK");

        }else if(player == 2 && computer == 3){
            System.out.println("COMPUTER WINS BECAUSE SCISSORS WILL CUT PAPER");
        }else if(player == 1 && computer == 3){
            System.out.println("PLAYER WINS BECAUSE ROCKS BREAKS SCISSORS");
        }else if(player == 2 && computer == 1){
            System.out.println("PLAYER WINS BECAUSE PAPER COVERS ROCK");
        }else if (player == 3 && computer== 1){
            System.out.println("COMPUTER WINS BECAUSE ROCK WILL BREAK SCISSORS");
        }else if(player == 3 && computer == 2){
            System.out.println("PLAYER WINS BECAUSE SCISSORS WILL CUT PAPER");
        }else{
            System.out.println("INVALID INPUT");
        }

        System.out.println("Enter value 1 to play again and another number to end");
         playAgain = sandra.nextInt();

        }
        while(value == playAgain);
         System.out.println("THANK YOU FOR PLAYING OUR CANDY CRUSH"); 
    }
}