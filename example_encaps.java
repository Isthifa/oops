class example_encaps{
    private double balance;
    public void setbalance(double balance)
    {
        this.balance=balance;

    }
    public double getBalance()
    {
        return balance;
    }
}
class encapsmain{
    public static void main(String[] args) {
        example_encaps es=new example_encaps();
        es.setbalance(100.0);
        System.out.println(es.getBalance());
    }
}