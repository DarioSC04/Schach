package Backend;
import java.util.ArrayList;
import figurenKlassen.Figur;
import main.Hilfsmethoden; 

public class MinMax extends Thread{
	private static final float minus_unendlich = (float) -1e20;
	private ArrayList<Figur> feld;
	private byte tiefe;
	private int alpha;
	private int beta;
	private boolean w_am_zug;
	
	MinMax(ArrayList<Figur> kopiertes_feld, int alpha , int beta,byte tiefe, boolean w_am_zug){
		this.feld = kopiertes_feld;
		this.alpha=alpha;
		this.beta=beta;
		this.tiefe=tiefe;
		this.w_am_zug=w_am_zug;
	}
	public float search() {
		if(tiefe==0) {
			return (float) feldbewertung.bewertung(feld, w_am_zug);
		}
		ArrayList<ArrayList<Byte>> lz = Backendstart.legalezüge(feld,w_am_zug);
		//System.out.println("lz = "+lz);
		float b_bewertung=minus_unendlich;
		
		for(byte i=0;i<lz.size();i++) {
			for(byte k=0;k<lz.get(i).size();k++) {
				ArrayList<Figur> kopiertes_feld=Hilfsmethoden.tiefefeldkopie(feld);
				Backendstart.backend_ziehen(kopiertes_feld, lz, new byte[] {i,k});
				MinMax minmax = new MinMax(kopiertes_feld, alpha, beta, (byte) (tiefe-1),!w_am_zug);
				float bewertung=minmax.search();
				//System.out.println("Bei tiefe: "+tiefe+" ist die bewertung beim zug von "+feld.get(i).getXY()+" nach: "+lz.get(i).get(k)+ " hat bewertung: "+bewertung);
				b_bewertung=Math.max(b_bewertung,bewertung);
			}
		}
	return b_bewertung;
	}
	
}
