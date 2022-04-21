/* 
            0
            1       1
            2       3       5
            8       13      21      34
*/
import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first=0, second =1,third;

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i ; j++)
            {
                System.out.print(first+"\t");
                third = first + second;
                first = second;
                second = third;
            }
            System.out.println();
        }
        sc.close();
    }
}
