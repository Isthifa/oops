import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(0);
        al.add(10);
        al.add(20);
        al.add(5);
        al.add(15);
        System.out.println(al);
        List<Integer> l=al.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println(l);
        //-----------------------------------------------//
        LocalDate date=LocalDate.now();
        System.out.println(date);
        //-----------------------------------------------//
        LocalTime time=LocalTime.now();
        System.out.println(time);

        int day=date.getDayOfMonth();
        int month=date.getMonthValue();
        int year=date.getYear();
        System.out.println(day+" "+month+" "+year);

        int seconds=time.getSecond();
        int minutes=time.getMinute();
        int hours=time.getHour();
        System.out.println(hours+":"+minutes+":"+seconds);

        //-------------------------------------------------------------------------//
        //lambda expression//
        List<Integer> a= Arrays.asList(10,20,30,40,50,60,70,80);
        a.forEach(e-> System.out.println(e));
    }
}
