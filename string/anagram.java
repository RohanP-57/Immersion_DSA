package DSA.string;

import java.util.*;
class anagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] a1=new int[26];
        int[] a2=new int[26];
        for(int i=0;i<s.length();i++){
            a1[s.charAt(i)-'a']++;
            a2[t.charAt(i)-'a']++;
        }
        return Arrays.equals(a1, a2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        if(isAnagram(s,t)) System.out.println("true");
        else System.out.println("false");

    }
}