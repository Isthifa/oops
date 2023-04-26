class example_inherenct {
    public void test()
    {
        System.out.println("test");
    } 
}
class example extends example_inherenct{
    public void test1()
    {
        System.out.println("test1");
    }
}
class defmain{
    public static void main(String[] args) {
        example ex=new example();
        ex.test();
        ex.test1();
    }
}
