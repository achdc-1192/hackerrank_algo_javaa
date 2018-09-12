import java.util.*;

public class kaprekar {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        long p = sc.nextLong();
        long q = sc.nextLong();
        ArrayList<Long> kaprekars = new ArrayList<>();
        long i = 0;
        
        for (i=p;i<=q;i++){
            long square = i*i;
            String x = Long.toString(square);
            //System.out.println(x);
            int len = x.length();
            
            if (len >1){
                long firstnum = Long.parseLong(x.substring(0,len/2));
                long secondnum = Long.parseLong(x.substring(len/2));
                if(firstnum + secondnum == i){
                    //System.out.print(i + " ");
                    kaprekars.add(i);
                }
            }else{
                    if(i*i==i){
                        //System.out.print(i + " ");
                        kaprekars.add(i);
                        //kaprekars[i]++
                    }
                }
        }
       if(kaprekars.isEmpty()){
            System.out.print("INVALID RANGE");
        }
        else{
            for(long k : kaprekars){
                System.out.print(k+" ");
            } 
      }
    }
}