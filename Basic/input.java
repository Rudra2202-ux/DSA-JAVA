import java.util.Scanner;
public class input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name:");
        //int age = sc.nextInt();
        //System.out.println(age);
        //next func only take tokenss as input.
        String name = sc.nextLine();
        sc.close();
        System.out.println(name);
    }
    
}
