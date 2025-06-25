package DSA.twoDarray;

import java.util.Scanner;

public class targetin2darray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Row:");
        int row=sc.nextInt();
        System.out.println("Col");
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        System.out.println("input array");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Target input");
        int target=sc.nextInt();
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                if(arr[i][j]==target){
                    System.out.print(i+" "+j);
                }
            }

        }
    }
}
