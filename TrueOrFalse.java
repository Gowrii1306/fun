package day3_strings;

public class TrueOrFalse {

	public static void main(String[] args) {

		String a = "Gowrii Pragadeesh";
		boolean check = a.contains("gow");
		System.out.println(check);
		
		String b = "gowrii pragadeesh";
		boolean check1 = b.equals(a);
		System.out.println(check1);
		
		boolean check2 = b.equalsIgnoreCase(a);
		System.out.println(check2);
		
		boolean check3 = b.startsWith("go");
		System.out.println(check3);
		
		boolean check4 = b.endsWith("sh");
		System.out.println(check4);
		
		String c = "Onesoft";
		String check5 = c.substring(4,6);
		System.out.println(check5);
		
		
		
}

}
