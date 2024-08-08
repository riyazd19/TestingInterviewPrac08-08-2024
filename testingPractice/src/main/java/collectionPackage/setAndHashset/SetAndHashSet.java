package collectionPackage.setAndHashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetAndHashSet {
    public static void main(String[] args) {
        Set<Integer> set= new HashSet<>();
        set.add(1);
        set.add(12);
        set.add(13);
        set.add(14);

        for(Integer inte:set){
            System.out.println(inte);
        }

        set.forEach(System.out::println);
        System.out.println("--");
       Iterator<Integer> hasInteger= set.iterator();
       while(hasInteger.hasNext()){
        System.out.println(hasInteger.next());
       }
    }
}
