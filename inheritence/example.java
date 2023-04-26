package inheritence;
//aquaring properties and behaviors of parent class//
//reusability -advantage//
//we can reuse parent method in child class multiple times instead of rewriting again and again//

//parent references can be used to hold child object// 
//by using that method we cant call child specfic method//
//but we can call methods present in parent class//
//parent referenece can used to hold child object but child refernece cant be used to hold parent object//

public class example{
    public void m1()
    {
        System.out.println("parent");
    }
}
class example1 extends example
{
    public void m2()
    {
        System.out.println("child");
    }
}
class mainApp
{
    public static void main(String[] args) {
       example1 e=new example1();
       e.m1();
       e.m2();
    }
}








/*public class example {
    private int price;
    private String name;
    public example(String name, int price)
    {
        this.name=name;
        this.price=price;

    }
    public void setname(String name)
    {
        this.name=name;
    }
    public String getname()
    {
        return name;
    }
    public int getmodel()
    {
        return price;
    }
    public void setmodel(int price)
    {
        this.price=price;
    }
    public void details()
    {
        System.out.println("cars ");
    }
    public String toString()
    {
        return name+" car name "+price+" price";
    }
}
class car1 extends example{
    private String car;
    public car1(String name,int price, String car)
    {
        super(name,price);
    }
    public void driving()
    {
        System.out.println("driving a car");
    }
}
class mainapp{
    public static void main(String[] args) {
        example ex=new example("BMW",2000);
        System.out.println(ex);
        car1 c1=new car1("audi",1000 , "speed");
        System.out.println(c1);
        c1.details();
        c1.driving();
    }
}*/
