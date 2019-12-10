import java.util.Scanner;

class StorstaTalet {
    public static void main(String[]args) {
	System.out.println("Mata in två heltal");
	System.out.println("tal 1: ");
        Scanner in = new Scanner(System.in);
	int tal1 = in.nextInt();

	
	System.out.println("tal 2: ");

	int tal2 = in.nextInt();

	if(tal1 > tal2){
	    System.out.println("Det största talet är:" + tal1);
	}

	if(tal1 < tal2){
	    System.out.println("Det största talet är:" + tal2);
	}

	else{
	    System.out.println("Kan du skriiiva eller");
	}
}
}
