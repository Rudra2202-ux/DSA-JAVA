import java.util.Scanner;
public class shopkeper {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Amount of Cash you have:");
       int cash = sc.nextInt();
       sc.close();
       if(cash<10){
        System.out.println("Cannot buy anything");
        System.out.println("Get more cash");
       }

       else if(cash>10 && cash<40){
        System.out.println("Can get one thing");
       }

       else{
        System.out.println("can get anything");
       }

    }
}
