import java.util.*;
public class Max_number {
    public static int getLargest(int num[], int n){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(num[i]>largest){
                largest = num[i];
            }
            if(num[i]<smallest){
                smallest = num[i];
            }
        }
        System.out.println("The smallest value in array is: "+smallest);
        return largest;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num[]= new int[10];
        System.out.println("Enetr the number of element you want to pass to the array:");
        int n= sc.nextInt();

        for(int i=0;i<n; i++){
            num[i]=sc.nextInt();
        }
        System.out.println("Your given array is:");
        for(int i=0; i<n; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
        System.out.println("The largest value in the array is: "+getLargest(num,n));
        sc.close();
    }
}
