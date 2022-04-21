/* 
                                *
                        *       *       *        
                *       *       *       *       *
                        *       *       *        
                                *
*/
import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nstar = 1;
        int nspace = n/2;

        for(int row=1; row<=n; row++)
        {
            for(int j=1; j<=nspace; j++)
            {
                System.out.print("\t");
            }
            for(int j=1; j<=nstar; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();

            if(row<=n/2)
            {
                nspace = nspace-1;
                nstar = nstar +2;
            }
            else
            {
                nstar = nstar -2;
                nspace = nspace+1;
            }
        }
        sc.close();
    }
}
