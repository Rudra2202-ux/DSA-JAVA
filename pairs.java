public class pairs {
    public static void num_pairs(int num[]){
        int tp=0;
        for(int i=0; i<num.length; i++){
            for(int j=i+1; j<num.length; j++){
                System.out.print("("+num[i]+","+num[j]+")"+" ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs are: "+tp);
    }
    public static void main(String[] args){
        int num[]={2,4,6,8,10};
        num_pairs(num);
    }
}
/*Here time complexity is O(n2) because here we run a nested loop! */