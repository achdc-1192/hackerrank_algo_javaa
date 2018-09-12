import java.util.HashSet;
import java.util.Scanner;
public class vebeeneverywhereman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		for(int i=0;i<testcases;i++){
			int cities = sc.nextInt();
			HashSet<String> city = new HashSet<String>();
			for(int i1=0;i1<cities;i1++){
				String input = sc.next();
				city.add(input);
			}
			System.out.println(city.size());
		}

	}

}
