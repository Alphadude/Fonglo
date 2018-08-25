import java.util.Random;
import java.util.Scanner;

class RandomClass{

    public static void main(String []args){

        Scanner blessing = new Scanner(System.in);
        Random sandra = new Random();

        int value = 1 + sandra.nextInt(6);

        System.out.println("Enter a number between 0 and 6");

        int guess = blessing.nextInt();

        if (guess == value){
            System.out.println("YOURE GUESS WAS RIGHT");
            System.out.println("THE GUESSED VALUE IS "+value);
        }else{
            System.out.println("YOUR GUESS WAS WRONG THE NUMBER IS "+value);
            System.out.println("TRY AGAIN");
        }

        
    }
}