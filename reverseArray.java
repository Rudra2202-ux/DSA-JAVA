public class reverseArray {
    public static void reverse(int numbers[]){
        int first=0;
        int last = numbers.length - 1;
        while(first<last){
             int temp = numbers[first];
             numbers[first] = numbers[last];
             numbers[last] = temp;
             first++;
             last--; 
        }
    }
    public static void main(String[] args){
        int numbers[]={2,4,7,9,5,1,8};
        System.out.println("Your Given Array is:");
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        reverse(numbers);
        System.out.println("Your Reveresed array is:");
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
      System.out.println();
    }
}
