package main;

import java.util.ArrayList;
import figurenKlassen.Figur;
import figurenKlassen.OutOfFieldExeption;

public class FrontEnd {
	
	public static ArrayList<Figur> uifeld;
	public static boolean w_oben =true;
	public static boolean w_dran =true;
	public static boolean dots_angezeigt= false;
	public static boolean mehrspieler= false;
	static MyFrame ui;
	
	public static void main(String[] args) {
		uifeld = Hilfsmethoden.felderstellen();
		ui = new MyFrame();
	}
	
	public static void reset(){
		uifeld = Hilfsmethoden.felderstellen();
		w_dran=true;
		dots_angezeigt= false;
		ui.marker_verstecken();
		ui.dot_verstecken();
		ui.mehrspieler.setEnabled(true);
		ui.brett_darstellen(uifeld);	
	}
	
	
	public static void buttonGedrückt(int xy){
		int i =Hilfsmethoden.FeldhatKoordianteAnStelle(uifeld, xy);
		if(dots_angezeigt) {
				int xy_marker=ui.get_marker_xy();
				if(xy_marker!=xy) {
					int k= Hilfsmethoden.FeldhatKoordianteAnStelle(uifeld, xy_marker);
					if(k>=0) {
							ArrayList<Byte> legalezüge = uifeld.get(k).gibzüge(uifeld);
							boolean istdrin = false;
							for(int s=0;s<legalezüge.size();s++) {
								if(legalezüge.get(s)==xy) {istdrin=true;}
							}
							if(istdrin) {
								System.out.println("zug");
								w_dran = !w_dran;
								try {
									uifeld.get(k).move(xy);
								} catch (OutOfFieldExeption e) {
									e.printStackTrace();
								}
								if(i>=0) {
									uifeld.remove(i);
								}
								ui.dot_verstecken();
								dots_angezeigt=false;
								ui.marker_verstecken();
								if(!mehrspieler) {
									backendvorbereiten();
								}
							}
					}
				}else {
					ui.dot_verstecken();
					dots_angezeigt=false;
					ui.marker_verstecken();
				}
		}else {
			if(i>=0&&uifeld.get(i).farbeW==w_dran) {
			System.out.println(uifeld.get(i).gibzüge(uifeld)+"  "+uifeld.get(i));
			ui.dotsanzeigen(uifeld.get(i).gibzüge(uifeld));
			MyFrame.setmarker(xy);
			dots_angezeigt=true;
			}else {
				
			}
		}
		ui.brett_darstellen(uifeld);
		Hilfsmethoden.feldAusgeben(uifeld);
	}
	public static void backendvorbereiten() {
		w_dran = !w_dran;
		Backend.Backendstart.start(uifeld);	
	}

	

}
