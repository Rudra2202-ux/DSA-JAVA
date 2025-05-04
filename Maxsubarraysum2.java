public class Maxsubarraysum2 {
    public static void maxsubarraysum(int num[]){
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[] = new int[num.length];
        prefix[0] = num[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i]=prefix[i-1]+num[i];
        }


        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
                currentsum =i==0 ? prefix[j]: prefix[j]-prefix[i-1];
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
