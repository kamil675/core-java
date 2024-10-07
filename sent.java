 import java.util.Scanner;
 public class sent{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the sentence:");
             String ab= sc.nextLine();
             int n=0;
             for(int i=1;i<ab.length();i++){
                if (ab.charAt(i)==' '){
                    n=n+1; 
            }
        } 
        System.out.println(n+1);
        }
    }


 }
