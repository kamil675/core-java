import java.util.Scanner;
public class largestno {
    public static void main(String[] args) {
       
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.println("enter n no.");
            int n= Sc.nextInt();
            int[] arr= new int[n];
            for(int i=1; i<=n; i++){
                arr[i]= Sc.nextInt();
            }
            int k=arr[1];
            for(int j=2;j<=n;j++){
                if(k<arr[j]){
                    k=arr[j];
                }
                else{
                    
                }

            }
            System.out.println(k);
        }
    }
}
