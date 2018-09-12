import java.util.*;

public class icecreamparlor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0;j<t;j++){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            
            for(int i=0;i<n;i++){
                for(int k=i+1;k<n;k++){
                    if (arr[i]+arr[k] == m){
                        int a = i+1;
                        int b = k+1;
                        System.out.println(a + " " + b);
                    }
                }
            }
            
        }
    }
}