/* 
                                *
                                *       *        
                *       *       *       *       *
                                *       *        
                                *
*/
import java.util.Scanner;

public class Pattern17 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nspace=n/2, nstar =1;

            // ------------         Type-1...
        /* for(int row=1; row<=n; row++)
        {
            for(int i=1; i<=nspace; i++)
            {
                System.out.print("\t");
            }
            for(int j=1; j<=nstar; j++)
            {
                if(j<=nstar/2 && row != n/2+1)
                    System.out.print( "\t");
                else
                    System.out.print( "*\t");
            }
            System.out.println();

            if(row<=n/2)
            {
                nspace--;
                nstar +=2;
            }
            else{
                nspace++;
                nstar -=2;
            }
        } */

            // ------------         Type-2...
        for(int row=1; row<=n; row++)
        {
            for(int i=1; i<=nspace; i++)
            {
                if(row == n/2 +1)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            for(int j=1; j<=nstar; j++)
            {
                    System.out.print( "*\t");
            }
            System.out.println();

            if(row<=n/2)
                nstar++;
            else
                nstar--;
        }
        sc.close();
    }    
}
