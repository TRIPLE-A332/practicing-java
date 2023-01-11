

/*    making a smartphone using interferance 
class phone {

    public void Call()
    {
        System.out.println("call is made");
    }
    public void SMS()
    {
        System.out.println("SMS is sent");
    }

}

interface ICamera
{
    void click();
    void record();
}

interface IMusicPlayer
{
    void playMusic();
    void recordMusic();
}

class Smartphone extends phone implements ICamera , IMusicPlayer
{   
    public void videoCall(){System.out.println("makes aa video call");}  //a method in smarthphone

    public void click(){  System.out.println("clicks a photo");  }       //overrided methods from icamera and imusicPlayer
    public void record(){System.out.println("records a video");}
    public void playMusic(){System.out.println("plays music");}
    public void recordMusic(){System.out.println("records music");}
}


public class Prac_interfaces
{
    public static void main(String[] args) {
        
        Smartphone sp = new Smartphone();
        sp.Call();
        sp.SMS();
        sp.click();
        sp.record();
        sp.playMusic();
        sp.recordMusic();

        sp.videoCall();
    }   
}                                               */
/*making a store customer example 

interface Member
{
   public void giveCall();
}

class Store 
{
    Member members[] = new Member[10];
    int count = 0;
    
    void registration(Member m)
    {
        members[count++] = m;
        System.out.println(count);  //for self
    }
    void inviteSale()
    {
        for (int i = 0; i<count ; i++ )
        {
            members[i].giveCall();
        }
    }

}

class Customer implements Member
{
    String name;
    Customer(String n)
    {
        name = n;
    }

    public void giveCall()
    {
        System.out.println(name + " says will come ");
    }
}
public class Prac_interfaces{
    public static void main(String[] args) {
        Store s = new Store();
        Customer c1 = new Customer("Ali");
        Customer c2 = new Customer("Ahmad");
        s.registration(c1);
        s.registration(c2);

        s.inviteSale();

    }
}                                                                                               */



interface Test
{
    final static int X=10;
    public abstract void meth1();
    public abstract void meth2();
    default void meth3()
    {
        System.out.println("Meth3 of Test");
    }
}

interface Test2 extends Test
{
    void meth4();
}

class My implements Test2
{
    public void meth1(){System.out.println("Meth1");}
    public void meth2(){System.out.println("Meth2");}
    public void meth4(){System.out.println("Meth4");}
}
public class InterfacePractice 
{
    public static void main(String[] args) 
    {
        System.out.println(Test.X);
        My t = new My();
        t.meth3();
        
    }
}                                                                        



