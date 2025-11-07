import java.util.Scanner;

public class FlipTheSwitchEasy {

    // Function to count minimum flips
    static int findFlips(int[] a, int n) {
        int count0 = 0, count1 = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0)
                count0++;
            else
                count1++;
        }
        return (count0 < count1) ? count0 : count1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter 0s and 1s:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int flips = findFlips(a, n);
        System.out.println("Output: " + flips);
    }
}