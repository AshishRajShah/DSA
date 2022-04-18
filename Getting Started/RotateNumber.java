import java.util.Scanner;

public class RotateNumber {
    public static void rotate()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int pow =1,count=0;
        int d =n;

        while(d>0)
        {
            d = d/10;
            pow = pow*10;  
            count++;
        }
    
        k = k%count;
        if(k<0)
            k = k + count;
            
        int div = (int)Math.pow(10,k);
        int Mult = pow/div;

        int answer = (n%div)*Mult + (n/div);
        System.out.println(answer); 
        sc.close();
    }

    public static void main(String[] args) {
        rotate();
    }
    
}
