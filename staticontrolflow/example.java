package staticontrolflow;
/*1-identification of static members top to bottom
2-execution of static variable assignments and static blocks from top to bottom
3- execution of main method*/

public class example {
    static int i=10;
    static
    {
        m1();
        System.out.println("first base class");
    } 
    public static void main(String args[])
    {
        m1();
        System.out.println("main method");
    }
    public static void m1()
    {
        System.out.println(j);
    }
    static 
    {
        System.out.println("second static block");
    }
    static int j=20;
}
