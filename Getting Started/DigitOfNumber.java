import java.util.Scanner;

public class DigitOfNumber {

    public static void digitShow()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = n,tmp = 1;

        while(d>9)
        {
            d= d/10;
            tmp = tmp * 10;
        }

        while(n>0)
        {
            int digit = n/tmp;
            System.out.println(digit);
            n = n%tmp;
            tmp = tmp/10; 
        }
        sc.close();
    }

    public static void main(String[] args) {
        digitShow();
    }
    
}
