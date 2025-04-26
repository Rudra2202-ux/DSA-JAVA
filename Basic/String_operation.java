public class String_operation{
    public static void main(String[] args){
      String name1 = "Rudra";
      String name2 = "Singh";
      String name3 = name1 + " and " + name2;

      System.out.println(name3);
      System.out.println(name1.charAt(2));
      System.out.println(name2.length());
      //replace function is used to replace the present char
      // to new char
      String name4 = name1.replace('a','b');
      System.out.println(name4);

      System.out.println(name3.substring(0,5));
    }
}
