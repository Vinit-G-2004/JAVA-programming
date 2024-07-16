public class strCopmpare {
    public static void main(String[] args) {
        String str1="tony";
        String str2="tony";
        String str3= new String("tony");
        String str4="VINIT";

        if (str1.equals(str3)) 
        {
            System.out.println("string are equal");  
        }
        else
        {
            System.out.println("string are not equal");
        }
        
        System.out.println(str1.toUpperCase());
        System.out.println(str4.toLowerCase());
    }
}
