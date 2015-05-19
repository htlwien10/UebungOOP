package bruchrechnung;
import AlgoTools.IO;
public class Bruch {
	
	//Eigenschaften
	
	private int zaehler; // wird automatisch mit 0 initialisiert
	private int nenner = 1;
	
	
	
	//Methoden

	void kuerze() {
		int teiler = ggt(zaehler, nenner);
		zaehler = zaehler/teiler;
		nenner = nenner/teiler;
	}
	
	
	//	 größten gemeinsamen Teiler mit dem Euklidischen Algorithmus bestimmen
	private int ggt(int a, int b) {
		a=Math.abs(a);
		b=Math.abs(b);
		if (a==0)
			return b;
		else {
			while (b!=0)
				if (a>b)
					a=a-b;
				else
					b=b-a;
			return a;
		}
	}
}
