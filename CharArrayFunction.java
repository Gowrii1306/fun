package day3_strings;

public class CharArrayFunction {

	public static void main(String[] args) {

		//String city = "Chennai";
		//char[] let = city.toCharArray();
		//System.out.println(let[1] + " " + let[2] + " " + let[3] + " " + let[7]);

		String x = "a group of words containing a subject and a verb, that expresses a statement, a question, etc. When a sentence is written it begins with a big (capital) letter and ends with a full stop.";
        char y = x.charAt(x.length()/2);
        
        System.out.println(y);
        
	}

}
