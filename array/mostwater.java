package DSA;
public class mostwater{
    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,7};
        int max=0,i=0,j=arr.length-1;
        while(i<j){
            int len=Math.min(arr[i],arr[j]);
            int wid=j-i;
            int area=len*wid;
            max=Math.max(max,area);
            if(arr[i]<arr[j]) {i++;}
            else {j--;}
        }
        System.out.println(max);
    }

}