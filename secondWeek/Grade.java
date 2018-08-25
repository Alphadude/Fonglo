import java.util.Scanner;

class Grade{

    public static void main(String []grrd){

        Scanner kingsley = new Scanner(System.in);
        System.out.println("enter your score");
        double score = kingsley.nextDouble();

        if (score >= 70 && score<= 100){
            System.out.println("YOUR GRADE IS A");
        }else if(score >=60 && score <= 69){
            System.out.println("YOUR SCORE IS B");
        }else if(score >=50 && score <=59){
            System.out.println("YOUR GRADE IS C");
        }else if(score >=45 && score<= 49){
            System.out.println("YOUR GRADE IS D");
        }else if (score >=40 && score <= 44){
            System.out.println("YOUR GRADE IS E");
        }else if (score >= 0 && score <= 39){
            System.out.println("YOUR GRADE IS F");
        }else{
            System.out.println("INVALID INPUT TRY AGAIN");
        }
    }
}