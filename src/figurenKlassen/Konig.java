package figurenKlassen;

import java.util.ArrayList;

public class Konig extends Figur{
	
	public static final int[] xzüge = {-1,-1,-1,0,0,1,1,1};
	public static final int[] yzüge = {-1,0,1,-1,1,-1,0,1};
	
	public Konig(byte xy,boolean farbeW){
		super(xy, farbeW,'k');
	}
	
	public ArrayList<Byte> gibzüge(ArrayList<Figur> feld){
		ArrayList<Byte> züge = new ArrayList<Byte>();
		int x= (getXY()-1)%8;
		int y= (getXY()-1)/8;
		
		for(int i=0;i<xzüge.length;i++) {
			int xn= x+xzüge[i];
			int yn= y+yzüge[i];
			
			if(xn>=0&&xn<8&&yn>=0&&yn<8&&istFeldFreioderSchlagbar(feld,toxy(xn, yn))) {
				züge.add(toxy(xn, yn));
			}		
		}
		return züge;
	}
	
}