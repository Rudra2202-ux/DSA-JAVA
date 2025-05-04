public class Maxsubarraysum {
    public static void maxsubarraysum(int num[]){
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
                currentsum=0;
                for(int k=i; k<=j; k++){
                    currentsum +=num[k];
                }
                System.out.println(currentsum);
                if(currentsum>maxsum){
                    maxsum=currentsum;
                }

            }       
        }
        System.out.println("Maximun sum of a subarray is:"+maxsum);

    }
    public static void main(String[] args){
        int num[]={2,4,6,8,10};
        maxsubarraysum(num);
    }
}
