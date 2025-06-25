package DSA.twoDarray;
import java.util.ArrayList;
import java.util.Scanner;
public class twoDarraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> twoDList = new ArrayList<>();
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter the number of elements in row " + (i + 1) + ": ");
            int cols = scanner.nextInt();
            ArrayList<Integer> row = new ArrayList<>();
            System.out.println("Enter " + cols + " elements for row " + (i + 1) + ":");
            for (int j = 0; j < cols; j++) {
                row.add(scanner.nextInt());
            }
            twoDList.add(row);
        }
        System.out.println("The 2D ArrayList is:");
        for(int i = 0; i < twoDList.size(); i++) {
            ArrayList<Integer> row = twoDList.get(i);
            System.out.println(row);
        }
        scanner.close();
    }
}
