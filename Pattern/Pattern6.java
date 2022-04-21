/* 
                *       *       *               *       *       *
                *       *                               *       *
                *                                               *
                *       *                               *       *
                *       *       *               *       *       *
*/

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nstar = n/2+1;
        int nspace = 1;

        for(int row=1; row<=n; row++)
        {
            for(int j=1; j<=nstar; j++)         //no. of star...
            {
                System.out.print("*\t");
            }
            for(int j=1; j<=nspace; j++)        //no. of space....
            {
                System.out.print("\t");
            } 
            for(int j=1; j<=nstar; j++)         // no. of star...
            {
                System.out.print("*\t");
            }
            System.out.println();

            if(row<=n/2)
            {
                nstar = nstar-1;
                nspace = nspace+2;
            }
            else
            {
                nstar = nstar +1;
                nspace = nspace-2;
            }
        }
        sc.close();
    }
    
}
