package DSA;
public class arratindex {

    public static void main(String[] args) {
    int[] arr={4,7,16,19,21};
    int target=19;
    int n=arr.length;
    int low=0,high=n-1;
    while(low<=high){
        int mid=(low+high)/2;
        if(arr[mid]==target){
            System.out.print(mid);
            break;
        }
        else if(arr[mid]>target){
            high=mid-1;
        }
        else {
            low=mid+1;
        }
    }
    }
}