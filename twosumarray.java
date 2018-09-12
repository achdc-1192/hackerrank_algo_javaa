
public class twosumarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,40};
		int sum = 30;
		boolean[] binmap = new boolean[100];
		 
        for (int i=0; i<arr.length; ++i)
        {
            int temp = sum-arr[i];
 
            // checking for condition
            if (temp>0 && binmap[temp])
            {
                System.out.println("Pair with given sum " +
                                    sum + " is (" + arr[i] +
                                    ", "+temp+")");
            }
            binmap[arr[i]] = true;
	}

}
}
