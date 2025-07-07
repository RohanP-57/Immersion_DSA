package DSA.string;
import java.util.Scanner;
public class notvowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = s.substring(i, j);
                boolean hasVowel = false;
                for (int k = 0; k < sub.length(); k++) {
                    char ch = sub.charAt(k);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        hasVowel = true;
                        break;
                    }
                }
                if (!hasVowel) {
                    System.out.println(sub);
                }
            }
        }
    }
}
