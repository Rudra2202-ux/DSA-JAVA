public class try_catch {
    public static void main(String[] args){
        int[] marks = {87,89,95};
        try{
            System.out.println(marks[5]);
        }catch(Exception exception){
            /*after catching the exception
             * we perform some action on it in 
             * cartch section
             */
        }
        System.out.println("Marks of Physics is :");
        System.out.println(marks[2]);
    }
    
}
