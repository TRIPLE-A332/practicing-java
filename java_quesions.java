import java.util.Scanner;
import java.rmi.server.SocketSecurityException;
import java.util.*;

public class java_quesions {

    public static void main(String[] args) {

        /*       MATHEMATICAL TABLE
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the table you want = ");
        int T = sc.nextInt();
        System.out.println("Enter uptil you want(usually table is learned upto 10 ) =  ");
        int upto = sc.nextInt();
    
        for (int temp = 0 ; temp <= upto ; temp++ ){
            int temp2 = T*temp;
            System.out.println(T + " * " + temp + " = " + temp2);
  
        }
        */

            /*ADDING TILL N TIMES
            int i = 0;
        while (true){
            
            System.out.println( i );
            i++;

        } */

        /*FIBONACCI SERIES
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to begin with = ");
        int a = sc.nextInt();
        System.out.println("enter the 2nd number = ");
        int b = sc.nextInt();
        System.out.println("uptill where do the user wants the series till = ");
        int times  = sc.nextInt();

        for (int temp = 1 ; temp <= times  ; temp++ )
        {
            int series = a + b;
            System.out.println(a + " + " + b + " = " + series + " " );
            a = b;
            b = series;
        

        }                 */

        /*PRINTING DIGITS

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while ( n > 0 )
        {
            int a = n%10;
            System.out.print( a + " " );
            n = n / 10;
        }   */

        /*ARMSTRONG NUMBER
        int sum = 0;
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int m = num;
        
        while ( num > 0 )
        {
            int temp = num%10;
            sum = sum + temp * temp * temp;
            num = num / 10;
            
        }
        if ( sum == m)
        {
           System.out.println("arm no.");

        }   else { System.out.println(" not ");}        */


        /*REVERSING A NUMBER
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");  
        int num = sc.nextInt();


        while ( num > 0 ) 
        {
            int temp = num % 10;
            System.out.print( temp );
            num = num / 10;
        }               */

        /*DIGITS IN WORDS  
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");  
        int num = sc.nextInt();
        int rev;
        String str = "";
        

            while ( num > 0 )
           {
                int r = num % 10;
                num = num / 10;
                str = str + r;
                
            } 
             
            char c ;

            for ( int i = str.length()-1; i>=0 ; i-- )
            {   
                c = str.charAt(i);
                switch ( c )
                {
                     case '0' -> System.out.println("Zero");
                     case '1' -> System.out.println("ONE");
                     case '2' -> System.out.println("TWO");
                     case '3' -> System.out.println("THREE");
                     case '4' -> System.out.println("FOUR");
                     case '5' -> System.out.println("FIVE");
                     case '6' -> System.out.println("SIX");
                     case '7' -> System.out.println("SEVEN");
                     case '8' -> System.out.println("EIGHT");
                     case '9' -> System.out.println("NINE");

                }
            }               */
           
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 no.s to begin the series with = ");
        int fib1 = sc.nextInt();
        int fib2 = sc.nextInt();

        System.out.println("no till the series cont = ");
        int till = sc.nextInt();
        int i = 2;
        
        while ( till > i )
            {
                int followUp = fib1 + fib2 ;
                System.out.println(followUp);
                fib1 = fib2;
                fib2 = followUp;
                i++;
                
            }
            
            */
            
        //NESTED (PATTER TYPE QUESTIONS)
       /*         for ( int i = 1 ; i <= 5 ; i++ )
        {
        for ( int j = 1 ; j <= 5 ; j++ ){
            System.out.print( j + " " );
        }
        System.out.println("");
        } 

        for ( int i = 1 ; i <= 5 ; i++) 
        {
        for ( int j = 1 ; j <= 5 ; j++ )
        {
            System.out.print( i + " " );
        }
        System.out.println("");
         }               */

        /* 
    
        for ( int i = 1 ; i <= 5 ; i++)
        {
        
        for( int j = 1 ; j <= 5 ; j++ )
        {
            System.out.print( i + j + " " );
            

        }
           
        System.out.println("");

        }       */
            /*
        int temp = 1;
        for ( int i = 1 ; i <= 5 ; i++)
        {

        for( int j = 1 ; j <= 5 ; j++ )
        {
            System.out.format( "%02d " , temp );
            temp++;

        }  System.out.println("");

        }       */
    
        /*pattern
        int count = 2;
        for ( int i = 1 ; i <= 5 ; i++ )
        {
            for ( int j = 1 ; j <= 5 ; j++ )
            {
                if ( count > j ) 
                { System.out.print( j + " " );} 
                
            }
            System.out.println("");
            count++;
        }               
                    OR

        for ( int i = 1 ; i <= 5 ; i++ )
        {
            for ( int j = 1 ; j <= i ; j++ )
            {
                System.out.print( j + " ");
            }System.out.println("");
        }           */

        /*more pattern 
        int temp = 1;
        for ( int i = 1 ; i <= 5 ; i++ )
        {
            for ( int j = 1 ; j <= i ; j++ )
            {
                System.out.format( "%02d " , temp );
                temp++;
            }
            System.out.println("");
            
        }       */

                /*
        int temp = 5;
        for ( int i = 1 ; i <= 5 ; i++ )
        {
            for ( int j = 1 ; j <= temp ; j++ )
            {
                System.out.print( j + " ");
            }System.out.println("");
            temp--;

        }            */

            /* 
        
        for ( int i = 1 ; i <= 5 ; i++ )
        {
            for ( int j = 1 ; j <= 5 ; j++ )
            {   if ( j>=i )
                { 
                System.out.print( " * " );
                }
                else { System.out.print("   ");}
            }System.out.println("");
            

        }               */

            /* 
        for(int i = 1 ; i <= 5 ; i++ )
        {
            for ( int j = 1 ; j <= 5 ; j++ )
            {
                if ( i + j > 5 )
                {
                    System.out.print(" * ");
                } else { System.out.print("   ");}
            }
            System.out.println("");
        }               */

        
        for (int i = 1 ; i <= 5 ; i++ ) 
        {
            for (int j = 1 ; j <= 5 ; j++)
            { if ( i + j > 5 )
                {
                    System.out.print(" * ");
                } else { System.out.print("   ");}
               
            }

            for (int k = 1 ; k <= 4 ; k++)
            { if ( k < i ) 
                {
                System.out.print( " * ");
                } else {  System.out.print("   ");  }
            }
            System.out.println("");
        }






    }
}