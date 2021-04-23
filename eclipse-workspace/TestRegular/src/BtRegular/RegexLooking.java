package BtRegular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLooking {
	public static void main(String[] args) {
		String country1 = "Iran";
		String country2 = "Iraq";
		
		String regex = "^I.[ae]n$";
		
		Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(country1);
		
		System.out.println("lookingAt " + matcher.lookingAt());
		System.out.println("matches : " + matcher.matches());
		System.out.println();
		matcher.reset(country2);
		System.out.println();
		System.out.println("lookingAt " + matcher.lookingAt());
		System.out.println("matches : " + matcher.matches());
		
	}
}
