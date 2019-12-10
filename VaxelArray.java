import java.util.*;

class VaxelArray {
    public static void main(String[]arg) {
	    {
		//skriver ut meddelande till användaren
		System.out.println("Skriv in priset på varan (1,00-500,00):");
		
		//användaren matar in ett pris
		Scanner in = new Scanner(System.in);
		double pris = in.nextFloat();

		//användaren matar in betalningsumman
		System.out.println("Skriv in betalningssumman");
		double betalning = in.nextFloat();

		//räknar ut växeln
	       	double vaxel = betalning- pris;



		// Deklarerar alla arrays
		int[] vaxelArray = new int[7];
		String[] valorerNamn = {"hundralappar", "femtiolappar", "tjugolappar", "tior", "femmor", "enkronor", "femtioöringar"};
		double [] valorerArray = {100, 50, 20, 10, 5, 1, 0.5};

		// Denna for loop räknar ut växeln tillbaka för varje valör
		for (int i = 0; i < valorerArray.length; i++)
		    {
			int antsed = (int) (vaxel / valorerArray[i]);
			vaxelArray[i] = antsed;
			//minska växel
			vaxel = vaxel - (valorerArray[i]*antsed);
			 
		    }
		// Här skrivs det ut till användaren för de olika valörerna de ska få tillbaka    		
		System.out.println("Du får tillbaka:");
		for (int i = 0; i < valorerArray.length; i++)
		    {
			System.out.println(vaxelArray[i] + " " + valorerNamn[i]);
		    }
     

		    
	    
}
}
}
