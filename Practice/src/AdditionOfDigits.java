
public class AdditionOfDigits {

	public static void main(String[] args) {

		int digit = 1234;
		int sum = 0;
		while(digit!=0) {
		sum = sum + digit % 10;
		digit = digit / 10;
		}
		System.out.println("sum="+sum);
	}

}
