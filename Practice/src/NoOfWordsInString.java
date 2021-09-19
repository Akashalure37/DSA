import java.util.Arrays;

public class NoOfWordsInString {

	public static int NoOfWords(String str) {

		if (str == null || str.isEmpty())
			return 0;

		String[] words = str.split(" ");
		return words.length;
	}

	public static String[] Words(String str) {

		if (str == null || str.isEmpty())
			return null;

		String[] words = str.split(" ");
		return words;
	}

	public static void main(String[] args) {

		String str = "my name is akash";

		// No of Words
		System.out.println(NoOfWords(str));

		// words
		System.out.println(Arrays.toString(Words(str)));

	}
}
