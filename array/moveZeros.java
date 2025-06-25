package DSA;

public class moveZeros {
    public static int[] zeros(int[] nums){
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        int r=j;
        System.out.println(j);
        while(j<nums.length){
            nums[j]=0;
            j++;
        }
        System.out.println(j-r);
        return nums;
    }
    public static void main(String[] args){
        int[] nums={0,1,0,3,12};
        int[] arr=zeros(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
