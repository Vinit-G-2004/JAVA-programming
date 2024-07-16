public class subStr {

    public static String subString(String str, int si, int ei) {
        String str1= "";
        for (int i = si; i < ei; i++) {
            str1 += str.charAt(i);
        }
        return str1;
    }

    public static void main(String[] args) {
        String str = "helloWorld";
        System.out.println(subString(str, 0, 5));

    }
}
