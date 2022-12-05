public class StringPalindrome {
    public static void main(String[] args) {
        String str="naman";
        String rev="";

        int strlngth=str.length();
        for(int i=(strlngth-1);i>=0;i--)
        {
          rev=rev+str.charAt(i);
        }
        if(str.toLowerCase().equals(rev.toLowerCase()))
        {
            System.out.println("this is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

        }
}
