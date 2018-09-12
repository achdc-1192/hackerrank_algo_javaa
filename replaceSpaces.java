
public class replaceSpaces {

	public static void main(String[] args) {
		
		char[] str = {'a','b',' ','d', 'e', ' ', 'f'};
		int len = str.length;
		//System.out.println(len);
		int space = 0;
		for (int i=0; i<len; i++){
			if (str[i] == ' '){
				space++;
			}
		}
		
		int newLength = len + space * 2;
		char[] finalarray = new char[newLength+1];
		finalarray[newLength] = '\0';
		for(int i=len-1; i>=0; i--){
			if (str[i] == ' '){
				finalarray[newLength - 1] = '0';
				finalarray[newLength - 2] = '2';
				finalarray[newLength - 3] = '%';
				newLength = newLength - 3;
			}
			else{
				finalarray[newLength - 1] = str[i];
				newLength = newLength - 1;
			}
		}
		System.out.println(finalarray);

	}

}
