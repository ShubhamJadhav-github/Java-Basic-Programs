// Program to demonstrate the use of Instance, Static and Global variables
import java.util.*;
public class P1Scope
{
    //Instance Variables (varies from object to object)
    int x,y;

    //Static Variables (Same for all objects)
    static int a,b;

    Scanner s = new Scanner(System.in);

    // Default Constructor
    P1Scope()
    {

        System.out.println("Enter Value of Static Variable a = ");
        a = s.nextInt();
        System.out.println("Enter Value of Static Variable b = ");
        b = s.nextInt();

        System.out.println("Enter Value of Instance Variable x = ");
        x = s.nextInt();
        System.out.println("Enter Value of Instance Variable y = ");
        y = s.nextInt();


        // Next 4 lines will predict an error because scope of p and q is local
        // System.out.println("Enter Value of Global Variable p = ");
        // p = s.nextInt();
        // System.out.println("Enter Value of Global Variable q = ");
        // q = s.nextInt();
    }

    // Member FUnction
    void display()
    {        
        System.out.println("Static/ Class Variable a = " +a);
        System.out.println("Static/ Class Variable b = " +b);

        System.out.println("Instance Variable x = " +x);
        System.out.println("Instance Variable y = " +y);

        //Next 2 lines will predice error because scope of p and q is local
        // System.out.println("Global Variable p = " +p);   
        // System.out.println("Global Variable q = " +q);
    }

    // Main FUnction
    public static void main(String args[])
    {
        //Local variables (Cannot be used in member functions because scope is local to a perticular function)
        // int p, q;

        // Creating Objects Dynamically by using new keyword
        P1Scope P1 = new P1Scope();
        P1Scope P2 = new P1Scope();

        // calling member function display() with respect to different objects
        P1.display();
        P2.display();
    }
}
