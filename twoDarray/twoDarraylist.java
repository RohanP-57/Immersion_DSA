package DSA.twoDarray;

import java.util.ArrayList;
import java.util.Scanner;

public class twoDarraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        System.out.println("Row:");
        int row = sc.nextInt();
        System.out.println("Col:");
        int col = sc.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        System.out.println("Input array:");
        for (int i = 0; i < row; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < col; j++) {
                temp.add(sc.nextInt());
            }
            arr.add(temp);
        }
        System.out.println("Target input:");
        int target = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr.get(i).get(j) == target) {
                    System.out.println("Found at: " + i + " " + j);
                    flag = false;
                    break;
                }
            }
            if (!flag) break;
        }
        if (flag) {
            System.out.println("Not Found");
        }
    }
}