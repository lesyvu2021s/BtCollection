package BtRegular;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexNMDSE {
	public static void main(String[] args) {
//		String[] strTest  = {"" , "1602","1998","NMD98","2021S","number"};
//		for(String result : strTest) {
//			System.out.println("chuỗi " + result + " có chứa các chữ cái : " + result.matches(".*[a-zA-Z]."));
//		}
//		for(String result2 : strTest) {
//			System.out.println("Chuỗi " + result2 + " có chứa các chứ số : " + result2.matches(".*\\d."));
//		}
//			
//			System.out.println("---------------------------------------------------------------------------");
//			System.out.println("kiểm tra user ");
//			Pattern pattern = Pattern.compile("^[a-zA-Z][\\w-]{6,12}$");
//			String text8 = "lesyvu2016s";
//			System.out.println("User " + text8 + " is : " + pattern.matcher(text8).matches());
//			String text9 ="07lsv12" ; 
//			System.out.println("User " + text9 + " is : " + pattern.matcher(text9).matches());
//			String text10 = "lesy vu2016s";
//			System.out.println("User " + text10 + " is : " + pattern.matcher(text10).matches());
			
//			System.out.println("---------------------------------------------------------------------------");
//			System.out.println("kiểm tra password ");
//			Pattern pattern2 = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!]).{8,})");
//			//Pattern pattern3 = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!]).{6,20})");
//			
//			String text11 = "lesyvu2019s";
//			System.out.println("PassWord is : " + pattern2.matcher(text11).matches());
//			String text12 = "Lesyvu2019@#";
//			System.out.println("PassWord " + text12 + " is : " + pattern2.matcher(text12).matches());
//			System.out.println("---------------------------------------------------------------------------");
//			
//			Pattern pattern4 = Pattern.compile("^[ \\s]+|[ \\s]+$");
//			
//			String text13 = "lesyvu2019s";
//		
//			System.out.println("result : " + pattern4.matcher(text13).matches());
//			String regex = ".*s$";
//			Pattern pattern5 = Pattern.compile(regex);
//			System.out.println("kết quả regex : " + pattern5.matcher(text13).matches());
//			
//			System.out.println("---------------------------------------------------------------------------");
//			
//			String str ="Xin	chào a";
//			String[] arr = str.split("\\s+");
//			System.out.println(Arrays.toString(arr));
//			String newArr = str.replaceAll("\\s+", "-");
//			System.out.println(newArr);
//			
//			
			
			System.out.println("---------------------------------------------------------------------------");
//			
//			String text1 = "Hello java regex 23-04-2021, hello world 23/04/2021";
//			Pattern pattern = Pattern.compile("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}");
//			Matcher matcher = pattern.matcher(text1);
//			System.out.println("Ngày tháng trong chuỗi text1  : " + text1);
//			while(matcher.find()) {
//				System.out.println(text1.substring(matcher.start(),matcher.end()));
//			}
//			
//			String text2 = "23-04-2021" ; 
//			String text3 = "23/04/bbbb";
//			System.out.println("chuỗi " + text2 + "có định dạng ngày tháng : " + pattern.matcher(text2).matches());
//			System.out.println("chuỗi " + text3 + " có định dạng ngày tháng năm : " + pattern.matcher(text3).matches());
//			
//			System.out.println("-------------------------------------------------------");
//			// ^[/w][\\w-]+@([\\w]\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$
//			
//			
//			String emailPattern = "^[a-zA-Z][\\w-]+@([\\w]\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
//			String email1 = "test1@gmail.com.vn";
//			String email2 ="123test@gmail.com.vn";
//			String email3 = "test2@gmail.com";
//	        String email4 = "test3-1@gmail.com";
//	        String email5 = "test4@@gmail.com";
//	        String email6 = "test5@domain.com";
//	        String email7 = "test6@gmail";
//	        
//	        System.out.println(email1 + " : " + Pattern.matches(emailPattern, email1));
//	        System.out.println(email2 + " : " + Pattern.matches(emailPattern, email2));
//	        System.out.println(email3 + " : " + Pattern.matches(emailPattern, email3));
//	        System.out.println(email4 + " : " + Pattern.matches(emailPattern, email4));
//	        System.out.println(email5 + " : " + Pattern.matches(emailPattern, email5));
//	        System.out.println(email6 + " : " + Pattern.matches(emailPattern, email6));
//	        System.out.println(email7 + " : " + Pattern.matches(emailPattern, email7));
			System.out.println("-------------------------------------------------------");
			
			String str5 = "this \t is a \t\t\t String  ";
			String regex3 = "\\s+";
			Pattern pattern6 = Pattern.compile(regex3);
			Matcher matcher6 = pattern6.matcher(str5);
			
			int i=0 ;
			while(matcher6.find()) {
				System.out.println("start : " + matcher6.start());
				System.out.println("end   : " + matcher6.end());
				System.out.println("group "+  i + matcher6.group());
				i++;
			}
			
			
		
	}
}
