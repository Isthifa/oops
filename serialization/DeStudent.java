import com.sun.jdi.ObjectReference;

import java.io.*;

public class DeStudent {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream("student.txt");
        ObjectInputStream obs=new ObjectInputStream(fis);
        Student s=(Student) obs.readObject();
        System.out.println(s);
    }
}
