import java.util.Scanner;

class HurGammal {
    public static void main(String[]args){
	System.out.println("Hur gammal är du?");
	Scanner in = new Scanner(System.in);
	String ålder = in.nextLine();
	System.out.println("Din ålder är: " + ålder);
    }
}
