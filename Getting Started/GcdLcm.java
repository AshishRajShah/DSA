import java.util.Scanner;

public class GcdLcm{

    public static void gcdLcm()
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int a=n1, b=n2;
        while(n1%n2 != 0)
        {
            int r = n1%n2;
            n1 = n2;
            n2 =r;
        }
        int gcd = n2;
        int lcm =  (a*b)/gcd;
        System.out.println("Gcd : "+ gcd);
        System.out.println("Lcm : "+ lcm);

        sc.close();
    }
    
    public static void main(String[] args) {
        gcdLcm();
    }
}
