public class StringContainsVowels {

	public static void main(String[] args) {
		System.out.println(stringContainsVowels("java")); 
		System.out.println(stringContainsVowels("welcome"));
	}

	public static boolean stringContainsVowels(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}

}
