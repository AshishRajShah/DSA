/* 
                1                                               1
                1       2                               2       1
                1       2       3               3       2       1
                1       2       3       4       3       2       1
*/
import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nspace= n*2-3, nstar =1;

        for(int row=1; row<=n; row++)
        {
            int val =1;
            for(int i=1; i<=nstar; i++)
            {
                System.out.print(val+"\t");
                val++;
            }
            for(int j=1; j<=nspace; j++)
            {
                System.out.print("\t");
            }
            val   = row < n ? nstar : nstar-1;
            nstar = row < n ? nstar : nstar-1;

            for(int k=1; k<=nstar; k++)
            {
                System.out.print(val+"\t");
                val--;
            }
            System.out.println();

            nspace -=2;
            nstar++;
        }
        sc.close();
    }
}
