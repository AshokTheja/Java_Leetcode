package Easy;

public class DetectCapitals {

	public boolean detectCapitalUse(String word) {

		String case1 = word.toUpperCase();

		String case2 = word.toLowerCase();

		String case3 = (case2.charAt(0) + "").toUpperCase() + case2.substring(1);

		if (case1.equals(word))
			return true;
		else if (case2.equals(word))
			return true;
		else if (case3.equals(word))
			return true;
		else
			return false;

	}

	public static void main(String[] args) {

		DetectCapitals dc = new DetectCapitals();
		System.out.println(dc.detectCapitalUse("FlaG"));
	}

}
