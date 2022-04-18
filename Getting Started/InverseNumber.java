import java.util.Scanner;

public class InverseNumber {

    public static void inverse()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0,pos=1;

        while(n>0)
        {
            int digit = n%10;
            int formula = pos * (int)Math.pow(10, digit-1);
            sum = sum+ formula;
            n =n/10;
            pos++;
        }
        System.out.println(sum);
        sc.close();
    }

    public static void main(String[] args) {
        inverse();
    }
    
}
