import java.util.Scanner;

public class EfficientTraveler {
    public static int farthestCity(int[] arr, int initial) {
        for (int i = 0; i < arr.length; i++) {
            initial -= arr[i];
            if (initial < 0) {
                return i; // Can't reach city i+1
            }
        }
        return arr.length - 1; // Successfully reached the last city

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of cities:");
        int n = sc.nextInt();
        System.out.println("Enter energy of cities");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Intial Energy :");
        int initial = sc.nextInt();
        int result = farthestCity(arr, initial);
        System.out.println("farthest city  index reachable:" + result);
    }
}