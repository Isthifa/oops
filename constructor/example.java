package constructor;
//constructor is special type of method initialized when object is created or instance of object is created//
//which should same name as class name//
//which doesnt have any return type//
public class example {
    String name;
    int age;
    public example(String name, int age)
    {
        this.name=name;
        this.age=age;

    }
    
    
}
class exampleApp{
    public static void main(String[] args) {
        example e=new example("isthifa",24);
        System.out.println(e.name+" "+e.age);
    }
}
