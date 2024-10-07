
import java.util.Scanner;

public class input_arr {
    public static void main(String[] args) {
        String[] name= new String[3];
        try (Scanner sc = new Scanner(System.in)) {
            for(int i=1; i<=5; i++){
                name[i]= sc.nextLine();
            }
        }
        for(int i=1;i<=5;i++){
            System.out.println("name["+i+"] ="+name[i]);
        }

    }
}