import java.util.Scanner;

public class Vaxel {
    public static void main(String[]arg) {
	    {
		System.out.println("Skriv in priset på varan (1-10):");
		Scanner in = new Scanner(System.in);
	        int pris = in.nextInt();
		int vaxel = 10 - pris;
		int rest = vaxel % 5;

		if(rest > 0 && pris < 5){
		    System.out.println("Du får 1 femkrona och " + rest + " enkrona/or tillbaka");
		}

		if(rest > 0 && pris > 5){
		    System.out.println("Du får " + rest + " enkrona/or tillbaka");
		}
		
		if(rest == 0){
		    System.out.println("Du får 1 femkrona tillbaka");
		}
		    
	    
}
}
}
