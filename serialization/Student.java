import java.io.*;

public class Student implements Serializable {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [" +
                "name='" + name + '\'' +
                ']';
    }
}
class StudentApp{
    public static void main(String[] args) throws IOException {
        Student s=new Student("isthifa");
        FileOutputStream fs=new FileOutputStream("student.txt");
        ObjectOutputStream os=new ObjectOutputStream(fs);
        os.writeObject(s);

    }
}
