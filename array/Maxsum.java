package DSA;
import java.util.*;
class maxsum {
    public int maxSubArray(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                maxsum=Math.max(maxsum,sum);
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        maxsum obj = new maxsum();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum Subarray Sum: " + obj.maxSubArray(nums));
    }
}