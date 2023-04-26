package keywords;
//super keywords
public class example {
    String s="hello";
    public void m1()
    {
        System.out.println("java");
    }
}
class example1 extends example
{
    String s="isthifa";
    example1()
    {
        super();
    }
    public void m1()
    {
    System.out.println(this.s);//this keyword
    System.out.println(super.s);//super keyword
    }
}
class main{
    public static void main(String[] args) {
        example1 e=new example1();
        e.m1();
        
    }
}
