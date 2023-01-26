package day3_strings;

public class Package1 {

	public static void main(String[] args) {
		int productprice =Integer.parseInt(args[0]);
		int gst = Integer.parseInt(args[1]);
		
		int findgst = productprice*gst/100;
		
		int totalprice = productprice+findgst;
		System.out.println(totalprice);

	}

}
