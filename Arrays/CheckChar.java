
public class CheckChar {

	public static void main(String[] args) {
		char[] charArray = {'a', 'b', 'c', 'k'};
		
		// check whether first and last characters are same
		if(charArray[0] == charArray[charArray.length-1]){
			System.out.println("same");
			return;
		}
		System.out.println("different");
			
	}

}
