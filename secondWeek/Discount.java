import java.util.Scanner;

class Discount{

    public static void main(String []args){

        Scanner prisca = new Scanner(System.in);

        System.out.println("ENTER THE ORIGINAL PRICE");

        double price = prisca.nextDouble();

        double discount = price * 0.20;

        double finalPrice = price - discount;

        System.out.println("Final price after Discount is "+finalPrice);
    }
}