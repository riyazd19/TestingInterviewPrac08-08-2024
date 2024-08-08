package collectionPackage.setAndHashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
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

        //now if i have a arraylist which is having duplicates and i need to 
        // remove the duplicats 

        List<Integer> list= new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(12);
        list.add(13);
        list.add(14);
        //up above you can see there are duplicate elements 
        // now we can simply put them in hashset so the duplicates will be removed

        for(Integer inlist:list){
            System.out.println("--------");
            System.out.println(inlist);
        }
        
       }
    }
}
