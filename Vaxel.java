import java.util.*;

public class Vaxel {
    public static void main(String[]arg) {
	    {
		//skriver ut meddelande till användaren
		System.out.println("Skriv in priset på varan (1.00-500.00):");
		//användaren matar in ett 
		Scanner in = new Scanner(System.in);
		float pris = in.nextFloat();

		//gör om priset från float till int
		int prisInt=(int)pris;
		
		int vaxel = 500 - prisInt;
		int ant100 = vaxel / 100;
		int ant50 = (vaxel%100) / 50;
		int ant20 = (vaxel%50) / 20;
		int ant10 = ((vaxel%50) % 20) / 10;
		int ant5 = ((vaxel%20) % 10) / 5;
		int ant1 = (vaxel%5);
		float restOre = (500 - pris)%1;
                int antOre = 0;


	       if (restOre >= 0.5 & restOre < 1 & ant1 == 0)
			{
			    ant5 = ant5 - 1;
			    ant1 = ant1 + 4;
			    antOre = 1;
			}

		    
		    
	       	else if (restOre >= 0.5 & restOre < 1 & ant1 != 0)
	       	{
			    antOre=1;
			    ant1 = ant1 - 1;
	       	}

	       
	       

	       System.out.println("Du får tillbaka: ");
	       System.out.println(
	       ant100 + " hundralappar, " + ant50 + " femtiolappar, "
	       + ant20 + " tjugolappar, " + ant10 + " tior, " + ant5 +
	       " femkronor, " + ant1 + " enkronor, "
	       + antOre + " Femtio Öringar");
		 


		    
	    
}
}
}
