import java.util.Scanner;

public class PrimeNumber {

	static boolean isPrime(int num) {

		if (num <= 1)
			return false;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner( System.in);
		System.out.println("enter no:");
		boolean result = isPrime(sc.nextInt());
		if(result)
			System.out.println("prime");
		else 
			System.out.println("not prime");
		sc.close();
	}
}
