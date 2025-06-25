package DSA;
public class revrange {
    public void reverse(int[] arr, int i, int j) {
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        printarray(arr);
    }
    public void printarray(int[] arr)
    {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    } 
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int n=arr.length;
        int i=0,j=3;
        revrange obj = new revrange();
        obj.printarray(arr);
        obj.reverse(arr, i, n-j-1);
        obj.reverse(arr, n-j,n-1);
        obj.reverse(arr, i,n-1);
    }
}