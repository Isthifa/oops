package polymorphism;
//polymorphism ability do in multiple ways or Polymorphism in Java is a concept by which we can perform a single action in different ways.//

//same method name and diffrent parameters arguments//
public class methodOver {
    void add(int a,int b)
    {
        int sum=a+b;
        System.out.println(sum);
    }
    void add(int a,float b)
    {
        double add=a+b;
        System.out.println(add);
        
    }
    
}
class mainapp{
    public static void main(String[] args) {
        methodOver m=new methodOver();
        m.add(1,3.0f);
        m.add(1, 2);

    }
}
