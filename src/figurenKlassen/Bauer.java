package figurenKlassen;

import java.util.ArrayList;

import main.FrontEnd;
import main.Hilfsmethoden;

public class Bauer extends Figur{
	
	public Bauer(byte xy,boolean farbeW){
		super(xy, farbeW,'b');
	}
	
	protected boolean istFeldBelegtVomGegner(ArrayList<Figur> feld, int xy) {
		int nummer =Hilfsmethoden.FeldhatKoordianteAnStelle(feld, xy);
		return !(nummer<0||feld.get(nummer).farbeW==farbeW);
	}
	
	public ArrayList<Byte> gibzüge(ArrayList<Figur> feld){
		ArrayList<Byte> züge = new ArrayList<Byte>();
		
		int x= (getXY()-1)%8;
		int y= (getXY()-1)/8;
		
		if(this.farbeW) {		
			if(istFeldBelegt(feld,Figur.toxy(x,y-1))==false) {
				züge.add(Figur.toxy(x,y-1));
			}
			if(istFeldBelegtVomGegner(feld,toxy(x+1,y-1))&&(x+1)<7) {
				züge.add(Figur.toxy(x+1,y-1));
			}
			if(istFeldBelegtVomGegner(feld,toxy(x-1,y-1))&&(x-1)>=0) {
				züge.add(Figur.toxy(x-1,y-1));
			}
			
			if(y==6&&istFeldBelegt(feld,toxy(x,y-2))==false&&istFeldBelegt(feld,Figur.toxy(x,y-1))==false) {
				züge.add(Figur.toxy(x,y-2));
			}	
			
		}else{
			
			if(istFeldBelegt(feld,Figur.toxy(x,y+1))==false) {
				züge.add(Figur.toxy(x,y+1));
			}
			if(istFeldBelegtVomGegner(feld,toxy(x+1,y+1))&&(x+1)<7) {
				züge.add(Figur.toxy(x+1,y+1));
			}
			if(istFeldBelegtVomGegner(feld,toxy(x-1,y+1))&&(x-1)>=0) {
				züge.add(Figur.toxy(x-1,y+1));
			}
			
			if(y==1&&istFeldBelegt(feld,toxy(x,y+2))==false&&istFeldBelegt(feld,Figur.toxy(x,y+1))==false) {
				züge.add(Figur.toxy(x,y+2));
			}
			
		}
		return züge;
	}
	
}
