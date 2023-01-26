package day3_strings;

public class SplitTesting {

	public static void main(String[] args) {

		String ab = "Banana";
		String [] abc = ab.split("a");
		System.out.println(abc[0]+" "+abc[1]+" "+abc[2]);
		
		String b = "HELLO";
		String [] let = b.split("L");
		System.out.println(let[0]);
		System.out.println(let[1]);
		System.out.println(let[2]);
		
		String x = "Aa1Bb2 Cc3";
		String [] y = x.split("\\d");
		System.out.println(y[0]);
		System.out.println(y[1]);
				
		
	}

}
