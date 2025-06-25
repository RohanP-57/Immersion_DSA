package DSA;
import java.util.*;

public class arrexceptself {
    public static int[] productExceptSelf(int[] nums) {
        int n=nums.length,pre[]=new int[n],post[]=new int[n],mul=1,arr[]=new int[n];
        for(int i=0;i<n;i++){
            mul*=nums[i];
            pre[i]=mul;
        }
        mul=1;
        for(int i=n-1;i>=0;i--){
            mul*=nums[i];
            post[i]=mul;
        }
        arr[0]=post[0];
        arr[n-1]=pre[n-2];
        for(int i=1;i<n-1;i++){
            arr[i]=pre[i-1]*post[i+1];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums={2,3,4,6,5};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
