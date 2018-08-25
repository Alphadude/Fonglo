 import java.util.Scanner;
 
 class ConditionalSwitch{

     public static void main(String []args){
         Scanner marker = new Scanner(System.in);
         System.out.println("ENTER YOUR AGE");
        //  double base = marker.nextDouble();
        //  System.out.println("ENTER VALUE FOR HEIGHT");
        //  double height = marker.nextDouble();
        //  double Area = (0.5 *(base*height));
        //  System.out.println("THE AREA OF THE TRIANGLE IS "+Area);

        int Age = marker.nextInt();

        if (Age >=0 && Age <= 12  ){
            System.out.println(" THEN URE IN THE JUNIOR CLASS");
        }else if(Age >= 13 && Age <= 19){
            System.out.println("YOU ARE IN THE TEEN CLASS");
        }else if(Age >= 20 && Age <= 31 ){
            System.out.println("YOU ARE IN THE YOUTH CLASS");
        }else if (Age >= 32){
            System.out.println("YOU ARE MARRIED");
        }else{
            System.out.println("invalid input");
        }
     }
 }