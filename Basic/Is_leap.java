import java.util.Scanner;
public class Is_leap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n%4==0 && n%100 !=0) || (n%400 == 0)){
            System.out.println("The Year is a leap Year.");
        }else{
            System.out.println("The year is not a leap year.");
        }
    }
    
}
