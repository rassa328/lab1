import java.util.Scanner; //importerar java klassen

public class Lab1 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("mata in ett tal");
	int tal = in.nextInt();
	
	
	if (tal > 10 ) {
	    System.out.println("talet är större än 10");
	}
	else
	    {
		System.out.println("talet är mindre än 10");
	    }


	for (int i = 0; i<10; i++)
	    {
		System.out.print(i + " ");
	    }
	
    }
}
