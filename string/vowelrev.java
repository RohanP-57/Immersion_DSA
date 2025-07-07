package DSA.string;
import java.util.*;
public class vowelrev {
    public static String reverseVowels(String s) {
        char[] c = s.toCharArray();
        String v="AEIOUaeiou";
        StringBuilder ans= new StringBuilder();
        int i=0,j=c.length-1;
        while(i<j){
            if(v.contains(Character.toString(c[i]))){
                if(v.contains(Character.toString(c[j]))){
                    char t=c[i];
                    c[i]=c[j];
                    c[j]=t;
                    i++;
                    j--;
                }
                else j--;
            }
            else i++;
        }
        for(char value : c) {
            ans.append(value);
        }
        return ans.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String result=reverseVowels(s);
        System.out.println(s+"\n"+result);
    }
}
