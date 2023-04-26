package polymorphism;
//method overriding means where child method overriding parent method using extends keyword //
//must be same name and same parameters
/*--in overriding method name must be same
--in overiding method names and argument names must be matched- method signature must be same
-- return type must be same - till 1.4 version] -- coverient return type -- child class of object class allowed
--final to non final not allowed non final to final allowed- abstract to non abstract allowed */

class methodOverRr
{ 
    //overriden
    public void m1()
    {
        System.out.println("hello");
    }
}
class method extends methodOverRr
{
    //overriding
    public void m1()
    {
        System.out.println("world");
    }
}
class mainapp
{
    public static void main(String[] args) {
        methodOverRr m=new methodOverRr();
        method m1=new method();
        m.m1();
        m1.m1();
    }
}