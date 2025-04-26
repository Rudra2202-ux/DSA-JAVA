import java.util.*;
public class sum {
   /* public static void printsum(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }*/
    public static void main(String[] args){
       // printsum(65,78);
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the first Number:");
       int num1 = sc.nextInt();
       System.out.println("Enter the second Number:");
       int num2 = sc.nextInt();

       int sum = (num1 + num2);
       System.out.print("Your Desired sum is :");
       System.out.print(sum);
       sc.close();

    }
    
}
