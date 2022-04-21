/* 
                *                               *
                *                               *
                *               *               *
                *       *               *       *
                *                               *
*/
import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int row =1; row<=n; row++)
        {
            for(int col=1; col<=n; col++)
            {
                if(col==1 || col ==n || (row==col || row+col == n+1) && row>n/2 )
                {
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
