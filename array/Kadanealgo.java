package DSA;
import java.util.*;
class Kadanealgo {
    public static void main(String[] Args){
        int[] arr={2,3,-8,7,-1,2,3};
        int sum=0;
        int maxsun=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            maxsun = Math.max(sum,maxsun);
            if(sum<0){
                sum=0;
            }
        }
        System.out.print(maxsun);
    }
}