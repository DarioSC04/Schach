package Backend;

import java.util.ArrayList;
import java.util.Random;

import figurenKlassen.Figur;

public class feldbewertung {
final static float unendlich=(float) 1e10;
	
public static float bewertung(ArrayList<Figur> feld,boolean w_am_zug) {
	float bewertung=0;
	byte vorzeichen=0;
	boolean eigener_konig_alive=false;
	boolean gegner_konig_alive=false;
	for(byte i=0;i<feld.size();i++) {
		
		if(feld.get(i).farbeW==w_am_zug) {
			vorzeichen= 1;
		}else {
			vorzeichen = -1;
		}
		
		switch(feld.get(i).type) {
			case 'b':
				bewertung += (100*vorzeichen);
				break;
			case 't':
				bewertung += (400*vorzeichen);
				break;
			case 's':
				bewertung += (300*vorzeichen);
				break;
			case 'l':
				bewertung += (300*vorzeichen);
				break;
			case 'd':
				bewertung += (800*vorzeichen);
				break;
			case 'k':
				if(feld.get(i).farbeW==w_am_zug) {
					eigener_konig_alive = true;
				}else {
					gegner_konig_alive = true;
				}
				break;
		}
	}
	if(eigener_konig_alive==false) {
		bewertung = -1*unendlich;
	}else if(gegner_konig_alive==false) {
		bewertung = unendlich;
	}
	
	Random rand = new Random();
	bewertung = (float) (bewertung + (rand.nextFloat()*0.01));
	
	return bewertung;
}
	
}
