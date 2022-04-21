/* 
            *       *       *       *
            *       *       *        
            *       *
            *

*/
import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            int nstar = n-i;
            for(int j=0; j<=nstar; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
