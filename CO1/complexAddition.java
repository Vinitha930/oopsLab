public class complexAddition
 {
int r;
int i;
    complexAddition(int real,int img)
        {
    r=real;
    i=img;
        }
    void display()
     {
    System.out.println(r+"+"+i+"i");
     }
    static void add(int r1,int i1,int r2,int i2 )
       {
        r1=r1+r2;
        i1=i1+i2;
        System.out.println("After Addition = "+r1+"+"+i1+"i");
       }
    public static void main(String[] args) 
     {
        
        complexAddition first=new complexAddition(5,4);
        complexAddition second=new complexAddition(7,9);
        System.out.println("Complex Numbers are:");
        first.display();
        second.display();
        add(first.r,first.i,second.r,second.i);
     }
 }