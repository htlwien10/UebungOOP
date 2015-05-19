package bruchrechnung;
import AlgoTools.IO;
public class Rechner {
	
	public static void main(String[] args) {

		Bruch b1 = new Bruch(); 
		char rz;
	
		titel("Bruchrechner");
		
		IO.println("1. Bruch");
		b1.eingabe();
		b1.kuerze();
		b1.ausgabe();
		
		/*
		rz=IO.readChar("Rechenzeichen :");
		
		IO.println("\n2. Bruch");
		b2.eingabe();
		b2.kuerze();
		//b2.ausgabe();
	
		switch (rz){
		case '+': b1.addiere(b2); break;
		case '-':
		case '*':
		case '/':
		default:
		}
		
		b1.kuerze();
		b1.ausgabe();
		IO.print(b1.dezzahl); //Ergebnisbruch als Dezimalzahlausgeben
		 */
		
		
		verabschiedung();
	}




	static void titel(String text) {
			
		IO.print("\n\t\t");
		
		for (int i=0; i<text.length()+6; i++)
			IO.print("*");
		
		IO.print("\n\t\t*  "+ text + "  *\n\t\t");
		
		for (int i=0; i<text.length()+6; i++)
			IO.print("*");
		
		IO.println("\n");
	}

	
	static void verabschiedung() {
		
		IO.println("\n\n\t Have A Nice Day!");
	}	
}
