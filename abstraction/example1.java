package abstraction;
//abstract class
public abstract class example1 {
    private String name;
    public example1(String name)
    {
        this.name=name;
    }
    String getname()
    {
        return name;
    }
    //abstract method
    abstract void getBalanace(int prize);
}
class details extends example1{
    public details(String name)
    {
        super(name);
    }

    void getBalanace(int prize)
    {
        System.out.println(getname()+" "+prize);
    }
    
}
class demain{
    public static void main(String[] args) {
        details d=new details("Account balance=");
        d.getBalanace(100);
    }
}

//abstraction which hides internal implementation shows the services that offers or show the funcationality//
