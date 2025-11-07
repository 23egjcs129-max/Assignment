import java.util.Scanner;

public class prefixEqualToSuffix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of Elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
    printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
           // System.out.print(arr[i] + " ");
            int prefix=0;
            int suffix=0;
            for(int j=0;j<i;j++){
                    prefix += arr[j];
            }
             for(int j=i+1;j<arr.length;j++){
                 suffix += arr[j];
             }
             if(prefix==suffix){
                 System.out.println("Prefix and Suffix are the same at value" + i);
                 return;
             }
        }
             System.out.println("there is no equal prefix and suffix");}
    }

