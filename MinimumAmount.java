
public class MinimumAmount {

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int mini = a[0];
		int cost = a[0];
		for (int i=1; i<a.length;i++){
			
			if (mini <= a[i]){
				cost += a[i] - mini;
			}
			else{
				
				mini = a[i];
			}
			
		}
		System.out.println(cost);

	}

}
