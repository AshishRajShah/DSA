import java.util.Scanner;

public class PythagoreanTriplet {

    public static void tripletChck()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = largestNumber(a, b, c);

        if(max == a)
            System.out.println(a*a == b*b + c*c);
        else if(max == b)
            System.out.println(b*b == a*a + c*c);
        else
            System.out.println(c*c == b*b + a*a);
        sc.close();
    }

    public static int largestNumber(int a,int b,int c)
    {
        int max=a;
        if(max<b)
            max=b;
        if(max<c)
            max=c;
        return max;
    }
    
    public static void main(String[] args) {
        tripletChck();
    }
    
}
