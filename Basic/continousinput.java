import java.util.Scanner;
public class continousinput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number=0;
        do{
            System.out.println("Input a Number:");
            number = sc.nextInt();
            System.out.print("Here is your Number:");
            System.out.println(number);
        } while(number>=0);

        System.out.println("THE END"); 
        sc.close();
    }
}
