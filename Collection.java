import java.util.*;

public class Collection {
    public static void main(String[] args) {
        ArrayList al=new ArrayList(); //any type of data we can store here
        al.add(1);
        al.add("A");
        al.add(4);
        al.add(5);
        al.add("E");
        System.out.println(al);
        //add(index,object);
        al.add(1,"B");
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.contains(1));
        System.out.println(al.remove(2));
        System.out.println(al);
        System.out.println(al.get(1));
        System.out.println(al.set(0,3));
        System.out.println(al);
        System.out.println(al.isEmpty());
        //reading using for loop;
        System.out.println("for loop");
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i)+" ");
        }
        //reading using iterator
        System.out.println("using iterator");
        Iterator it=al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        //for each loop
        System.out.println("for each loop");
        for(Object e:al)
        {
            System.out.println(e);
        }
        ArrayList a=new ArrayList();
        a.addAll(al);
        System.out.println(a);
        System.out.println("after removing "+a.removeAll(al));

        //Collections.sort();
        //error because of different datatype stored
        System.out.println();

        //linked list
        LinkedList ll=new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.addLast(5);
        ll.addFirst(1);
        System.out.println(ll);
        ll.remove();
        System.out.println(ll);
        System.out.println(ll.contains(2));

        //hashset
        HashSet hs=new HashSet();
        hs.add(100);
        hs.add("B");
        hs.add(2);
        hs.add(3);
        hs.add("E");
        hs.add("Welcome");
        System.out.println(hs);

        hs.remove("B");
        System.out.println("After removing "+hs);

        LinkedHashSet lhs=new LinkedHashSet();
        /*
        lhs.add()
        lhs.contains
        lhs.remove
        lhs.addAll
         */
        System.out.println("HashMAP");
        HashMap<Integer,String> map=new HashMap();
        map.put(100,"test1");
        map.put(101,"test2");
        map.put(102,"test3");
        map.put(103,"test3");
        map.put(101,"t");
        System.out.println(map);
        System.out.println(map.containsKey(101));
        System.out.println(map.containsValue("test1"));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        for(Map.Entry entry: map.entrySet())
        {
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }

        //treeMap
        TreeMap<Character,Integer> t=new TreeMap<>();
        String n="isthifa";
        for(int i=0;i<n.length();i++)
        {
            if(t.containsKey(n.charAt(i))) {
                t.put(n.charAt(i), 1+1);
            }
            else
            {
                t.put(n.charAt(i),1);
            }
        }
        System.out.println(t);
    }
}
