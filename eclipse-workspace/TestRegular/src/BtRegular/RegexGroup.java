package BtRegular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexGroup {
	public static void main(String[] args) {
		String TEXT = " int a = 100;float b= 130;float c= 11.2 ; ";
		
		String regex ="(?<declare>\\s*(int|float)\\s+[a-zA-Z0-9_]*\\s*)=(?<value>\\s*\\d+.?\\d+\\s*);";
		
		Pattern pattern = Pattern.compile(regex);	
		Matcher matcher = pattern.matcher(TEXT);
		while(matcher.find()) {
			String group =matcher.group();
			System.out.println(group);
			System.out.println("declare : " +matcher.group("declare"));
			System.out.println("value   : " + matcher.group("value"));
			System.out.println("--------------------------------------");
			
		}
		
		 String TEXT2 = "<a href='http://HOST/file/FILE1'>File 1</a>"
	             + "<a href='http://HOST/file/FILE2'>File 2</a>";
		 
		String regex2 = "(?<fileName>.*?)'>";
	}
}
