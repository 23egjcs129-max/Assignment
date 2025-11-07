import java.util.*;
public class OddOneInput {
    public static int findSingle(int a[]) {
        int nums= 0;
        for (int i = 0; i < a.length; i++)
            nums ^= a[i];
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.println("Odd one out is: " + findSingle(a));
    }
}