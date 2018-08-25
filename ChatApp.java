import java.util.Scanner;

class ChatApp{

    public static void main(String []args){

        Scanner ekene = new Scanner(System.in);
        System.out.println("user1:=HELLO");
        String reply = ekene.nextLine();

        System.out.println("user1: =WHATS YOUR NAME ?");

        String name = ekene.nextLine();

        System.out.println("user1:= WHERE DO YOU STAY "+name+"? CHOBA OR ALAKAHIA");

        String location = ekene.nextLine();

        System.out.println("user1:= HOW OLD ARE YOU? "+name);

        int age = ekene.nextInt();

        System.out.println("user1:= WOW "+age+" YEARS, YOU ARE SO YOUNG "+name);

        System.out.println("user1:= I HAVE TO RUN ....CHAT LATER");

    }
}