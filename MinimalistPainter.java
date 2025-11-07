public class MinimalistPainter {
        static int minTime(int t[]) {
            int sum=0, max=t[0];
            for(int i=0;i<t.length;i++) {
                sum+=t[i];
                if(t[i]>max) max=t[i];
            }
            return sum-max;
        }

        public static void main(String args[]) {
            int t[]={4,2,3,7};
            System.out.println(minTime(t));
        }
    }

