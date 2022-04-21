/* 
                                    *
                            *       *
                    *       *       *
            *       *       *       *
*/

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            int nstar = i;
            int nspace = n-i;
            for(int j=1; j<=nspace; j++)
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

