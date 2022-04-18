import java.util.Scanner;

public class ReverseNumber {

    public static void reverse()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();

        while(n>0)
        {
            int d = n%10;
            System.out.println(d);
            n = n/10;
        }
        sc.close();
    }
    public static void main(String[] args) {
        reverse();
    }
}
