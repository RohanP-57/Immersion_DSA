package DSA;

public class Pairs {
public static void main(String[] args) {
    int[] arr = {10, 6, 15, 7};
    int s= arr.length;

    System.out.println("All unique pairs are:");
    for (int i = 0; i < s; i++) {
        for (int j = i + 1; j < s; j++) {
            System.out.println("(" + arr[i] + ", " + arr[j] + ")" );
        }
    }
}
}
