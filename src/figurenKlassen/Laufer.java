package figurenKlassen;

import java.util.ArrayList;

public class Laufer extends Figur{
	public static final int[] xzüge = {1,1,-1,-1};
	public static final int[] yzüge = {1,-1,1,-1};
	
	public Laufer(byte xy,boolean farbeW){
		super(xy, farbeW,'l');
	}
	
	public ArrayList<Byte> gibzüge(ArrayList<Figur> feld){
		ArrayList<Byte> züge = new ArrayList<Byte>();
		int x= (getXY()-1)%8;
		int y= (getXY()-1)/8;
		
		for(int k=0;k<xzüge.length;k++) {
			for(int i=1;i<=7;i++) {
				int yn=y+(i*yzüge[k]);
				int xn=x+(i*xzüge[k]);
				if(yn>=0&&yn<8&&xn>=0&&xn<8) {
					if(istFeldBelegt(feld,toxy(xn, yn))==false){
						züge.add(toxy(xn, yn));
					}else if(istFeldFreioderSchlagbar(feld, toxy(xn, yn))) {
						züge.add(toxy(xn, yn));
						break;
					}else {
						break;
					}
				}else{
					break;
				}
			}
		}
		
		return züge;
	}
	
}