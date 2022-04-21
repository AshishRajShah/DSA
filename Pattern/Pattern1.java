/* 
        *
        *       *
        *       *       *        
        *       *       *       *

*/
import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++)
        {
            int nstar = i;
            for(int j=1; j<=nstar; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
