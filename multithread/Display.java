public class Display {
    public void wish(String name) {
        for (int i = 1; i < 10; i++) {
            System.out.print("Good morning:");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name);
        }
    }
}
class MyThread extends Thread
{
    Display d;
    String name;
    public MyThread(Display d,String name)
    {
        this.name=name;
        this.d=d;
    }
    public void run()
    {
        d.wish(name);
    }
}
class SynchrozedDemo{
    public static void main(String[] args) {
        Display d1=new Display();
        MyThread m1=new MyThread(d1,"Isthifa");
        m1.start();
    }
}
