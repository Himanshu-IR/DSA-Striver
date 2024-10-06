package CollectionFramework_interface;
import java.util.*;
public class LearnMaps {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        map.put("us","United States");
        map.put("in","India");
        map.put("en","England");
//        System.out.println(map);
//        System.out.println(map.getOrDefault("in","Value not Present"));
//        System.out.println(map.containsKey("pk"));
        Set<String> keys = map.keySet();
        System.out.println(map.entrySet());
        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
