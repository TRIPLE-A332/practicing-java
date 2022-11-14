package lab_file;

import java.util.Scanner;


/*1 bank questiion
class Bank {
    public int acc_no , bank_balance , withdrawal_amount ;

  
    public int balance_left()
    {
        
        System.out.print("remaining balance = ");
        int balance_left = bank_balance - withdrawal_amount ;
        return balance_left ;

    }

}

public class lab_file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Bank bn = new Bank();
        
        System.out.print("account num = ");
        bn.acc_no = sc.nextInt(); 

        System.out.print("curr bank balance = ");
        bn.bank_balance = sc.nextInt();

        System.out.print("amount to with = ");
        bn.withdrawal_amount = sc.nextInt();

        System.out.print(bn.balance_left());
        
    }
}                                                                                                                        */

/*2 data hiding   
class Rectangle {
    private double length , breadth ;

    public double getLength()  {   return length;    }
    public double getBreadth() {   return breadth;   } 

    public void setLength( double l ) 
    {   
        length = l ;
    }
    public void setBreadth( double b ) 
    {
        breadth = b;
    }

    public double area( double a )
    {
        a = length*breadth;
        return a;
    }

}
public class lab_file
{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setBreadth(5);
        r.setLength(5);

        System.out.println(r.getBreadth() +" " + r.getLength() );
        System.out.println(r.area(0));
    }
}                                                                                  */

/*3 use of static word
public class lab_file
{
    
    public static void main(String[] args) {
        
        
        System.out.println(msg());
    }

    static String msg()
        {
           return "Hello there";
        }

    
} */

/*4 default and parameterised constructors 
class Rectangle
{
    public int length , breadth ;

    public double Area()
    {
        double a = length * breadth;
        return a;
    }

    public Rectangle()
    {
        length = 1;
        breadth = 1;
        System.out.println("default constructor is called where " + " l= " + length +" b= " + breadth );
    }
    public Rectangle(int l , int b )
    {
        length = l;
        breadth= b;
        System.out.println("parameterised constructor is called where "+ " l= " + l +" b= " + b );
    }

}
public class lab_file
{
    public static void main(String[] args) {
        
       Rectangle r = new Rectangle();
       Rectangle r2 = new Rectangle(10,5);

    }
}                           */

//INHERITANCE coudnt do
/* class account
{
    Scanner sc = new Scanner(System.in);

    public String acc_no , name , address ,dob;
    public long phone_no ;
    public int balance ;
    
    public int getBalance()
    {
        return balance;
    }
    public String getAcc_no()
    {
        return acc_no;
    }
    public String getName()
    {
        return name;
    }
    public String getAdd()
    {
        return address;
    }
    public String getDOB()
    {
        return dob;
    }
    public long getPh_no()
    {
        return phone_no;
    }

    public void setName(String n)
    {
        name = n;
    }
    public void setAdd(String a)
    {
        address = a;
    }
    public void setPh_no(long p)
    {
        phone_no = p;
    }
    
    public account()
    {

    }
    public account(String acc , String na , String add , String DOB , long ph_no , int bal )
    {
        bal = getBalance();

        acc = getAcc_no() ;
        
        na = getName();
        
        add = address;
        
        DOB = dob  ;
        
        ph_no = phone_no ;
    }
    

}
class savingsAcc extends account 
{
    public int withdrawal_amount ;
    
    public int getWithd()
    {   
        int wi = sc.nextInt();
        wi = withdrawal_amount;
        return withdrawal_amount;
    }

    public int getBalance()
    {   
        balance = 888;
        return balance;
    }

    public int withd()
    {
        return balance - withdrawal_amount;
    }

}
public class lab_file{
    public static void main(String[] args) {        
    
        savingsAcc ac1 = new savingsAcc();
        
        ac1.setAdd("afwasdad");
        System.out.println("add " + ac1.address);

        System.out.println(ac1.withd());
         
             
        }
}                                 */

/*(easy)inheritance on circle and cylinder

class circle 
{
    public double radius ;

    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double circumference()
    {
        return Math.PI*2*radius;
    }

}

class cylinder extends circle
{
    public double height ;

    public double volume()
    {
        return area()*height;
    }
}

public class lab_file
{
    public static void main(String[] args) {
        cylinder c = new cylinder();
        c.radius = 4.55;
        c.height = 9.0 ;

        System.out.println("area = " + c.area());
        System.out.println("vol = " + c.volume());

    }
}                                         */

//param contructors

class parent 
{   
    public void parent()
    {
        System.out.println("this is a method");
    }
    parent ()
    {
        System.out.println("non param parent called ");
    
    }
    parent (int x)
    {
        System.out.println("param parent called");
    }
    
}

class child extends parent
{
    child()
    {
        System.out.println("non param child called");
    
    }
    child(int y)
    {
        System.out.println("param child called");
    }
    child (int x, int y)
    {
        super(x);
        System.out.println("super param child called ");
    }
}

public class lab_file{
    public static void main(String[] args) {
        parent p = new parent();
        p.parent();
    }
}