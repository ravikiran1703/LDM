package javaQwe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text;
		String pattern;
		
		//For Pan card
		text="BPBPD!#@$Nq";
		pattern="[A-Z]{5}[\\d]{4}[A-Z][a-z]";
				
		
		//Results 
		Pattern p =Pattern.compile(pattern);
		Matcher m=p.matcher(text);
		System.out.println(m.matches());
	}

}
