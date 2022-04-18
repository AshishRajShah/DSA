import java.util.Scanner;

public class PrimeNumber {
    
    static Scanner sc = new Scanner(System.in);

    public static void primechck()
    {
        int n = sc.nextInt();
        int count =0;
        for(int i=2; i*i<=n; i++)
        {
            if(n%i==0)
            {
                count++;
                break;
            }
        }
        if(count == 0)
            System.out.println("Prime");
        else
            System.out.println("not Prime");
        
    }

    public static void tillprimechck()
    {
        int low  = sc.nextInt();
        int high = sc.nextInt();

        for(int j=low; j<=high; j++)
        {
            int count =0;
            for(int i=2; i*i<=j; i++)
            {
                if(j%i==0)
                {
                    count++;
                    break;
                }
            }
            if(count == 0)
                System.out.println(j);
        }
    }
    
    public static void main(String[] args) {
        primechck();
        System.out.println("---------------------------");
        tillprimechck();
    }
}
