import java.util.Scanner;

public class fibonacci {

    public static void fibonacciSeries()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first =0, second=1,third;

        for(int i=1;i<=n;i++)
        {
            System.out.print(first+" ");
            third = first + second;
            first = second;
            second = third;
        }
        sc.close();
    }

    public static void main(String[] args) {
        fibonacciSeries();
    }
    
}
