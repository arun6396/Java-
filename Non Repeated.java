package Hash;

public class NonRepeat {
	public static char FirstNonRepeat(String str) {

		if(str == null || str.isEmpty()) {
			return '0';
		}
		int n = str.length();
		for(int j = 0 ; j < n ; j++){
			char current = str.charAt(j);
			boolean sameLetter = false;
			for(int k = 0 ; k < n ; k++) {
				if(j!=k && current == str.charAt(k)) {
					sameLetter = true;
					break;
				}
			}
			if(!sameLetter) {
				return current;
			}
		}
		return '0';

	}
	public static void main(String[] args) {
		String input = "swiss";
		char endResult = FirstNonRepeat(input);
		if(endResult != '0') {
			System.out.println("First Non Repeated Chearacter : " + endResult);
		}
		else {
			System.out.println("Not Found");
		}
	}
}
