
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "anurag";
		String reverse = "";
		int l = s.length();
		for(int i=l-1;i>=0;i--){
			reverse += s.charAt(i);
		}
		System.out.println(reverse);
	}

}
