import java.util.Scanner;
public class miniproject {
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mynumber = (int)(Math.random()*100);

        int usernumber=0;

        do{
            System.out.println("Guess the Number(1-100):");

           usernumber = sc.nextInt();

           if(usernumber == mynumber){
              System.out.println("WOOHOO.....CORRECT GUESS");
              break;
           }

           else if(usernumber<mynumber){
            System.out.println("Smaller than the Number");
           }

           else{
            System.out.println("Greater than the number");
           }

        } while(usernumber>=0);

        System.out.println("My number was:");
        System.out.println(mynumber);
        sc.close();
      }    
}
