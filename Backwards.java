import java.util.Scanner;

class Backwards {
    public static void main(String[]args) {
	System.out.println("Ange text:");
	Scanner in = new Scanner(System.in);
	String inputString = in.nextLine();

	for(int i= inputString.length () -1; i>=0; i--)
	    {
		System.out.print(inputString.charAt(i));
	    }
	System.out.println();
    }
}
