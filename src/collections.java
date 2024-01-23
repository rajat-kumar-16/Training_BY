import java.util.*;
class ALdemo{
}
public class collections {
    public static void main(String[] args) {
        ArrayList al= new ArrayList();// can contain any data type
//        ArrayList<Integer> ai= new ArrayList<Integer>(); // if we want only one type
        al.add(100);
        al.add(200);
        al.add("Hey");
        al.add('A');
        al.add(new Date());
        al.add(new ALdemo());
        al.add(new Thread());
        System.out.println(al.contains(100)); // if it contains
        System.out.println(al.get(5)); // instead of al[];
        System.out.println(al);
        Iterator i= al.iterator(); // instead of for loop we can also use this
        while(i.hasNext()){
            Object a = i.next();
            if(a instanceof String) // if i only want Strings to print
                System.out.println(a);
            System.out.println(a);
        }
    }
}
