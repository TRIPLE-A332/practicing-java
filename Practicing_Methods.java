import java.util.Scanner;

public class Practicing_Methods {
    
    //MAXIMUM 
    /* 
    static int Max( int x,int y)
    {
        if ( x > y )    return x; 
        else            return y; 
    }
    public static void main(String[] args) {
        int x =  10;
        int y = 15;
        int c;
        c = Max( x , y );
        System.out.println(c);
    }                                                                                                                                        1  */


    //no. is prime or not
    /* 
    static Boolean isPrime(int n)
    {
        for (int i = 2 ; i <= n/2 ; i++)
        {
            if (n%i == 0)
            {
                return false;    
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPrime(num));

    }                                                                                                                                   2 */
    //gcd or hcf 
/* 
    static int hcf(int m , int n )
    {
        while(m!=n)
        {
            if (m<n){ n= n-m; }
            else { m = m-n; }
        }
        return m; //m or n anyone works cuz they will be equal ti end the while loop
    }
    public static void main(String[] args) {
        System.out.println(hcf(10,5));
    }                                                                                                                                   3   */
    




}
