import java.util.Scanner;
public class sumofnaturalnu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the natural number to get the sum:");
        int n = sc.nextInt();
        sc.close();
        int f=0;
        for(int i=1; i<=n; i++){
            f = f+i;
        }
        System.out.println(f);
    }
    
}
