import java.util.Scanner;
public class Isprime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to check prime or not?:");
            int n = sc.nextInt();
        int div = 2;
    while(div<n){
        if(div<n){
            if(n%div==0){
                System.out.println("The number is not a prime number.");
                break;
            }
            else{
                div = div+1;
            }
        }
    }
    if(div>=n){
        System.out.println("The Number is prime number.");
    }
    sc.close();

    }
}
