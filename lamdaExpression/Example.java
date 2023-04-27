@FunctionalInterface // can have only one method
interface Example {
    public void m1();
}
class test
{
    int x=10;
    public void m2()
    {
        int y=20;
        Example i=()->{
            System.out.println(x);
            System.out.println(y);
        };
        i.m1();
    }
}
class testApp{
    public static void main(String[] args) {
        test t=new test();
        t.m2();

        }
    }
