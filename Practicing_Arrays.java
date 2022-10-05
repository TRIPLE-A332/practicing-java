import java.util.Scanner;

public class Arrays {
    
    public static void main(String[] args) {
        // int A[] = { 3 , 9 , 7 , 8 , 12 , 6 , 15 , 5 , 4 , 10 };            //used in first 6 questions


        //sum 
        /* 
        int sum = 0;
        for ( int i = 0 ; i <= A.length-1 ; i++ )
        {
            sum = sum + A[i];
        }
        System.out.println( sum );                                                                                1   */



        //Searching for an element
        /* 
        System.out.println("length of the array is " + A.length );
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the searching element number = ");
        int search = sc.nextInt();

        for ( int i = 0 ; i <= A.length ; i++)
        {
            if ( search == A[i] )
            {
                System.out.println("the no. searched for exists in the array at the index = " + i );
                System.exit(0);
            }
        }
        System.out.println("no. not found ");                                                                       2   */

        //Maximum value in the array
        /* 
        int max = 0;
        for ( int i = 0 ; i <= A.length-1 ; i++)
        {
            if ( A[i] > max )
            {
                max = A[i];
            }
        }System.out.println(max);                                                                                    3  */


        //Second Maximum Value
        /* 
        int max  =0;
        int max2 =0;
        for ( int i = 0 ; i <= A.length-1 ; i++)
        {
            if ( A[i] > max )
            {
                max2 = max;
                max = A[i];
            }
            
        }System.out.println(max2);                                                                                     4    */


        //Left Shifting an Array
        /* 
        for(int x : A )
        {
            System.out.print(x + " ");
        }
        System.out.println("");
        int temp = A[0];
        for ( int i = 1 ; i < A.length ; i++ )
        {   
            A[i-1] = A[i];
            
        }A[A.length-1] = temp;
        for(int x : A )
        {
            System.out.print(x + " ");
        }                                                                                                                5   */
        
        //Right Shifting an Array
        /* 

         for (int x : A )
         {
            System.out.print(x + " ");}
         System.out.println("");
         int temp = A[A.length-1];

         for ( int i = A.length-2 ; i >= 0 ; i-- )
         {
            A[i+1 ] = A[i];
         }
         A[0] = temp;
         for (int x : A )
         {
            System.out.print(x + " ");
         }                                                                                                                  6  */

         //Inserting an element  
         /* 
         int A[] = new int[10]; 
         A[0 ] =  5 ;
         A[1 ] =  9 ;
         A[2 ] =  6 ;
         A[3 ] =  10 ;
         A[4 ] =  12 ;
         A[5]  =  7 ; 
         for (int x : A )
         {
            System.out.print(x + " ");
         }
         //we have to insert 555 in index 2
         for (int i = 0 ; i < 6 ; i++ )
         {
            if ( i == 2 ) 
            {   
                for ( int j = 5 ; j > 1  ; j-- )
                {
                    A[j+1] = A[j];
                    
                }
                
            } 
         }
         System.out.println("");
         A[2] = 555;
         for (int x : A )
         {
            System.out.print(x + " ");
         }                                                                                                                        7  */

         //Deleting an element  
         /* 
         int A[] = new int[10]; 
         A[0 ] =  5 ;
         A[1 ] =  9 ;
         A[2 ] =  6 ;
         A[3 ] =  10 ;
         A[4 ] =  12 ;
         A[5]  =  7 ; 

         for (int x : A )
         {
            System.out.print(x + " ");
         }
         // deleting element 9 at 1st index
         int index = 1;
         for ( int i = 0 ; i < 6 ; i++ )
         {
            if ( i == index ) 
            {    
                for (int j = index ; j < 6 ; j++)
                {
                    A[j] = A[j+1];
                }
            }
         }System.out.println("");
         for (int i = 0 ; i < 6 ; i++ )
         {
            System.out.print(A[i] + " ");
         }                                                                                                                 8    */



         //2D ARRAYS



         //adding 2 Matrices
         /* 
        int A[][] = {{3,5,9},{7,6,2},{4,3,5}};
        int B[][] = {{1,5,2},{6,8,4},{3,9,7}};
        int C[][] = new int [3][3];
        for (int i = 0 ; i < A.length ; i++ )
        {
            for (int j = 0 ; j < A[0].length ; j++ )
            {
                C[i][j] = A[i][j]+B[i][j] ;
            }
        }
        for (int x[] : C )
        {
            for (int y : x )
            {
                System.out.format("%2d " , y);
            }System.out.println("");
        }                                                                                                                    9  */

        //MULTIPLYING 2 MATRICES
        /* 
        int A[][] = {{3,5,9},{7,6,2},{4,3,5}};
        int B[][] = {{1,0,0},{0,1,0},{0,0,1}};
        int C[][] = new int [3][3];

        for (int i = 0 ; i < A.length ; i++ )
        {
            for (int j = 0 ; j < A[0].length ; j++ )
            {
                for (int k = 0 ; k < A.length ; k++ )
                {
                    C[i][j] = C[i][j] + A[i][k] * B [k][j];
                }
            }
        }
        for (int x[] : C )
        {
            for (int y : x )
            {
                System.out.format("%2d " , y);
            }System.out.println("");
        }                                                                                                                      10     */

        //Sorting Array of Strings

        String Names[] = {"Java" , "Sabka " ,"Bawa" ,"Algo" };

        java.util.Arrays.sort(Names);
        for (String x : Names )
        {
            System.out.println(x);
        }
    


    }
}
