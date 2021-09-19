
public class RevStringUsingRecursion {

	public String reverse(String str) {

		if (str.isEmpty()) {
			return str;
		} else {
			return reverse(str.substring(1)) + str.charAt(0);
		
		}
                    
	}

	public static void main(String[] args) {

		String input = "I LOVE INDIA";
		System.out.println(input);
		RevStringUsingRecursion rec = new RevStringUsingRecursion();
		System.out.println( rec.reverse(input) );
	

	}

}
