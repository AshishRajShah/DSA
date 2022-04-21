/* 
                            1
                    2       3       2        
            3       4       5       4       3
                    2       3       2        
                            1
*/
import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nspace = n/2, nstar=1,num=1;

        for(int row=1; row<=n; row++)
        {
            for(int j=1; j<=nspace; j++)
            {
                System.out.print("\t");
            }
            int tmp = num;
            for(int k=1; k<=nstar; k++)
            {
                System.out.print(tmp+"\t");
                if(k<=nstar/2)
                    tmp += 1;
                else
                    tmp -= 1;
            }
            System.err.println();

            if(row<=n/2)
            {
                nspace--;
                nstar +=2;
                num ++;
            }
            else
            {
                nspace++;
                nstar -=2;
                num--;
            }
        }
        sc.close();
    }
}
