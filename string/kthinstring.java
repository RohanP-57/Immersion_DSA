package DSA.string;

import java.util.*;

public class kthinstring {
    public static char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");
        while (sb.length() < k) {
            int size = sb.length();
            for (int i = 0; i < size; i++) {
                sb.append((char) ('a' + ((sb.charAt(i) - 'a') + 1) % 26));
            }
        }
        return sb.charAt(k - 1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        System.out.println(kthCharacter(k));
    }
}
