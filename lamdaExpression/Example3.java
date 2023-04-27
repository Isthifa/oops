public interface Example3 {
    void say();
}
class MethodReference {
    public static void saysomething() {
        System.out.println("this is static method");
    }

    public static void main(String[] args) {
        Example3 s=MethodReference::saysomething; //method reference
        s.say();

    }
}
