package Hashing;
import java.util.*;
public class LearnHashing {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements in array");
        for(int i =0;i<n;i++){
            arr[i]=in.nextInt();
        }
//        int[] hash = new int[13];
//        for(int i =0;i<n;i++){
//            hash[arr[i]]+=1;
//        }
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<n;i++){
            mpp.put(arr[i], mpp.getOrDefault(arr[i],0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println("Enter number of test cases");
        int q= in.nextInt();
        while(q>0){
            System.out.println("Enter query");
            int number=in.nextInt();
            System.out.println(mpp.get(number));
            q--;
            System.out.println("Number of test cases left "+q);
        }
    }
}
