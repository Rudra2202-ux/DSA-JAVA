public class linear_search {
    public static int linearsearch(int numbers[], int key){
        for(int i=0; i<numbers.length;i++){
            if(key==numbers[i]){
                return i;
            }
        }
       return -1;
    }
    public static void main(String[] args){
       int numbers[] = {7,11,4,10,8,2,9};
       int key=10;
       int index = linearsearch(numbers,key);
       if(index==-1){
        System.out.println("Element not found.");
       }
       else{
        System.out.println("Element found at index: "+index);
       }

    }
}
