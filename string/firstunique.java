package DSA.string;
import java.util.*;
public class firstunique {
    public static int firstUniqChar(String s) {
        int n = s.length();
        int[] arr = new int[26];
        for (int i = 0; i < n; i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println("First Unique Character at:"+firstUniqChar(s));
    }
}
