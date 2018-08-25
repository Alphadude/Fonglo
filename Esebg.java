import java.util.Scanner;
class Esebg{

    public static void main(String []args){
        Scanner blexn = new Scanner(System.in);
        System.out.println("Enter your Name");

        String name = blexn.nextLine();

        System.out.println("WELCOME "+name);

        System.out.println("Enter your Age");

        int age = blexn.nextInt();

        System.out.println("SO YOU ARE "+age+" YEARS OLD");

        System.out.println("SO YOUR NAME IS "+name+" AND YOU ARE "+age+" YEARS OLD");

        System.out.println("What is the price of milo ");

        double price = blexn.nextDouble();

        System.out.println("price of milo is "+price+"$");
    }
}