/**
 * fibo
 */
import java.util.Scanner;

public class fibo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int k = 0, temp = 1,result,n;
        System.out.print("kaç eleman olsun : ");
        n = scan.nextInt();
        for (int i = 1; i < n - 1; i++ ){
            result = k + temp  ;
            
            System.out.println(k + " + " + temp + " = " + result);
            k = temp;
            temp = result;

        }
    }
}