public class Example2 implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<10;i++)
        {
            System.out.println("child");
        }
    }
}
class ExampleApp{
    public static void main(String[] args) {
        Example2 e2=new Example2();
        //e2.start -if we call start method without thread -cant find the class exception
        Thread t=new Thread(e2);//(e2)-target runnable
        t.start();
        for(int i=1;i<10;i++)
        {
            System.out.println("Main thread");
        }

    }
}
