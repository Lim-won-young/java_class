package crypto;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class jsonFileToMap {
	
	
	public static void jsonFileToMap(Map<String, Object> map) throws IOException {
		FileReader fr = new FileReader("D:\\java_io\\data.jasn");
		StringBuilder sb = new StringBuilder();

		int ch;
		
		while ((ch = fr.read()) != -1) {
			sb.append((char)ch);
		}
		System.out.println(sb);
		fr.close();
		
		String jsonObj = new String(sb);
		
		
		Pattern entry_pattern = Pattern.compile(".+:.+\n");
		
		Matcher matcher = entry_pattern.matcher(jsonObj);
		
		while (matcher.find()) {
			
			String entry = matcher.group().trim();	
			if (entry.charAt(entry.length() -1) == ',') {
				entry = entry.substring(0,entry.length()-1);
			}
			
			System.out.println("Entry: " + entry);
			
			String[] split_entry = entry.split(":");
			
			String key = split_entry[0].trim().replaceAll("[\"\']", "");
			String value = split_entry[1].trim();
			
			if (value.equals("null")) {
			}
			else if (Pattern.matches("[\"\'].+[\"\']", value)) {
				
			}
			else if (Pattern.matches("\\d+", value)) {
			}
			
			else if (Pattern.matches("\\d+[.]\\d+", value)) {
			}
			else if (Pattern.matches("\\[.+\\]",value)) {
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
