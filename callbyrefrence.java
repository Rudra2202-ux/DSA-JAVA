public class callbyrefrence {
    public static void update(int marks[], int n){
        n=11;
        for(int i=0; i<marks.length; i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args){
        int marks[]={98,99,97};
        int nonchangeable = 10;
        update(marks,nonchangeable);
        System.out.println(nonchangeable);
        for(int i = 0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println("");
    }
}
