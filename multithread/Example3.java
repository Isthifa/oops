public class Example3 extends Thread {
}
class test{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(7);
        Thread t=new Thread();
        System.out.println(t.getPriority());

    }
}
