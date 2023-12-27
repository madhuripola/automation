import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {
		String str = "Shareef123$SDET456@kosmik";
		Pattern digits = Pattern.compile("[^a-z A-Z 0-9]+");
		Matcher alldigits = digits.matcher(str);
		while (alldigits.find()) {
			System.out.println(alldigits.group());
		}

	}
}