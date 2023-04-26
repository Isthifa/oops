package stringhandling;

public class example {
    public static void main(String[] args) {
        //new object s1 will be created and stored and new copy created in scp area
        String s1=new String("isthifa");
        //new ob s2 created and pointing to scp of s1
        String s2=new String("isthifa");
        String s3="isthifa";
        String s4="isthifa";
        System.out.println(s3.equals(s4));
        System.out.println(s1.equals(s2));
        String s5=new String("hello");
        System.out.println( s5.concat("world"));

    }
}
