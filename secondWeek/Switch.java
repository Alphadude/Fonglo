import java.util.Scanner;

class Switch{

    public static void main(String []peace){

        Scanner bro = new Scanner(System.in);
        System.out.println("ENTER A NUMBER BTWN 1 AND 5 FOR YOUR DEPARTMENT");
        int department = bro.nextInt();
        switch(department)
        {
            case 1:
            //System.out.println("Dr Friday");
            case 2:
            case 3:
            System.out.println("Dr Friday");
            break;
            case 4:
            System.out.println("Prof Nwachukwu");
            break;
            case 5:
            System.out.println("Godfrey");
            break;
            default:
            System.out.println("invalid department code");
        }
    }
}