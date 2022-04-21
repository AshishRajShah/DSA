/* 
            *       *       *               *
                            *               *
            *       *       *       *       *
            *               *
            *               *       *       *
*/

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int row=1; row <=n; row++)
        {
            for(int j=1; j<=n; j++)
            {
                if(row==1 && j<=n/2 + 1 || row==n && j>=n/2 +1  || row==n/2+1 || j==n/2+1 || j==1 && row>n/2 || j==n && row<=n/2)
                {
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        sc.close();

    }
}
