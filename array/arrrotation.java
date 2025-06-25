package DSA;
import java.util.*;
class arrrotation {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        for(int i=0;i<=k;i++){
            int temp=nums[n-1];
            for(int j=n-2;n>=0;j--){
                nums[i+1]=nums[i];
            }
            nums[0]=temp;
        }
    }
    public static void main(String[] args) {
        arrrotation obj = new arrrotation();
        int[] nums = {5, 6, 4,3,2};
        int k = 3;
        obj.rotate(nums, k);
        System.out.println("Rotated array: " + Arrays.toString(nums));
    }
}

