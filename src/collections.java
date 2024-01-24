import com.sun.source.tree.Tree;

import java.util.*;

class ALdemo{
}
public class collections {
    public static void main(String[] args) {
        /*
        ArrayList al= new ArrayList();// can contain any data type , unsynchronized
//        ArrayList<Integer> ai= new ArrayList<Integer>(); // if we want only one type
//        Vector al = new Vector(); // legacy class , synchronized
//        Stack al =new Stack<>();
//        HashSet al = new HashSet(); // no duplicates + random order
//        LinkedHashSet al =new LinkedHashSet<>(); // no duplicates + user order
//        TreeSet al= new TreeSet<>(); // no duplicates + sorted
        al.add(100);
        al.add(100);
        al.add(200);
        al.add("Hey");
        al.add('A');
        al.add(new Date());
        al.add(new ALdemo());
        al.add(new Thread());
        Collections.sort(al);
        Collections.reverse(al);
        System.out.println(al.contains(100)); // if it contains
        System.out.println(al);
        Iterator i= al.iterator(); // instead of for loop we can also use this
        // enumeration->legacy class
        // list iterator -> works with lists only
        // iterator -> universal
        while(i.hasNext()){
            Object a = i.next();
            if(a instanceof String) // if i only want Strings to print
                System.out.println(a);
            System.out.println(a);
        }
        */
        // Maps
//        Hashtable map = new Hashtable(); // legacy class, // doesn't allow key or values to be null
//        HashMap map = new HashMap(); // no duplicate + random order // only one null key and multiple null values
//        LinkedHashMap map = new LinkedHashMap(); // no duplicates + user's order
        TreeMap map = new TreeMap();
        map.put(1, "rajat");
        map.put(2,"Kumar");
        Set s= map.entrySet();
        Set<Map.Entry> entrySet = map.entrySet();

        Iterator<Map.Entry> i = s.iterator();
        while(i.hasNext()){
            Map.Entry<Integer, String> ii = i.next();
            System.out.println(ii.getKey());
//            System.out.println(i.next());
        }
    }


}
