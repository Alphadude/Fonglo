import java.util.Scanner;

class Miles{

    public static void main(String []args){

        Scanner chika = new Scanner(System.in);

        System.out.println("Enter the Miles travelled");

        double MilesTravelled = chika.nextDouble();

        System.out.println("Enter the Gallon of Gas Used");

        double GallonOfGasUsed = chika.nextDouble();

        double MilesPergallon = MilesTravelled + GallonOfGasUsed;

        System.out.println("THE MILES PER GALLONS USED IS "+MilesPergallon);


    }
}