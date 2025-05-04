import java.util.*;
public class input_output {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A[] = new int[100];
        A[0]=sc.nextInt();
        A[1]=sc.nextInt();
        A[2]=sc.nextInt();

        System.out.println("Physics: "+A[0]);
        System.out.println("CHEMISTRY: "+A[1]);
        System.out.println("MATHS: "+A[2]);
        sc.close();
    }
}
