package week2;

public class ASCII {
	public static void main(String[] args) {
		int x;
		String b;
		String h;
		
		x = ((int) (Math.random()*255 + 1));
		
		System.out.format("The random decimal number is         : " + x);
		
		b = Integer.toBinaryString(x);
		System.out.format("\nThe decimal number in binary is      : " + b);
		
		h = Integer.toHexString(x);
		System.out.println("\nThe decimal nuber in hexadecimal is  : " + h);
		
		System.out.println("\nThe ASCII character for " + x + " is       : " + (char)x);
	}

}
