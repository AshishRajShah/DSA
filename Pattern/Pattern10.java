/* 
                            *
                    *               *        
            *                               *
                    *               *        
                            *
*/
import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nspace =n/2, row =1;
        int nstar =1;

        while(row<=n)
        {
            for(int i=1; i<=nspace; i++)
            {
                System.out.print("\t");
            }
            for(int j=1; j<=nstar; j++)
            {
                if(j==1 || j==nstar)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();

            if(row<=n/2)
            {
                nstar +=2;
                nspace--;
            }
            else
            {
                nstar -=2;
                nspace++;
            }
            row++;
            sc.close();
        }
    }    
}
