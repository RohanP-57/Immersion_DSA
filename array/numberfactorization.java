package DSA;
import java.util.*;
/*public class numberfactorization {
    public static void main(String[] args){
        int num=999999018;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=2;i<Math.sqrt(num);i++){
            while(num%i==0){
                arr.add(i);
                num/=i;
            }
        }
        if (num > 1) {
            arr.add(num);
        }
        System.out.println(arr);
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        int mul=1;
        int mul1=1;
        for (int i = 0; i < arr.size()-1; i++) {
            if(!arr.get(i).equals(arr.get(i+1))){
                mul*=arr.get(i)*arr.get(i+1);
            }
            else {
                mul1 *= arr.get(i);
                i++;
            }
        }
        System.out.println(mul);
        System.out.println(mul1);
        int sum=mul+mul1;
        System.out.println(sum);
    }

}*/

public class numberfactorization {
    static boolean isprime(long i){
        if(i<=1){
            return false;
        }

        for(int j=2;j<Math.sqrt(i);j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList<Long> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        long nums=864;
        for(long i=0;i<Math.sqrt(nums);i++){
            if(isprime(i)){
                int k=0;
                if(nums%i==0){
                    while(nums%i==0){
                        k++;
                        nums/=i;

                    }
                    list.add(i);
                    list1.add(k);
                }
            }
        }
        if(nums>1){
            list.add(nums);
            list1.add(1);
        }
        System.out.println(list);
        System.out.println(list1);
        long sum = 0;
        while (true) {
            int minE = Integer.MAX_VALUE;
            long currentA = 1;
            boolean allZero = true;
            // Find minimum exponent > 0
            for (int e : list1) {
                if (e > 0) {
                    minE = Math.min(minE, e);
                    allZero = false;
                }
            }
            if (allZero) break;
            // Multiply all primes with exponent > 0 and reduce exponents
            for (int i = 0; i < list.size(); i++) {
                if (list1.get(i) > 0) {
                    currentA *= list.get(i);
                    list1.set(i, list1.get(i) - minE);
                }
            }
            sum += currentA * minE;
        }
        System.out.println(sum);
        // System.out.println(mul);
        //     System.out.println(list);

    }
}