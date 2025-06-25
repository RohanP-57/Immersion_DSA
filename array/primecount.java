package DSA;
import java.util.*;
public class primecount {
    public static boolean is_prime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Start Range:");
        int start=sc.nextInt();
        System.out.print("Enter End Range:");
        int end=sc.nextInt();
        int count=0;
        System.out.print("Prime Numbers are: ");
        for(int i=start;i<end;i++){
            if(is_prime(i)){
                System.out.print(i+" ");
                count++;
            }
        
        }
        System.out.println();
        System.out.println("Total Numbers of Prime Numbers are: "+count);
    }
}
