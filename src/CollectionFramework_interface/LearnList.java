package CollectionFramework_interface;
import java.util.*;
public class LearnList {
    public static void main(String[] args){
        int[] a = new int[5];
        List <Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(50);
        list2.add(50);
        list2.add(60);
        list2.add(70);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(20));
//        System.out.println(list.remove(Integer.valueOf(10)));
        list2.addAll(list);
        System.out.println(list2);
        list.retainAll(list2);
        System.out.println(list);
//        list.clear();
//        System.out.println(list);
        Object[] arr = list.toArray();
        for(Object e:a){
            Integer temp = (Integer)e;
            System.out.println(temp);
        }
    }
}
