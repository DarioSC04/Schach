package Backend;

import java.util.ArrayList;
import java.util.Random;

import figurenKlassen.Figur;
import figurenKlassen.OutOfFieldExeption;
import main.Hilfsmethoden;

public class Backendstart {
	public static boolean w_dran;
	private static final float minus_unendlich = (float) -1e20;
	
	public static void start(ArrayList<Figur> uifeld) {
		w_dran=!main.FrontEnd.w_dran;
		System.out.println(""+w_dran+"  "+feldbewertung.bewertung(uifeld, w_dran));
		ArrayList<ArrayList<Byte>> lz = legalezüge(uifeld,w_dran);
		byte[] move = minmaxStarten((byte) 3, uifeld, lz);
		System.out.println("lz = "+lz+ "und der zug ist : "+move[0]+" und "+ move[1]);
		backend_ziehen(uifeld, lz, move);
	}
	
	public static byte[] minmaxStarten(byte tiefe,ArrayList<Figur> uifeld,ArrayList<ArrayList<Byte>> lz){
		float b_bewertung=minus_unendlich;
		byte[] finalerMove = new byte[2];
		
		for(byte i=0;i<lz.size();i++) {
			for(byte k=0;k<lz.get(i).size();k++) {
				ArrayList<Figur> feld = Hilfsmethoden.tiefefeldkopie(uifeld);
				Backendstart.backend_ziehen(feld, lz, new byte[] {i,k});
				//Hilfsmethoden.feldAusgeben(feld);
				MinMax minmax = new MinMax(feld, 0, 0, (byte) (tiefe-1),!w_dran);
				float bewertung=minmax.search();
				//System.out.println("Bei tiefe: "+tiefe+" ist die bewertung beim zug von "+feld.get(i).getXY()+" nach: "+lz.get(i).get(k)+ " hat bewertung: "+bewertung);
				if(b_bewertung<bewertung) {
					b_bewertung=bewertung;
					finalerMove[0] = i;
					finalerMove[1] = k;
				}
			}
		}
		return finalerMove;
	}
	
	public static void backend_ziehen(ArrayList<Figur> feld,ArrayList<ArrayList<Byte>> lz, byte[] move) {
		int i =Hilfsmethoden.FeldhatKoordianteAnStelle(feld, lz.get(move[0]).get(move[1]));
		if(i>=0) {
			feld.remove(i);
		}
		try {
			feld.get(move[0]).move(lz.get(move[0]).get(move[1]));
		} catch (OutOfFieldExeption e) {
			e.toString();
		}
	}
	
	
	public static ArrayList<ArrayList<Byte>> legalezüge(ArrayList<Figur> feld,boolean w_am_zug) {
		ArrayList<ArrayList<Byte>> legalezüge = new ArrayList<ArrayList<Byte>>();
		
		ArrayList<Byte> zügefigur ;
		for(int i=0;i<feld.size();i++) {
			if(feld.get(i).farbeW==w_am_zug) {
				zügefigur=feld.get(i).gibzüge(feld);
				legalezüge.add(zügefigur);
			}
		}
		
		return legalezüge;
	}
}
