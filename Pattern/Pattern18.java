/* 
                    *       *       *       *       *       *       *
                            *                               *        
                                    *               *
                                            *
                                    *       *       *
                            *       *       *       *       *        
                    *       *       *       *       *       *       *
*/
import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nspace=1,nstar=n;
    
        for(int row=1; row<=n; row++)
        {
            for(int i=1; i<nspace; i++)
            {
                System.out.print("\t");
            }
            for(int i=1; i<=nstar; i++)
            {
                if(row<=n/2)
                {
                    if(row==1 || i==nstar || i==1)
                        System.out.print("*\t");
                    else
                        System.out.print("\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }
            System.out.println();

            if(row<=n/2)
            {
                nspace++;
                nstar -=2;
            }
            else
            {
                nspace--;
                nstar +=2;
            }
        }
        sc.close();
    }
}
