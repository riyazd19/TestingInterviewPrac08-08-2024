package collectionPackage;

import java.util.HashMap;

public class KeyValueHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> empIds= new HashMap<>();
        empIds.put("john", 1);
        empIds.put("abrahim", 2);
        empIds.put("tabasum", 3);

        System.out.println(empIds);
        System.out.println(empIds.get("john"));
        System.out.println(empIds.containsKey("john"));
        System.out.println(empIds.containsValue(3));


    }
}
