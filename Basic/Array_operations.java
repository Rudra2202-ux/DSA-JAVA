import java.util.Arrays;
public class Array_operations{
    public static void main(String[] args){
        int[] marks= new int[3];
        marks[0]=95;
        marks[1]=78;
        marks[2]=99;
       // System.out.println(marks[0]);
        //System.out.println(marks.length);
        Arrays.sort(marks);
        //System.out.println(marks[0]);
        //printing a 2D array
        int[][] mark={{43,47,45},{32,50,47}};
        System.out.println(mark[0][1]);
        System.out.println(mark[1][2]);

    }
}

