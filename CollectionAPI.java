import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionAPI {
    
    public static void main(String[] args) {
         
        Collection<Integer> col = new ArrayList<>();  //doesn't support index values
        col.add(4);
        col.add(2);
        col.add(10);
        for(Object num : col) System.out.print(num + " ");
        System.out.println();

        List<Integer> l = new ArrayList<>();  //supports index values
        l.add(5);
        l.add(3);
        l.add(2);
        for(int i = 0; i<l.size(); i++) System.out.print(l.get(i) + " ");
        System.out.println();

        Set<Integer> s = new HashSet<>();  //doesn't support index values
        s.add(4);
        s.add(3);
        s.add(8);
        s.add(3);
        s.add(82);
        s.add(32);
        for(int n : s) System.out.print(n + " ");  //prints in random order
        System.out.println();

        Set<Integer> ss = new TreeSet<>();  //doesn't supports index values
        ss.add(4);
        ss.add(3);
        ss.add(8);
        ss.add(32);
        ss.add(87); 
        ss.add(3);
        for(int n : ss) System.out.print(n + " ");  //prints in sorted order
        System.out.println();

        Iterator<Integer> values = s.iterator();  //can be used to iterate over any Collection (not Maps)
        while(values.hasNext()) System.out.print(values.next() + " ");
        System.out.println();

        Map<String, Integer> mp = new HashMap<>(); //Map does extends Iterator therefore we can't use iterator with maps
        mp.put("Jatin", 47);  //instead of indices we have keys (custom indices)
        mp.put("Gurdeep", 38);
        mp.put("Himansh", 41);
        mp.put("Mayank", 60);
        mp.put("Himansh", 44); //values can be updated, keys are unique (can't be repeated)
        System.out.println(mp);  //random order just like a set
        System.out.println(mp.keySet()); //keys are a set
        for(String str : mp.keySet()) System.out.print(str + " : " + mp.get(str) + " ");
        System.out.println();

        Map<String, Integer> mp1 = new Hashtable<>(); //Map does extends Iterator therefore we can't use iterator with maps
        mp1.put("Jatin", 47);  //instead of indices we have keys (custom indices)
        mp1.put("Gurdeep", 38);
        mp1.put("Himansh", 41);
        mp1.put("Mayank", 60);
        mp1.put("Himansh", 44); //values can be updated, keys are unique (can't be repeated)
        System.out.println(mp1);  //random order just like a set
        System.out.println(mp1.keySet()); //keys are a set
        for(String str : mp1.keySet()) System.out.print(str + " : " + mp1.get(str) + " ");
        System.out.println();
    }
}
