package Hashing;
import java.util.*;
public class FrequencyOfLimitedRangeArrayElementsGFG {
    public static void frequencyCount(int[] arr, int N, int P){
//        HashMap<Integer,Integer> map = new HashMap<>();
        int[] hash = new int[N+1];
        for(int i =0 ;i<arr.length;i++){
            if(arr[i]<=N){

            hash[arr[i]-1]++;
            }
        }
        System.out.println(Arrays.toString(hash));

    }
    public static void main(String[] args){
        int[] arr ={2,3,2,3,5};
        frequencyCount(arr,5,5);
    }
}
