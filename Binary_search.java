public class Binary_search {
    public static int binarysearch(int numbers[], int key){
        int start =0;
        int end = numbers.length -1;
        int mid;

        while(start<=end){
            mid = (start + end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            else if(numbers[mid]<key){
                start=mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int numbers[]={2,4,6,8,10,12,14};
        int key = 25;
        int index = binarysearch(numbers,key);
        if(index==-1){
            System.out.println("The element is not found.");
        }
        else{
            System.out.println("The element is found at index: "+index);
        }
    }
}
