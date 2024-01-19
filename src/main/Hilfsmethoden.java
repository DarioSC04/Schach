package main;

import java.util.ArrayList;

import figurenKlassen.Bauer;
import figurenKlassen.Dame;
import figurenKlassen.Figur;
import figurenKlassen.Konig;
import figurenKlassen.Laufer;
import figurenKlassen.Springer;
import figurenKlassen.Turm;

public class Hilfsmethoden {
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_WHITE = "\u001B[37m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	
	public static boolean istINZüge(ArrayList<Integer> züge,int gesucht) {
		for(int i=0;i<züge.size();i++) {
			if(züge.get(i)==gesucht) {
				return true;
			}
		}
		return false;
	} 
	
	public static void feldAusgeben(ArrayList<Figur> feld) {
		System.out.println();
		for(int i=1;i<=64;i++) {
			int k =FeldhatKoordianteAnStelle(feld, i);
			if(k==-1) {
				System.out.print("  ");
			}else {
				if(feld.get(k).farbeW) {
					System.out.print(ANSI_WHITE +feld.get(k).type+" ");
				}else {
					System.out.print(ANSI_PURPLE +feld.get(k).type+" ");
				}
			}
			if(i%8==0) {
				System.out.println();
			}
		}
		System.out.println(ANSI_RESET);
	}
	
	public static int FeldhatKoordianteAnStelle(ArrayList<Figur> feld,int i) {
		for(int k=0;k<feld.size();k++) {
			if(feld.get(k).getXY()==i) {
				return k;
			}
		}
		return -1;
	}
	public static ArrayList<Figur> tiefefeldkopie(ArrayList<Figur> feld){
		
		ArrayList<Figur> kopie = new ArrayList<Figur>();
		
		for(int i=0;i<feld.size();i++) {
			Figur h;
			switch (feld.get(i).type) {
				case 'b':
					h = new Bauer(feld.get(i).getXY(), feld.get(i).farbeW);
					break;
				case 't':
					h = new Turm(feld.get(i).getXY(), feld.get(i).farbeW);
					break;
				case 's':
					h = new Springer(feld.get(i).getXY(), feld.get(i).farbeW);
					break;
				case 'l':
					h = new Laufer(feld.get(i).getXY(), feld.get(i).farbeW);
					break;
				case 'd':
					h = new Dame(feld.get(i).getXY(), feld.get(i).farbeW);
					break;
				case 'k':
					h = new Konig(feld.get(i).getXY(), feld.get(i).farbeW);
					break;
				default:
					System.out.println("Fehler beim kopieren");
					h=null;
			}
			kopie.add(h);
		}

		return kopie;
	}
	
	public static ArrayList<Figur> felderstellen() {
		return felderstellen("rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR");
	}
	
	public static ArrayList<Figur> felderstellen(String fen) {
		ArrayList<Figur> feld = new ArrayList<Figur>();
		byte y=0;
		byte x=1;
		
		for(int i=0;i<fen.length();i++) {
			char bustabe =fen.charAt(i);
			if(bustabe>47&&bustabe<58) {
				x=(byte) (x+Math.abs(48-bustabe));
			}else if(bustabe=='/') {
				y++;
				x=1;
			}else{
				switch(bustabe) {
				case 'P':
					Figur b = new Bauer((byte) (y*8+x),true); 
					feld.add(b);
					break;
				case 'R':
					Figur t = new Turm((byte) (y*8+x),true); 
					feld.add(t);
					break;
				case 'N':
					Figur s = new Springer((byte) (y*8+x),true); 
					feld.add(s);
					break;
				case 'B':
					Figur l = new Laufer((byte) (y*8+x),true); 
					feld.add(l);
					break;
				case 'K':
					Figur k = new Konig((byte) (y*8+x),true); 
					feld.add(k);
					break;
				case 'Q':
					Figur d = new Dame((byte) (y*8+x),true); 
					feld.add(d);
					break;
				case 'p':
					Figur B = new Bauer((byte) (y*8+x),false); 
					feld.add(B);
					break;
				case 'r':
					Figur T = new Turm((byte) (y*8+x),false); 
					feld.add(T);
					break;
				case 'n':
					Figur S = new Springer((byte) (y*8+x),false); 
					feld.add(S);
					break;
				case 'b':
					Figur L = new Laufer((byte) (y*8+x),false); 
					feld.add(L);
					break;
				case 'k':
					Figur K = new Konig((byte) (y*8+x),false); 
					feld.add(K);
					break;
				case 'q':
					Figur D = new Dame((byte) (y*8+x),false); 
					feld.add(D);
					break;
				}
				x++;
			}
		}
		return feld;
	}
	
}
