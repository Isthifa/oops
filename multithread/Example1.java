//output is produced by main thread-- because 1 thread are there//
public class Example1 extends Thread {
    public  void run()
    {
        for(int i=1;i<10;i++)
        {
            System.out.println("child thread");
        }
    }
}
class Examplemain{
    public static void main(String[] args) {
        Example1 e=new Example1();
        e.run();//the output is child thread will be executed first -will execute as normal method
        //e.start(); //start method -new thread will be created and responsible for executing the program
        for(int i=1;i<10;i++)
        {
            System.out.println("main thread");
        }
    }
}
