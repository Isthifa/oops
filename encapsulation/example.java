package encapsulation;
//encapsulation is process of wrapping of data into single unit// 
//data hiding + abstraction//
//by declare data members private we can achive data hiding//
public class example {
    //data hiding
    private int balance;
    private int add;
    private int enquiry;
    public example()
    {
    }
    public example(int balance, int add,int enquiry)
    {
        this.balance=balance;
        this.add=add;
        this.enquiry=enquiry;
    }
    //getter and setters
    public void setbalance(int balance)
    {
        this.balance=balance;
    }
    public int getBalanace()
    {
        return balance;
    }
    public void setadd(int add)
    {
        this.add=add;
    }
    public int getadd()
    {
        return add;
    }
    public int getenquiry()
    {
        return add+balance;
    }

}
class enmain{
    public static void main(String[] args) {
        example ex=new example();
        ex.setadd(100);
        ex.setbalance(1000);
        System.out.println("balance "+ex.getBalanace());
        System.out.println("add balance "+ex.getadd());
        System.out.println("balance enquiry "+ex.getenquiry());
    }
}
