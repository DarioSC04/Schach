package figurenKlassen;

import java.util.ArrayList;
import main.Hilfsmethoden;

public  abstract class Figur {
	
	//feld1 ist links oben. geht also bis 64
	private byte xy;
	public final boolean farbeW;
	public final char type;
	
	public static boolean istFeld(int xy) {
		if(xy>0&&xy<=64) {
			return true;
		}else {
			return false;
		}
	}
	
	Figur(byte xy, boolean farbeW, char type){
		if(istFeld(xy)==false) {
			System.out.println("fehler, Figur: "+type+" auserhalb des feldes bei initialisierung" );
		}
		this.xy=xy;
		this.farbeW=farbeW;
		this.type=type;
	}
	
	public void move(int xy) throws OutOfFieldExeption {
		if(istFeld(xy)) {
		this.xy=(byte) xy;
		}else {
			throw new OutOfFieldExeption("Figur: "+type+" auserhalb des feldes bei zug im feld: "+ xy);
		}
	}
	
	public abstract ArrayList<Byte> gibzüge(ArrayList<Figur> feld);
	
	public String toString() {
		String farbe;
		if(farbeW) {
			farbe="w";
		}else {
			farbe="s";
		}
		return ""+type+"-"+xy+"-"+farbe;
	}
	
	public byte getXY() {
		return this.xy;
	}
	
	public static byte toxy(int x, int y) {
		return (byte) ((y*8)+x+1);
	}
	
	protected boolean istFeldBelegt(ArrayList<Figur> feld, int xy) {
		return Hilfsmethoden.FeldhatKoordianteAnStelle(feld, xy)>0;
	}
	
	protected boolean istFeldFreioderSchlagbar(ArrayList<Figur> feld, int xy) {
		int nummer =Hilfsmethoden.FeldhatKoordianteAnStelle(feld, xy);
		return nummer<0||feld.get(nummer).farbeW!=farbeW;
	}
	
}
