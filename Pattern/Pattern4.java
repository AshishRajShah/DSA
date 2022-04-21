/* 
                *       *       *       *
                        *       *       *
                                *       *
                                        *
*/
import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            int nstar = n+1-i;
            int nspace = i;
            for(int j=1; j<nspace; j++)
            {
                System.out.print("\t");
            }
            for(int j=1; j<=nstar; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
        sc.close();
    } 
    
}
