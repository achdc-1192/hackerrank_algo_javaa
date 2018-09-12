import java.util.*;

public class sherlockandarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        for(int i=0;i<t;i++){
            int n = input.nextInt();
            int count=0;
            long total = 0;
            int[] arr = new int[n];
            for(int j=0;j<n;j++){
                arr[j] = input.nextInt();
                total += arr[j];
            }
            long left = 0;
            //long right = 0;
            //if (n==1){count+=1;}
            for(int temp=0;temp<arr.length;temp++){
                
                long right = total - arr[temp] - left;
                if(left==right){
                    count+=1;
                }
                left += arr[temp];
                
            }if (count>0){
                    System.out.println("YES");
                    
                }else{System.out.println("NO");}
        }
    }
}