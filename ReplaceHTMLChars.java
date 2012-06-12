
public class ReplaceHTMLChars {
	public static String decodeHtml(String line){
		
		// Simple decode html class. Extend for further use. Only used for ��� not special characters
		// &AAOG  = �
		// &AAOF  = �
		// &AAPI = �
		line = line.replaceAll("&AAOG", "�");
		line = line.replaceAll("&AAOF", "�");
		line = line.replaceAll("&AAPI", "�");
		
		return line;
	}
}
