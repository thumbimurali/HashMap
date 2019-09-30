package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class App
{
    public static void main( String[] args )
    {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        hmap.put(20,"arya");
        hmap.put(92,"derpina");
        hmap.put(30,"kean");
        hmap.put(42,"keith");
        hmap.put(63,"maglin");

        Set set=hmap.entrySet();
        Iterator itr=set.iterator();
        System.out.println("Displaying HashMap\n");
        while(itr.hasNext()){
           // System.out.println(itr.next());
            Map.Entry mentry = (Map.Entry)itr.next();
            System.out.print(mentry.getKey()+"\t");
            System.out.println(mentry.getValue());
        }

        /*String var= hmap.get(92);
        System.out.println("Value at index 2 is: "+var);

        hmap.remove(30);
        System.out.println("Map key and values after removal:");
        Set set2 = hmap.entrySet();
        Iterator itr2 = set2.iterator();
        while(itr2.hasNext()) {
            Map.Entry mentry = (Map.Entry)itr2.next();
            System.out.print(mentry.getKey()+"\t");
            System.out.println(mentry.getValue());
        }*/

        System.out.println("\n\n\nfor loop try\n");
        for (Map.Entry mapentry:hmap.entrySet())
        {
            System.out.print(mapentry.getKey()+"\t");
            System.out.println(mapentry.getValue());
        }

        /*boolean x=hmap.containsValue("kean");
        if (x==true){
            System.out.println("\n\nyes");
        }*/
    }
}
