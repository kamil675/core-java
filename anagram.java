
import java.util.Arrays;
public class anagram {
    public static void main(String[] args) {
        String s= "earth";
        String t= "heart";
        s=s.replace(" ","");
        t=t.replace(" ","");
        s=s.toLowerCase();
        t=t.toLowerCase();
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        boolean result= Arrays.equals(a,b);
        if(result==true)
        {
            System.out.println("string are anagram");
        }
        else
        {
            System.out.println("string are not anagram");
        }
    }
}
     
