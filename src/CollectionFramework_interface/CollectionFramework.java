package CollectionFramework_interface;
import java.util.*;
public class CollectionFramework {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String s = in.next();
//    Stack<Character> stack = new Stack<>();
//    for(int i=0;i<s.length();i++){
//        stack.push(s.charAt(i));
//    }
//    String temp = "";
//    for(int i =0 ; i<s.length();i++) temp += stack.pop();
//
//    if(s.equals(temp)){
//        System.out.println("String is Palindrome");
//    }else{
//        System.out.println("No it's not");
//    }
    boolean isPalindrome = true;
    int left = 0;
    int right = s.length()-1;
    while(left<right){
        if(s.charAt(left)!= s.charAt(right)){
            isPalindrome = false;
            break;
        }
        left++;
        right--;
    }
    if(isPalindrome){
        System.out.println("Yes it is");
    }else System.out.println("No it is not");
    in.close();
    }

}
