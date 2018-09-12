
public class Playlist {

	public static void main(String[] args) {
		String[] st = {"a", "b", "c", "d", "e"};
		int k = 0;
		String q = "e";
		int val1=0, val2=0;
		
		for (int i=0; i<st.length; i++){
			if (st[i].equals(q)){
				val1 = i-k;
				System.out.println("val1 is "+val1);
				break;
			}
		}
		for(int i=st.length-1; i>=0; i--){
			if (st[i].equals(q)){
				val2 = Math.abs(i-k - st.length);
				System.out.println("val2 is "+ val2);
				break;
			}
		}
		if (val1<val2){
			System.out.println("result val1 is " + val1);
		}
		else{
			System.out.println("result val2 is "+ val2);
		}
	}

}
