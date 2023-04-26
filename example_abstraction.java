abstract class example_abstraction
{
    
    abstract int add();
    abstract int multi();
    abstract int div();
    abstract int sub();
}
class operation extends example_abstraction{
    int a=10,b=20;

    int add()
    {
        return a+b;
    }
    int multi()
    {
        return a*b;
    }
    int div()
    {
        return a/b;
    }
    int sub()
    {
        return a-b;
    } 
}
class opmain{
    public static void main(String[] args) {
        operation op=new operation();
        System.out.println(op.multi());
        System.out.println(op.add());
    }
}