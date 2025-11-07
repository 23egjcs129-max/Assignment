import java.util.*;

public class SmartPairFinder {
    static boolean findpair(int a[], int k) {
        for (int i=0;i<a.length; i++) {
            for (int j=i+1; j<a.length; j++) {
                if (a[i]+a[j]==k)
                    return true;
                }
            }
            return  false;
        }
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int a[]={3,5,1,7};
            int k=8;
            System.out.println(findpair(a,k));
        }
    }

