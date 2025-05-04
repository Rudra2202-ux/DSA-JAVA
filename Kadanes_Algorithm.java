import java.util.*;
public class Kadanes_Algorithm {
    public static void Kadanes(int num[],int n){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0; i<n; i++){
            cs = cs + num[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(ms,cs);
        }
        System.out.println("Our maximum subarray sum is: "+ms);
    }
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the lenggth of your array:");
         int n = sc.nextInt();
         int num[]= new int[n];
         System.out.println("Enter the elements of your array:");
         for(int i=0; i<n; i++){
             num[i]=sc.nextInt();
         }
         System.out.println("Your entered array is:");
         for(int i =0; i<n; i++){
            System.out.print(num[i]+" ");
         }
         System.out.println();
         Kadanes(num,n);
         sc.close();
    }
    
}
