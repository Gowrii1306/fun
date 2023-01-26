package day3_strings;

public class SplitArray {

	public static void main(String[] args) {

		String name = "Gowrii,Pragadesh,Goe15616315";
		String[] names = name.split("\\d");
		System.out.println(names[0]);

	}

}
