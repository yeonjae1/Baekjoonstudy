import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
   public static void main(String[] args){
       Scanner s = new Scanner(System.in);

       int N = s.nextInt();

       for(int i = 0; i < N; i++){
           int A = s.nextInt();
           int B = s.nextInt();
           System.out.println(A+B);
       }
       s.close();

   }
}