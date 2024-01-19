package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import figurenKlassen.Figur;

public class MyFrame extends JFrame implements ActionListener{	
	
	
	//ebene1
	ImageIcon kachel1;
	ImageIcon kachel2;
	
	//ebene2
	ImageIcon dot = new ImageIcon("dot.png");
	ImageIcon kreis = new ImageIcon("kreis.png");
	static JPanel marker;
	
	JLabel d_aa;
	JLabel d_ab;
	JLabel d_ac;
	JLabel d_ad;
	JLabel d_ae;
	JLabel d_af;
	JLabel d_ag;
	JLabel d_ah;
	
	JLabel d_ba;
	JLabel d_bb;
	JLabel d_bc;
	JLabel d_bd;
	JLabel d_be;
	JLabel d_bf;
	JLabel d_bg;
	JLabel d_bh;
	
	JLabel d_ca;
	JLabel d_cb;
	JLabel d_cc;
	JLabel d_cd;
	JLabel d_ce;
	JLabel d_cf;
	JLabel d_cg;
	JLabel d_ch;
	
	JLabel d_da;
	JLabel d_db;
	JLabel d_dc;
	JLabel d_dd;
	JLabel d_de;
	JLabel d_df;
	JLabel d_dg;
	JLabel d_dh;
	
	JLabel d_ea;
	JLabel d_eb;
	JLabel d_ec;
	JLabel d_ed;
	JLabel d_ee;
	JLabel d_ef;
	JLabel d_eg;
	JLabel d_eh;
	
	JLabel d_fa;
	JLabel d_fb;
	JLabel d_fc;
	JLabel d_fd;
	JLabel d_fe;
	JLabel d_ff;
	JLabel d_fg;
	JLabel d_fh;
	
	JLabel d_ga;
	JLabel d_gb;
	JLabel d_gc;
	JLabel d_gd;
	JLabel d_ge;
	JLabel d_gf;
	JLabel d_gg;
	JLabel d_gh;
	
	JLabel d_ha;
	JLabel d_hb;
	JLabel d_hc;
	JLabel d_hd;
	JLabel d_he;
	JLabel d_hf;
	JLabel d_hg;
	JLabel d_hh;
	
	//ebene3
	ImageIcon figur = new ImageIcon("Figuren/s_turm.png");

	
	JLabel f_aa;
	JLabel f_ab;
	JLabel f_ac;
	JLabel f_ad;
	JLabel f_ae;
	JLabel f_af;
	JLabel f_ag;
	JLabel f_ah;
	
	JLabel f_ba;
	JLabel f_bb;
	JLabel f_bc;
	JLabel f_bd;
	JLabel f_be;
	JLabel f_bf;
	JLabel f_bg;
	JLabel f_bh;
	
	JLabel f_ca;
	JLabel f_cb;
	JLabel f_cc;
	JLabel f_cd;
	JLabel f_ce;
	JLabel f_cf;
	JLabel f_cg;
	JLabel f_ch;
	
	JLabel f_da;
	JLabel f_db;
	JLabel f_dc;
	JLabel f_dd;
	JLabel f_de;
	JLabel f_df;
	JLabel f_dg;
	JLabel f_dh;
	
	JLabel f_ea;
	JLabel f_eb;
	JLabel f_ec;
	JLabel f_ed;
	JLabel f_ee;
	JLabel f_ef;
	JLabel f_eg;
	JLabel f_eh;
	
	JLabel f_fa;
	JLabel f_fb;
	JLabel f_fc;
	JLabel f_fd;
	JLabel f_fe;
	JLabel f_ff;
	JLabel f_fg;
	JLabel f_fh;
	
	JLabel f_ga;
	JLabel f_gb;
	JLabel f_gc;
	JLabel f_gd;
	JLabel f_ge;
	JLabel f_gf;
	JLabel f_gg;
	JLabel f_gh;
	
	JLabel f_ha;
	JLabel f_hb;
	JLabel f_hc;
	JLabel f_hd;
	JLabel f_he;
	JLabel f_hf;
	JLabel f_hg;
	JLabel f_hh;
	
	
	//ebene4
	JButton b_aa;
	JButton b_ab;
	JButton b_ac;
	JButton b_ad;
	JButton b_ae;
	JButton b_af;
	JButton b_ag;
	JButton b_ah;
	
	JButton b_ba;
	JButton b_bb;
	JButton b_bc;
	JButton b_bd;
	JButton b_be;
	JButton b_bf;
	JButton b_bg;
	JButton b_bh;
	
	JButton b_ca;
	JButton b_cb;
	JButton b_cc;
	JButton b_cd;
	JButton b_ce;
	JButton b_cf;
	JButton b_cg;
	JButton b_ch;
	
	JButton b_da;
	JButton b_db;
	JButton b_dc;
	JButton b_dd;
	JButton b_de;
	JButton b_df;
	JButton b_dg;
	JButton b_dh;
	
	JButton b_ea;
	JButton b_eb;
	JButton b_ec;
	JButton b_ed;
	JButton b_ee;
	JButton b_ef;
	JButton b_eg;
	JButton b_eh;
	
	JButton b_fa;
	JButton b_fb;
	JButton b_fc;
	JButton b_fd;
	JButton b_fe;
	JButton b_ff;
	JButton b_fg;
	JButton b_fh;
	
	JButton b_ga;
	JButton b_gb;
	JButton b_gc;
	JButton b_gd;
	JButton b_ge;
	JButton b_gf;
	JButton b_gg;
	JButton b_gh;
	
	JButton b_ha;
	JButton b_hb;
	JButton b_hc;
	JButton b_hd;
	JButton b_he;
	JButton b_hf;
	JButton b_hg;
	JButton b_hh;
	
	static JButton zuruck;
	JButton reset;
	static JButton mehrspieler;
	static JLabel zeitanzeiger;
	
	MyFrame(){
		
		//ändern
		if(FrontEnd.w_oben) {
		kachel1 = new ImageIcon("0_b_feld.png");
		kachel2 = new ImageIcon("0_w_feld.png");
		}else {
			kachel2 = new ImageIcon("0_b_feld.png");
			kachel1 = new ImageIcon("0_w_feld.png");
		}
		this.setVisible(true);
		this.setSize(860, 880);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Schach Bot");
		this.setIconImage(figur.getImage());
		
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 860, 880);
		
		JPanel bigPanel = new JPanel();
		bigPanel.setBackground(Color.black);
		bigPanel.setLayout(null);
		bigPanel.setBounds(0,0,860,860);
		
		
		layeredPane.add(bigPanel,Integer.valueOf(0));
		this.add(layeredPane);
		
		//brett in ebene 0
		//reihe1
		JLabel aa = new JLabel();
		JLabel ab = new JLabel();
		JLabel ac = new JLabel();
		JLabel ad = new JLabel();
		JLabel ae = new JLabel();
		JLabel af = new JLabel();
		JLabel ag = new JLabel();
		JLabel ah = new JLabel();
		
		
		aa.setIcon(kachel1);
		ab.setIcon(kachel2);
		ac.setIcon(kachel1);
		ad.setIcon(kachel2);
		ae.setIcon(kachel1);
		af.setIcon(kachel2);
		ag.setIcon(kachel1);
		ah.setIcon(kachel2);
		
		aa.setBounds( 20,10,100,100);
		ab.setBounds(120,10,100,100);
		ac.setBounds(220,10,100,100);
		ad.setBounds(320,10,100,100);
		ae.setBounds(420,10,100,100);
		af.setBounds(520,10,100,100);
		ag.setBounds(620,10,100,100);
		ah.setBounds(720,10,100,100);
		
		//reih2
		JLabel ba = new JLabel();
		JLabel bb = new JLabel();
		JLabel bc = new JLabel();
		JLabel bd = new JLabel();
		JLabel be = new JLabel();
		JLabel bf = new JLabel();
		JLabel bg = new JLabel();
		JLabel bh = new JLabel();
		
		ba.setIcon(kachel2);
		bb.setIcon(kachel1);
		bc.setIcon(kachel2);
		bd.setIcon(kachel1);
		be.setIcon(kachel2);
		bf.setIcon(kachel1);
		bg.setIcon(kachel2);
		bh.setIcon(kachel1);
		
		ba.setBounds( 20,110,100,100);
		bb.setBounds(120,110,100,100);
		bc.setBounds(220,110,100,100);
		bd.setBounds(320,110,100,100);
		be.setBounds(420,110,100,100);
		bf.setBounds(520,110,100,100);
		bg.setBounds(620,110,100,100);
		bh.setBounds(720,110,100,100);

		//reih3
		JLabel ca = new JLabel();
		JLabel cb = new JLabel();
		JLabel cc = new JLabel();
		JLabel cd = new JLabel();
		JLabel ce = new JLabel();
		JLabel cf = new JLabel();
		JLabel cg = new JLabel();
		JLabel ch = new JLabel();
		
		ca.setIcon(kachel1);
		cb.setIcon(kachel2);
		cc.setIcon(kachel1);
		cd.setIcon(kachel2);
		ce.setIcon(kachel1);
		cf.setIcon(kachel2);
		cg.setIcon(kachel1);
		ch.setIcon(kachel2);
		
		ca.setBounds( 20,210,100,100);
		cb.setBounds(120,210,100,100);
		cc.setBounds(220,210,100,100);
		cd.setBounds(320,210,100,100);
		ce.setBounds(420,210,100,100);
		cf.setBounds(520,210,100,100);
		cg.setBounds(620,210,100,100);
		ch.setBounds(720,210,100,100);

		//reih4
		JLabel da = new JLabel();
		JLabel db = new JLabel();
		JLabel dc = new JLabel();
		JLabel dd = new JLabel();
		JLabel de = new JLabel();
		JLabel df = new JLabel();
		JLabel dg = new JLabel();
		JLabel dh = new JLabel();
		
		da.setIcon(kachel2);
		db.setIcon(kachel1);
		dc.setIcon(kachel2);
		dd.setIcon(kachel1);
		de.setIcon(kachel2);
		df.setIcon(kachel1);
		dg.setIcon(kachel2);
		dh.setIcon(kachel1);
		
		da.setBounds( 20,310,100,100);
		db.setBounds(120,310,100,100);
		dc.setBounds(220,310,100,100);
		dd.setBounds(320,310,100,100);
		de.setBounds(420,310,100,100);
		df.setBounds(520,310,100,100);
		dg.setBounds(620,310,100,100);
		dh.setBounds(720,310,100,100);
			
		//reih5
		JLabel ea = new JLabel();
		JLabel eb = new JLabel();
		JLabel ec = new JLabel();
		JLabel ed = new JLabel();
		JLabel ee = new JLabel();
		JLabel ef = new JLabel();
		JLabel eg = new JLabel();
		JLabel eh = new JLabel();
		
		ea.setIcon(kachel1);
		eb.setIcon(kachel2);
		ec.setIcon(kachel1);
		ed.setIcon(kachel2);
		ee.setIcon(kachel1);
		ef.setIcon(kachel2);
		eg.setIcon(kachel1);
		eh.setIcon(kachel2);
		
		ea.setBounds( 20,410,100,100);
		eb.setBounds(120,410,100,100);
		ec.setBounds(220,410,100,100);
		ed.setBounds(320,410,100,100);
		ee.setBounds(420,410,100,100);
		ef.setBounds(520,410,100,100);
		eg.setBounds(620,410,100,100);
		eh.setBounds(720,410,100,100);
		
		//reih6
		JLabel fa = new JLabel();
		JLabel fb = new JLabel();
		JLabel fc = new JLabel();
		JLabel fd = new JLabel();
		JLabel fe = new JLabel();
		JLabel ff = new JLabel();
		JLabel fg = new JLabel();
		JLabel fh = new JLabel();
		
		fa.setIcon(kachel2);
		fb.setIcon(kachel1);
		fc.setIcon(kachel2);
		fd.setIcon(kachel1);
		fe.setIcon(kachel2);
		ff.setIcon(kachel1);
		fg.setIcon(kachel2);
		fh.setIcon(kachel1);
		
		fa.setBounds( 20,510,100,100);
		fb.setBounds(120,510,100,100);
		fc.setBounds(220,510,100,100);
		fd.setBounds(320,510,100,100);
		fe.setBounds(420,510,100,100);
		ff.setBounds(520,510,100,100);
		fg.setBounds(620,510,100,100);
		fh.setBounds(720,510,100,100);
		
		//reih7
		JLabel ga = new JLabel();
		JLabel gb = new JLabel();
		JLabel gc = new JLabel();
		JLabel gd = new JLabel();
		JLabel ge = new JLabel();
		JLabel gf = new JLabel();
		JLabel gg = new JLabel();
		JLabel gh = new JLabel();
		
		ga.setIcon(kachel1);
		gb.setIcon(kachel2);
		gc.setIcon(kachel1);
		gd.setIcon(kachel2);
		ge.setIcon(kachel1);
		gf.setIcon(kachel2);
		gg.setIcon(kachel1);
		gh.setIcon(kachel2);
		
		ga.setBounds( 20,610,100,100);
		gb.setBounds(120,610,100,100);
		gc.setBounds(220,610,100,100);
		gd.setBounds(320,610,100,100);
		ge.setBounds(420,610,100,100);
		gf.setBounds(520,610,100,100);
		gg.setBounds(620,610,100,100);
		gh.setBounds(720,610,100,100);
		
		//reihe8
		JLabel ha = new JLabel();
		JLabel hb = new JLabel();
		JLabel hc = new JLabel();
		JLabel hd = new JLabel();
		JLabel he = new JLabel();
		JLabel hf = new JLabel();
		JLabel hg = new JLabel();
		JLabel hh = new JLabel();
		
		ha.setIcon(kachel2);
		hb.setIcon(kachel1);
		hc.setIcon(kachel2);
		hd.setIcon(kachel1);
		he.setIcon(kachel2);
		hf.setIcon(kachel1);
		hg.setIcon(kachel2);
		hh.setIcon(kachel1);
		
		ha.setBounds( 20,710,100,100);
		hb.setBounds(120,710,100,100);
		hc.setBounds(220,710,100,100);
		hd.setBounds(320,710,100,100);
		he.setBounds(420,710,100,100);
		hf.setBounds(520,710,100,100);
		hg.setBounds(620,710,100,100);
		hh.setBounds(720,710,100,100);
		
		//marker in ebene 2 und dot
		marker = new JPanel();
		marker.setBounds(20,110,100,100);
		marker.setVisible(false);
		marker.setBackground(new Color(244, 204, 0, 60));
		
		//reihe1
				d_aa = new JLabel();
				d_ab = new JLabel();
				d_ac = new JLabel();
				d_ad = new JLabel();
				d_ae = new JLabel();
				d_af = new JLabel();
				d_ag = new JLabel();
				d_ah = new JLabel();
				
				
				d_aa.setBounds( 20,10,100,100);
				d_ab.setBounds(120,10,100,100);
				d_ac.setBounds(220,10,100,100);
				d_ad.setBounds(320,10,100,100);
				d_ae.setBounds(420,10,100,100);
				d_af.setBounds(520,10,100,100);
				d_ag.setBounds(620,10,100,100);
				d_ah.setBounds(720,10,100,100);
				
				d_ba = new JLabel();
				d_bb = new JLabel();
				d_bc = new JLabel();
				d_bd = new JLabel();
				d_be = new JLabel();
				d_bf = new JLabel();
				d_bg = new JLabel();
				d_bh = new JLabel();
				
				d_ba.setBounds( 20,110,100,100);
				d_bb.setBounds(120,110,100,100);
				d_bc.setBounds(220,110,100,100);
				d_bd.setBounds(320,110,100,100);
				d_be.setBounds(420,110,100,100);
				d_bf.setBounds(520,110,100,100);
				d_bg.setBounds(620,110,100,100);
				d_bh.setBounds(720,110,100,100);
				
				d_ca = new JLabel();
				d_cb = new JLabel();
				d_cc = new JLabel();
				d_cd = new JLabel();
				d_ce = new JLabel();
				d_cf = new JLabel();
				d_cg = new JLabel();
				d_ch = new JLabel();
				
				d_ca.setBounds( 20,210,100,100);
				d_cb.setBounds(120,210,100,100);
				d_cc.setBounds(220,210,100,100);
				d_cd.setBounds(320,210,100,100);
				d_ce.setBounds(420,210,100,100);
				d_cf.setBounds(520,210,100,100);
				d_cg.setBounds(620,210,100,100);
				d_ch.setBounds(720,210,100,100);
				
				d_da = new JLabel();
				d_db = new JLabel();
				d_dc = new JLabel();
				d_dd = new JLabel();
				d_de = new JLabel();
				d_df = new JLabel();
				d_dg = new JLabel();
				d_dh = new JLabel();
				
				d_da.setBounds( 20,310,100,100);
				d_db.setBounds(120,310,100,100);
				d_dc.setBounds(220,310,100,100);
				d_dd.setBounds(320,310,100,100);
				d_de.setBounds(420,310,100,100);
				d_df.setBounds(520,310,100,100);
				d_dg.setBounds(620,310,100,100);
				d_dh.setBounds(720,310,100,100);
				
				d_ea = new JLabel();
				d_eb = new JLabel();
				d_ec = new JLabel();
				d_ed = new JLabel();
				d_ee = new JLabel();
				d_ef = new JLabel();
				d_eg = new JLabel();
				d_eh = new JLabel();
				
				d_ea.setBounds( 20,410,100,100);
				d_eb.setBounds(120,410,100,100);
				d_ec.setBounds(220,410,100,100);
				d_ed.setBounds(320,410,100,100);
				d_ee.setBounds(420,410,100,100);
				d_ef.setBounds(520,410,100,100);
				d_eg.setBounds(620,410,100,100);
				d_eh.setBounds(720,410,100,100);
				
				d_fa = new JLabel();
				d_fb = new JLabel();
				d_fc = new JLabel();
				d_fd = new JLabel();
				d_fe = new JLabel();
				d_ff = new JLabel();
				d_fg = new JLabel();
				d_fh = new JLabel();
				
				d_fa.setBounds( 20,510,100,100);
				d_fb.setBounds(120,510,100,100);
				d_fc.setBounds(220,510,100,100);
				d_fd.setBounds(320,510,100,100);
				d_fe.setBounds(420,510,100,100);
				d_ff.setBounds(520,510,100,100);
				d_fg.setBounds(620,510,100,100);
				d_fh.setBounds(720,510,100,100);
				
				d_ga = new JLabel();
				d_gb = new JLabel();
				d_gc = new JLabel();
				d_gd = new JLabel();
				d_ge = new JLabel();
				d_gf = new JLabel();
				d_gg = new JLabel();
				d_gh = new JLabel();
				
				d_ga.setBounds( 20,610,100,100);
				d_gb.setBounds(120,610,100,100);
				d_gc.setBounds(220,610,100,100);
				d_gd.setBounds(320,610,100,100);
				d_ge.setBounds(420,610,100,100);
				d_gf.setBounds(520,610,100,100);
				d_gg.setBounds(620,610,100,100);
				d_gh.setBounds(720,610,100,100);
				
				d_ha = new JLabel();
				d_hb = new JLabel();
				d_hc = new JLabel();
				d_hd = new JLabel();
				d_he = new JLabel();
				d_hf = new JLabel();
				d_hg = new JLabel();
				d_hh = new JLabel();
				
				d_ha.setBounds( 20,710,100,100);
				d_hb.setBounds(120,710,100,100);
				d_hc.setBounds(220,710,100,100);
				d_hd.setBounds(320,710,100,100);
				d_he.setBounds(420,710,100,100);
				d_hf.setBounds(520,710,100,100);
				d_hg.setBounds(620,710,100,100);
				d_hh.setBounds(720,710,100,100);

		
		//figuren in ebene 3
		
		//reihe1
		f_aa = new JLabel();
		f_ab = new JLabel();
		f_ac = new JLabel();
		f_ad = new JLabel();
		f_ae = new JLabel();
		f_af = new JLabel();
		f_ag = new JLabel();
		f_ah = new JLabel();
		
		f_aa.setBounds( 20,10,100,100);
		f_ab.setBounds(120,10,100,100);
		f_ac.setBounds(220,10,100,100);
		f_ad.setBounds(320,10,100,100);
		f_ae.setBounds(420,10,100,100);
		f_af.setBounds(520,10,100,100);
		f_ag.setBounds(620,10,100,100);
		f_ah.setBounds(720,10,100,100);
		
		f_ba = new JLabel();
		f_bb = new JLabel();
		f_bc = new JLabel();
		f_bd = new JLabel();
		f_be = new JLabel();
		f_bf = new JLabel();
		f_bg = new JLabel();
		f_bh = new JLabel();
		
		f_ba.setBounds( 20,110,100,100);
		f_bb.setBounds(120,110,100,100);
		f_bc.setBounds(220,110,100,100);
		f_bd.setBounds(320,110,100,100);
		f_be.setBounds(420,110,100,100);
		f_bf.setBounds(520,110,100,100);
		f_bg.setBounds(620,110,100,100);
		f_bh.setBounds(720,110,100,100);
		
		f_ca = new JLabel();
		f_cb = new JLabel();
		f_cc = new JLabel();
		f_cd = new JLabel();
		f_ce = new JLabel();
		f_cf = new JLabel();
		f_cg = new JLabel();
		f_ch = new JLabel();
		
		f_ca.setBounds( 20,210,100,100);
		f_cb.setBounds(120,210,100,100);
		f_cc.setBounds(220,210,100,100);
		f_cd.setBounds(320,210,100,100);
		f_ce.setBounds(420,210,100,100);
		f_cf.setBounds(520,210,100,100);
		f_cg.setBounds(620,210,100,100);
		f_ch.setBounds(720,210,100,100);
		
		f_da = new JLabel();
		f_db = new JLabel();
		f_dc = new JLabel();
		f_dd = new JLabel();
		f_de = new JLabel();
		f_df = new JLabel();
		f_dg = new JLabel();
		f_dh = new JLabel();
		
		f_da.setBounds( 20,310,100,100);
		f_db.setBounds(120,310,100,100);
		f_dc.setBounds(220,310,100,100);
		f_dd.setBounds(320,310,100,100);
		f_de.setBounds(420,310,100,100);
		f_df.setBounds(520,310,100,100);
		f_dg.setBounds(620,310,100,100);
		f_dh.setBounds(720,310,100,100);
		
		f_ea = new JLabel();
		f_eb = new JLabel();
		f_ec = new JLabel();
		f_ed = new JLabel();
		f_ee = new JLabel();
		f_ef = new JLabel();
		f_eg = new JLabel();
		f_eh = new JLabel();
		
		f_ea.setBounds( 20,410,100,100);
		f_eb.setBounds(120,410,100,100);
		f_ec.setBounds(220,410,100,100);
		f_ed.setBounds(320,410,100,100);
		f_ee.setBounds(420,410,100,100);
		f_ef.setBounds(520,410,100,100);
		f_eg.setBounds(620,410,100,100);
		f_eh.setBounds(720,410,100,100);
		
		f_fa = new JLabel();
		f_fb = new JLabel();
		f_fc = new JLabel();
		f_fd = new JLabel();
		f_fe = new JLabel();
		f_ff = new JLabel();
		f_fg = new JLabel();
		f_fh = new JLabel();
		
		f_fa.setBounds( 20,510,100,100);
		f_fb.setBounds(120,510,100,100);
		f_fc.setBounds(220,510,100,100);
		f_fd.setBounds(320,510,100,100);
		f_fe.setBounds(420,510,100,100);
		f_ff.setBounds(520,510,100,100);
		f_fg.setBounds(620,510,100,100);
		f_fh.setBounds(720,510,100,100);
		
		f_ga = new JLabel();
		f_gb = new JLabel();
		f_gc = new JLabel();
		f_gd = new JLabel();
		f_ge = new JLabel();
		f_gf = new JLabel();
		f_gg = new JLabel();
		f_gh = new JLabel();
		
		f_ga.setBounds( 20,610,100,100);
		f_gb.setBounds(120,610,100,100);
		f_gc.setBounds(220,610,100,100);
		f_gd.setBounds(320,610,100,100);
		f_ge.setBounds(420,610,100,100);
		f_gf.setBounds(520,610,100,100);
		f_gg.setBounds(620,610,100,100);
		f_gh.setBounds(720,610,100,100);
		
		f_ha = new JLabel();
		f_hb = new JLabel();
		f_hc = new JLabel();
		f_hd = new JLabel();
		f_he = new JLabel();
		f_hf = new JLabel();
		f_hg = new JLabel();
		f_hh = new JLabel();
		
		f_ha.setBounds( 20,710,100,100);
		f_hb.setBounds(120,710,100,100);
		f_hc.setBounds(220,710,100,100);
		f_hd.setBounds(320,710,100,100);
		f_he.setBounds(420,710,100,100);
		f_hf.setBounds(520,710,100,100);
		f_hg.setBounds(620,710,100,100);
		f_hh.setBounds(720,710,100,100);
		
				
		
		//button in ebene 4
		//reihe 1
		
		b_aa = new JButton();
		b_aa.setBounds( 20, 10, 100, 100);
		b_aa.addActionListener(this);
		b_aa.setOpaque(false);
		b_aa.setContentAreaFilled(false);
		b_aa.setBorderPainted(false);
		
		b_ab = new JButton();
		b_ab.setBounds( 120, 10, 100, 100);
		b_ab.addActionListener(this);
		b_ab.setOpaque(false);
		b_ab.setContentAreaFilled(false);
		b_ab.setBorderPainted(false);
		
		b_ac = new JButton();
		b_ac.setBounds( 220, 10, 100, 100);
		b_ac.addActionListener(this);
		b_ac.setOpaque(false);
		b_ac.setContentAreaFilled(false);
		b_ac.setBorderPainted(false);
		
		b_ad = new JButton();
		b_ad.setBounds( 320, 10, 100, 100);
		b_ad.addActionListener(this);
		b_ad.setOpaque(false);
		b_ad.setContentAreaFilled(false);
		b_ad.setBorderPainted(false);
		
		b_ae = new JButton();
		b_ae.setBounds( 420, 10, 100, 100);
		b_ae.addActionListener(this);
		b_ae.setOpaque(false);
		b_ae.setContentAreaFilled(false);
		b_ae.setBorderPainted(false);
		
		b_af = new JButton();
		b_af.setBounds( 520, 10, 100, 100);
		b_af.addActionListener(this);
		b_af.setOpaque(false);
		b_af.setContentAreaFilled(false);
		b_af.setBorderPainted(false);
		
		b_ag = new JButton();
		b_ag.setBounds( 620, 10, 100, 100);
		b_ag.addActionListener(this);
		b_ag.setOpaque(false);
		b_ag.setContentAreaFilled(false);
		b_ag.setBorderPainted(false);
		
		b_ah = new JButton();
		b_ah.setBounds( 720, 10, 100, 100);
		b_ah.addActionListener(this);
		b_ah.setOpaque(false);
		b_ah.setContentAreaFilled(false);
		b_ah.setBorderPainted(false);
	
		//reihe 2
		
		b_ba = new JButton();
		b_ba.setBounds( 20, 110, 100, 100);
		b_ba.addActionListener(this);
		b_ba.setOpaque(false);
		b_ba.setContentAreaFilled(false);
		b_ba.setBorderPainted(false);
		
		b_bb = new JButton();
		b_bb.setBounds( 120, 110, 100, 100);
		b_bb.addActionListener(this);
		b_bb.setOpaque(false);
		b_bb.setContentAreaFilled(false);
		b_bb.setBorderPainted(false);
		
		b_bc = new JButton();
		b_bc.setBounds( 220, 110, 100, 100);
		b_bc.addActionListener(this);
		b_bc.setOpaque(false);
		b_bc.setContentAreaFilled(false);
		b_bc.setBorderPainted(false);
		
		b_bd = new JButton();
		b_bd.setBounds( 320, 110, 100, 100);
		b_bd.addActionListener(this);
		b_bd.setOpaque(false);
		b_bd.setContentAreaFilled(false);
		b_bd.setBorderPainted(false);
		
		b_be = new JButton();
		b_be.setBounds( 420, 110, 100, 100);
		b_be.addActionListener(this);
		b_be.setOpaque(false);
		b_be.setContentAreaFilled(false);
		b_be.setBorderPainted(false);
	
		b_bf = new JButton();
		b_bf.setBounds( 520, 110, 100, 100);
		b_bf.addActionListener(this);
		b_bf.setOpaque(false);
		b_bf.setContentAreaFilled(false);
		b_bf.setBorderPainted(false);
		
		b_bg = new JButton();
		b_bg.setBounds( 620, 110, 100, 100);
		b_bg.addActionListener(this);
		b_bg.setOpaque(false);
		b_bg.setContentAreaFilled(false);
		b_bg.setBorderPainted(false);
		
		b_bh = new JButton();
		b_bh.setBounds( 720, 110, 100, 100);
		b_bh.addActionListener(this);
		b_bh.setOpaque(false);
		b_bh.setContentAreaFilled(false);
		b_bh.setBorderPainted(false);

		//reihe 3
		
		b_ca = new JButton();
		b_ca.setBounds( 20, 210, 100, 100);
		b_ca.addActionListener(this);
		b_ca.setOpaque(false);
		b_ca.setContentAreaFilled(false);
		b_ca.setBorderPainted(false);
		
		b_cb = new JButton();
		b_cb.setBounds( 120, 210, 100, 100);
		b_cb.addActionListener(this);
		b_cb.setOpaque(false);
		b_cb.setContentAreaFilled(false);
		b_cb.setBorderPainted(false);
		
		b_cc = new JButton();
		b_cc.setBounds( 220, 210, 100, 100);
		b_cc.addActionListener(this);
		b_cc.setOpaque(false);
		b_cc.setContentAreaFilled(false);
		b_cc.setBorderPainted(false);
		
		b_cd = new JButton();
		b_cd.setBounds( 320, 210, 100, 100);
		b_cd.addActionListener(this);
		b_cd.setOpaque(false);
		b_cd.setContentAreaFilled(false);
		b_cd.setBorderPainted(false);
		
		b_ce = new JButton();
		b_ce.setBounds( 420, 210, 100, 100);
		b_ce.addActionListener(this);
		b_ce.setOpaque(false);
		b_ce.setContentAreaFilled(false);
		b_ce.setBorderPainted(false);
	
		b_cf = new JButton();
		b_cf.setBounds( 520, 210, 100, 100);
		b_cf.addActionListener(this);
		b_cf.setOpaque(false);
		b_cf.setContentAreaFilled(false);
		b_cf.setBorderPainted(false);
	
		b_cg = new JButton();
		b_cg.setBounds( 620, 210, 100, 100);
		b_cg.addActionListener(this);
		b_cg.setOpaque(false);
		b_cg.setContentAreaFilled(false);
		b_cg.setBorderPainted(false);
	
		b_ch = new JButton();
		b_ch.setBounds( 720, 210, 100, 100);
		b_ch.addActionListener(this);
		b_ch.setOpaque(false);
		b_ch.setContentAreaFilled(false);
		b_ch.setBorderPainted(false);
		
		//reihe 4
		
		b_da = new JButton();
		b_da.setBounds( 20, 310, 100, 100);
		b_da.addActionListener(this);
		b_da.setOpaque(false);
		b_da.setContentAreaFilled(false);
		b_da.setBorderPainted(false);
		
		b_db = new JButton();
		b_db.setBounds( 120, 310, 100, 100);
		b_db.addActionListener(this);
		b_db.setOpaque(false);
		b_db.setContentAreaFilled(false);
		b_db.setBorderPainted(false);
		
		b_dc = new JButton();
		b_dc.setBounds( 220, 310, 100, 100);
		b_dc.addActionListener(this);
		b_dc.setOpaque(false);
		b_dc.setContentAreaFilled(false);
		b_dc.setBorderPainted(false);
		
		b_dd = new JButton();
		b_dd.setBounds( 320, 310, 100, 100);
		b_dd.addActionListener(this);
		b_dd.setOpaque(false);
		b_dd.setContentAreaFilled(false);
		b_dd.setBorderPainted(false);
		
		b_de = new JButton();
		b_de.setBounds( 420, 310, 100, 100);
		b_de.addActionListener(this);
		b_de.setOpaque(false);
		b_de.setContentAreaFilled(false);
		b_de.setBorderPainted(false);
	
		b_df = new JButton();
		b_df.setBounds( 520, 310, 100, 100);
		b_df.addActionListener(this);
		b_df.setOpaque(false);
		b_df.setContentAreaFilled(false);
		b_df.setBorderPainted(false);
	
		b_dg = new JButton();
		b_dg.setBounds( 620, 310, 100, 100);
		b_dg.addActionListener(this);
		b_dg.setOpaque(false);
		b_dg.setContentAreaFilled(false);
		b_dg.setBorderPainted(false);
	
		b_dh = new JButton();
		b_dh.setBounds( 720, 310, 100, 100);
		b_dh.addActionListener(this);
		b_dh.setOpaque(false);
		b_dh.setContentAreaFilled(false);
		b_dh.setBorderPainted(false);
		
		
		//reihe 5
		
		b_ea = new JButton();
		b_ea.setBounds( 20, 410, 100, 100);
		b_ea.addActionListener(this);
		b_ea.setOpaque(false);
		b_ea.setContentAreaFilled(false);
		b_ea.setBorderPainted(false);
	
		b_eb = new JButton();
		b_eb.setBounds( 120, 410, 100, 100);
		b_eb.addActionListener(this);
		b_eb.setOpaque(false);
		b_eb.setContentAreaFilled(false);
		b_eb.setBorderPainted(false);
		
		b_ec = new JButton();
		b_ec.setBounds( 220, 410, 100, 100);
		b_ec.addActionListener(this);
		b_ec.setOpaque(false);
		b_ec.setContentAreaFilled(false);
		b_ec.setBorderPainted(false);
		
		b_ed = new JButton();
		b_ed.setBounds( 320, 410, 100, 100);
		b_ed.addActionListener(this);
		b_ed.setOpaque(false);
		b_ed.setContentAreaFilled(false);
		b_ed.setBorderPainted(false);
		
		b_ee = new JButton();
		b_ee.setBounds( 420, 410, 100, 100);
		b_ee.addActionListener(this);
		b_ee.setOpaque(false);
		b_ee.setContentAreaFilled(false);
		b_ee.setBorderPainted(false);

		b_ef = new JButton();
		b_ef.setBounds( 520, 410, 100, 100);
		b_ef.addActionListener(this);
		b_ef.setOpaque(false);
		b_ef.setContentAreaFilled(false);
		b_ef.setBorderPainted(false);

		b_eg = new JButton();
		b_eg.setBounds( 620, 410, 100, 100);
		b_eg.addActionListener(this);
		b_eg.setOpaque(false);
		b_eg.setContentAreaFilled(false);
		b_eg.setBorderPainted(false);
	
		b_eh = new JButton();
		b_eh.setBounds( 720, 410, 100, 100);
		b_eh.addActionListener(this);
		b_eh.setOpaque(false);
		b_eh.setContentAreaFilled(false);
		b_eh.setBorderPainted(false);
		
		
		//reihe 6
		
		b_fa = new JButton();
		b_fa.setBounds( 20, 510, 100, 100);
		b_fa.addActionListener(this);
		b_fa.setOpaque(false);
		b_fa.setContentAreaFilled(false);
		b_fa.setBorderPainted(false);
	
		b_fb = new JButton();
		b_fb.setBounds( 120, 510, 100, 100);
		b_fb.addActionListener(this);
		b_fb.setOpaque(false);
		b_fb.setContentAreaFilled(false);
		b_fb.setBorderPainted(false);
		
		b_fc = new JButton();
		b_fc.setBounds( 220, 510, 100, 100);
		b_fc.addActionListener(this);
		b_fc.setOpaque(false);
		b_fc.setContentAreaFilled(false);
		b_fc.setBorderPainted(false);
		
		b_fd = new JButton();
		b_fd.setBounds( 320, 510, 100, 100);
		b_fd.addActionListener(this);
		b_fd.setOpaque(false);
		b_fd.setContentAreaFilled(false);
		b_fd.setBorderPainted(false);
		
		b_fe = new JButton();
		b_fe.setBounds( 420, 510, 100, 100);
		b_fe.addActionListener(this);
		b_fe.setOpaque(false);
		b_fe.setContentAreaFilled(false);
		b_fe.setBorderPainted(false);

		b_ff = new JButton();
		b_ff.setBounds( 520, 510, 100, 100);
		b_ff.addActionListener(this);
		b_ff.setOpaque(false);
		b_ff.setContentAreaFilled(false);
		b_ff.setBorderPainted(false);

		b_fg = new JButton();
		b_fg.setBounds( 620, 510, 100, 100);
		b_fg.addActionListener(this);
		b_fg.setOpaque(false);
		b_fg.setContentAreaFilled(false);
		b_fg.setBorderPainted(false);
	
		b_fh = new JButton();
		b_fh.setBounds( 720, 510, 100, 100);
		b_fh.addActionListener(this);
		b_fh.setOpaque(false);
		b_fh.setContentAreaFilled(false);
		b_fh.setBorderPainted(false);
		
		
		//reihe 7
		
		b_ga = new JButton();
		b_ga.setBounds( 20, 610, 100, 100);
		b_ga.addActionListener(this);
		b_ga.setOpaque(false);
		b_ga.setContentAreaFilled(false);
		b_ga.setBorderPainted(false);
	
		b_gb = new JButton();
		b_gb.setBounds( 120, 610, 100, 100);
		b_gb.addActionListener(this);
		b_gb.setOpaque(false);
		b_gb.setContentAreaFilled(false);
		b_gb.setBorderPainted(false);
		
		b_gc = new JButton();
		b_gc.setBounds( 220, 610, 100, 100);
		b_gc.addActionListener(this);
		b_gc.setOpaque(false);
		b_gc.setContentAreaFilled(false);
		b_gc.setBorderPainted(false);
		
		b_gd = new JButton();
		b_gd.setBounds( 320, 610, 100, 100);
		b_gd.addActionListener(this);
		b_gd.setOpaque(false);
		b_gd.setContentAreaFilled(false);
		b_gd.setBorderPainted(false);
		
		b_ge = new JButton();
		b_ge.setBounds( 420, 610, 100, 100);
		b_ge.addActionListener(this);
		b_ge.setOpaque(false);
		b_ge.setContentAreaFilled(false);
		b_ge.setBorderPainted(false);

		b_gf = new JButton();
		b_gf.setBounds( 520, 610, 100, 100);
		b_gf.addActionListener(this);
		b_gf.setOpaque(false);
		b_gf.setContentAreaFilled(false);
		b_gf.setBorderPainted(false);

		b_gg = new JButton();
		b_gg.setBounds( 620, 610, 100, 100);
		b_gg.addActionListener(this);
		b_gg.setOpaque(false);
		b_gg.setContentAreaFilled(false);
		b_gg.setBorderPainted(false);

		b_gh = new JButton();
		b_gh.setBounds( 720, 610, 100, 100);
		b_gh.addActionListener(this);
		b_gh.setOpaque(false);
		b_gh.setContentAreaFilled(false);
		b_gh.setBorderPainted(false);
		
		
		//reihe 7
		
		b_ha = new JButton();
		b_ha.setBounds( 20, 710, 100, 100);
		b_ha.addActionListener(this);
		b_ha.setOpaque(false);
		b_ha.setContentAreaFilled(false);
		b_ha.setBorderPainted(false);
	
		b_hb = new JButton();
		b_hb.setBounds( 120, 710, 100, 100);
		b_hb.addActionListener(this);
		b_hb.setOpaque(false);
		b_hb.setContentAreaFilled(false);
		b_hb.setBorderPainted(false);
		
		b_hc = new JButton();
		b_hc.setBounds( 220, 710, 100, 100);
		b_hc.addActionListener(this);
		b_hc.setOpaque(false);
		b_hc.setContentAreaFilled(false);
		b_hc.setBorderPainted(false);
		
		b_hd = new JButton();
		b_hd.setBounds( 320, 710, 100, 100);
		b_hd.addActionListener(this);
		b_hd.setOpaque(false);
		b_hd.setContentAreaFilled(false);
		b_hd.setBorderPainted(false);
		
		b_he = new JButton();
		b_he.setBounds( 420, 710, 100, 100);
		b_he.addActionListener(this);
		b_he.setOpaque(false);
		b_he.setContentAreaFilled(false);
		b_he.setBorderPainted(false);

		b_hf = new JButton();
		b_hf.setBounds( 520, 710, 100, 100);
		b_hf.addActionListener(this);
		b_hf.setOpaque(false);
		b_hf.setContentAreaFilled(false);
		b_hf.setBorderPainted(false);

		b_hg = new JButton();
		b_hg.setBounds( 620, 710, 100, 100);
		b_hg.addActionListener(this);
		b_hg.setOpaque(false);
		b_hg.setContentAreaFilled(false);
		b_hg.setBorderPainted(false);

		b_hh = new JButton();
		b_hh.setBounds( 720, 710, 100, 100);
		b_hh.addActionListener(this);
		b_hh.setOpaque(false);
		b_hh.setContentAreaFilled(false);
		b_hh.setBorderPainted(false);
		
		zeitanzeiger = new JLabel();
		zeitanzeiger.setBounds(170,810,100,20);
		zeitanzeiger.setForeground(Color.white);
		zeitanzeiger.setText("Zeit bis Zug:");
		zeitanzeiger.setAlignmentX(CENTER_ALIGNMENT);
		
		zuruck = new JButton();
		zuruck.setBounds( 20, 810, 75, 20);
		zuruck.addActionListener(this);
		zuruck.setText("back");
		zuruck.setBackground(Color.white);
		
		reset = new JButton();
		reset.setBounds( 745, 810, 75, 20);
		reset.addActionListener(this);
		reset.setText("reset");
		reset.setBackground(Color.white);
		
		mehrspieler = new JButton();
		mehrspieler.setBounds(365,810,110,20);
		mehrspieler.addActionListener(this);
		mehrspieler.setBackground(Color.white);
		

			mehrspieler.setText("Einzelspieler");
		
		
		//adden
		//brett in ebene 0
		
		bigPanel.add(aa);
		bigPanel.add(ab);
		bigPanel.add(ac);
		bigPanel.add(ad);
		bigPanel.add(ae);
		bigPanel.add(af);
		bigPanel.add(ag);
		bigPanel.add(ah);
		
		bigPanel.add(ba);
		bigPanel.add(bb);
		bigPanel.add(bc);
		bigPanel.add(bd);
		bigPanel.add(be);
		bigPanel.add(bf);
		bigPanel.add(bg);
		bigPanel.add(bh);
		
		bigPanel.add(ca);
		bigPanel.add(cb);
		bigPanel.add(cc);
		bigPanel.add(cd);
		bigPanel.add(ce);
		bigPanel.add(cf);
		bigPanel.add(cg);
		bigPanel.add(ch);
		
		bigPanel.add(da);
		bigPanel.add(db);
		bigPanel.add(dc);
		bigPanel.add(dd);
		bigPanel.add(de);
		bigPanel.add(df);
		bigPanel.add(dg);
		bigPanel.add(dh);
		
		bigPanel.add(ea);
		bigPanel.add(eb);
		bigPanel.add(ec);
		bigPanel.add(ed);
		bigPanel.add(ee);
		bigPanel.add(ef);
		bigPanel.add(eg);
		bigPanel.add(eh);
		
		bigPanel.add(fa);
		bigPanel.add(fb);
		bigPanel.add(fc);
		bigPanel.add(fd);
		bigPanel.add(fe);
		bigPanel.add(ff);
		bigPanel.add(fg);
		bigPanel.add(fh);
		
		bigPanel.add(ga);
		bigPanel.add(gb);
		bigPanel.add(gc);
		bigPanel.add(gd);
		bigPanel.add(ge);
		bigPanel.add(gf);
		bigPanel.add(gg);
		bigPanel.add(gh);
		
		bigPanel.add(ha);
		bigPanel.add(hb);
		bigPanel.add(hc);
		bigPanel.add(hd);
		bigPanel.add(he);
		bigPanel.add(hf);
		bigPanel.add(hg);
		bigPanel.add(hh);
		
		//marker in ebene 2
		
		layeredPane.add(marker,Integer.valueOf(2));
		
		layeredPane.add(d_aa,Integer.valueOf(2));
		layeredPane.add(d_ab,Integer.valueOf(2));
		layeredPane.add(d_ac,Integer.valueOf(2));
		layeredPane.add(d_ad,Integer.valueOf(2));
		layeredPane.add(d_ae,Integer.valueOf(2));
		layeredPane.add(d_af,Integer.valueOf(2));
		layeredPane.add(d_ag,Integer.valueOf(2));
		layeredPane.add(d_ah,Integer.valueOf(2));
		
		layeredPane.add(d_ba,Integer.valueOf(2));
		layeredPane.add(d_bb,Integer.valueOf(2));
		layeredPane.add(d_bc,Integer.valueOf(2));
		layeredPane.add(d_bd,Integer.valueOf(2));
		layeredPane.add(d_be,Integer.valueOf(2));
		layeredPane.add(d_bf,Integer.valueOf(2));
		layeredPane.add(d_bg,Integer.valueOf(2));
		layeredPane.add(d_bh,Integer.valueOf(2));
		
		layeredPane.add(d_ca,Integer.valueOf(2));
		layeredPane.add(d_cb,Integer.valueOf(2));
		layeredPane.add(d_cc,Integer.valueOf(2));
		layeredPane.add(d_cd,Integer.valueOf(2));
		layeredPane.add(d_ce,Integer.valueOf(2));
		layeredPane.add(d_cf,Integer.valueOf(2));
		layeredPane.add(d_cg,Integer.valueOf(2));
		layeredPane.add(d_ch,Integer.valueOf(2));
		
		layeredPane.add(d_da,Integer.valueOf(2));
		layeredPane.add(d_db,Integer.valueOf(2));
		layeredPane.add(d_dc,Integer.valueOf(2));
		layeredPane.add(d_dd,Integer.valueOf(2));
		layeredPane.add(d_de,Integer.valueOf(2));
		layeredPane.add(d_df,Integer.valueOf(2));
		layeredPane.add(d_dg,Integer.valueOf(2));
		layeredPane.add(d_dh,Integer.valueOf(2));
		
		layeredPane.add(d_ea,Integer.valueOf(2));
		layeredPane.add(d_eb,Integer.valueOf(2));
		layeredPane.add(d_ec,Integer.valueOf(2));
		layeredPane.add(d_ed,Integer.valueOf(2));
		layeredPane.add(d_ee,Integer.valueOf(2));
		layeredPane.add(d_ef,Integer.valueOf(2));
		layeredPane.add(d_eg,Integer.valueOf(2));
		layeredPane.add(d_eh,Integer.valueOf(2));
		
		layeredPane.add(d_fa,Integer.valueOf(2));
		layeredPane.add(d_fb,Integer.valueOf(2));
		layeredPane.add(d_fc,Integer.valueOf(2));
		layeredPane.add(d_fd,Integer.valueOf(2));
		layeredPane.add(d_fe,Integer.valueOf(2));
		layeredPane.add(d_ff,Integer.valueOf(2));
		layeredPane.add(d_fg,Integer.valueOf(2));
		layeredPane.add(d_fh,Integer.valueOf(2));
		
		layeredPane.add(d_ga,Integer.valueOf(2));
		layeredPane.add(d_gb,Integer.valueOf(2));
		layeredPane.add(d_gc,Integer.valueOf(2));
		layeredPane.add(d_gd,Integer.valueOf(2));
		layeredPane.add(d_ge,Integer.valueOf(2));
		layeredPane.add(d_gf,Integer.valueOf(2));
		layeredPane.add(d_gg,Integer.valueOf(2));
		layeredPane.add(d_gh,Integer.valueOf(2));
		
		layeredPane.add(d_ha,Integer.valueOf(2));
		layeredPane.add(d_hb,Integer.valueOf(2));
		layeredPane.add(d_hc,Integer.valueOf(2));
		layeredPane.add(d_hd,Integer.valueOf(2));
		layeredPane.add(d_he,Integer.valueOf(2));
		layeredPane.add(d_hf,Integer.valueOf(2));
		layeredPane.add(d_hg,Integer.valueOf(2));
		layeredPane.add(d_hh,Integer.valueOf(2));
		
		//figuren in ebene3
		
		layeredPane.add(f_aa,Integer.valueOf(3));
		layeredPane.add(f_ab,Integer.valueOf(3));
		layeredPane.add(f_ac,Integer.valueOf(3));
		layeredPane.add(f_ad,Integer.valueOf(3));
		layeredPane.add(f_ae,Integer.valueOf(3));
		layeredPane.add(f_af,Integer.valueOf(3));
		layeredPane.add(f_ag,Integer.valueOf(3));
		layeredPane.add(f_ah,Integer.valueOf(3));
		
		layeredPane.add(f_ba,Integer.valueOf(3));
		layeredPane.add(f_bb,Integer.valueOf(3));
		layeredPane.add(f_bc,Integer.valueOf(3));
		layeredPane.add(f_bd,Integer.valueOf(3));
		layeredPane.add(f_be,Integer.valueOf(3));
		layeredPane.add(f_bf,Integer.valueOf(3));
		layeredPane.add(f_bg,Integer.valueOf(3));
		layeredPane.add(f_bh,Integer.valueOf(3));
		
		layeredPane.add(f_ca,Integer.valueOf(3));
		layeredPane.add(f_cb,Integer.valueOf(3));
		layeredPane.add(f_cc,Integer.valueOf(3));
		layeredPane.add(f_cd,Integer.valueOf(3));
		layeredPane.add(f_ce,Integer.valueOf(3));
		layeredPane.add(f_cf,Integer.valueOf(3));
		layeredPane.add(f_cg,Integer.valueOf(3));
		layeredPane.add(f_ch,Integer.valueOf(3));
		
		layeredPane.add(f_da,Integer.valueOf(3));
		layeredPane.add(f_db,Integer.valueOf(3));
		layeredPane.add(f_dc,Integer.valueOf(3));
		layeredPane.add(f_dd,Integer.valueOf(3));
		layeredPane.add(f_de,Integer.valueOf(3));
		layeredPane.add(f_df,Integer.valueOf(3));
		layeredPane.add(f_dg,Integer.valueOf(3));
		layeredPane.add(f_dh,Integer.valueOf(3));
		
		layeredPane.add(f_ea,Integer.valueOf(3));
		layeredPane.add(f_eb,Integer.valueOf(3));
		layeredPane.add(f_ec,Integer.valueOf(3));
		layeredPane.add(f_ed,Integer.valueOf(3));
		layeredPane.add(f_ee,Integer.valueOf(3));
		layeredPane.add(f_ef,Integer.valueOf(3));
		layeredPane.add(f_eg,Integer.valueOf(3));
		layeredPane.add(f_eh,Integer.valueOf(3));
		
		layeredPane.add(f_fa,Integer.valueOf(3));
		layeredPane.add(f_fb,Integer.valueOf(3));
		layeredPane.add(f_fc,Integer.valueOf(3));
		layeredPane.add(f_fd,Integer.valueOf(3));
		layeredPane.add(f_fe,Integer.valueOf(3));
		layeredPane.add(f_ff,Integer.valueOf(3));
		layeredPane.add(f_fg,Integer.valueOf(3));
		layeredPane.add(f_fh,Integer.valueOf(3));
		
		layeredPane.add(f_ga,Integer.valueOf(3));
		layeredPane.add(f_gb,Integer.valueOf(3));
		layeredPane.add(f_gc,Integer.valueOf(3));
		layeredPane.add(f_gd,Integer.valueOf(3));
		layeredPane.add(f_ge,Integer.valueOf(3));
		layeredPane.add(f_gf,Integer.valueOf(3));
		layeredPane.add(f_gg,Integer.valueOf(3));
		layeredPane.add(f_gh,Integer.valueOf(3));
		
		layeredPane.add(f_ha,Integer.valueOf(3));
		layeredPane.add(f_hb,Integer.valueOf(3));
		layeredPane.add(f_hc,Integer.valueOf(3));
		layeredPane.add(f_hd,Integer.valueOf(3));
		layeredPane.add(f_he,Integer.valueOf(3));
		layeredPane.add(f_hf,Integer.valueOf(3));
		layeredPane.add(f_hg,Integer.valueOf(3));
		layeredPane.add(f_hh,Integer.valueOf(3));
		
		
		//buttons in ebene 4
		
		layeredPane.add(b_aa,Integer.valueOf(4));
		layeredPane.add(b_ab,Integer.valueOf(4));
		layeredPane.add(b_ac,Integer.valueOf(4));
		layeredPane.add(b_ad,Integer.valueOf(4));
		layeredPane.add(b_ae,Integer.valueOf(4));
		layeredPane.add(b_af,Integer.valueOf(4));
		layeredPane.add(b_ag,Integer.valueOf(4));
		layeredPane.add(b_ah,Integer.valueOf(4));
		
		layeredPane.add(b_ba,Integer.valueOf(4));
		layeredPane.add(b_bb,Integer.valueOf(4));
		layeredPane.add(b_bc,Integer.valueOf(4));
		layeredPane.add(b_bd,Integer.valueOf(4));
		layeredPane.add(b_be,Integer.valueOf(4));
		layeredPane.add(b_bf,Integer.valueOf(4));
		layeredPane.add(b_bg,Integer.valueOf(4));
		layeredPane.add(b_bh,Integer.valueOf(4));
		
		layeredPane.add(b_ca,Integer.valueOf(4));
		layeredPane.add(b_cb,Integer.valueOf(4));
		layeredPane.add(b_cc,Integer.valueOf(4));
		layeredPane.add(b_cd,Integer.valueOf(4));
		layeredPane.add(b_ce,Integer.valueOf(4));
		layeredPane.add(b_cf,Integer.valueOf(4));
		layeredPane.add(b_cg,Integer.valueOf(4));
		layeredPane.add(b_ch,Integer.valueOf(4));
		
		layeredPane.add(b_da,Integer.valueOf(4));
		layeredPane.add(b_db,Integer.valueOf(4));
		layeredPane.add(b_dc,Integer.valueOf(4));
		layeredPane.add(b_dd,Integer.valueOf(4));
		layeredPane.add(b_de,Integer.valueOf(4));
		layeredPane.add(b_df,Integer.valueOf(4));
		layeredPane.add(b_dg,Integer.valueOf(4));
		layeredPane.add(b_dh,Integer.valueOf(4));
		
		layeredPane.add(b_ea,Integer.valueOf(4));
		layeredPane.add(b_eb,Integer.valueOf(4));
		layeredPane.add(b_ec,Integer.valueOf(4));
		layeredPane.add(b_ed,Integer.valueOf(4));
		layeredPane.add(b_ee,Integer.valueOf(4));
		layeredPane.add(b_ef,Integer.valueOf(4));
		layeredPane.add(b_eg,Integer.valueOf(4));
		layeredPane.add(b_eh,Integer.valueOf(4));
		
		layeredPane.add(b_fa,Integer.valueOf(4));
		layeredPane.add(b_fb,Integer.valueOf(4));
		layeredPane.add(b_fc,Integer.valueOf(4));
		layeredPane.add(b_fd,Integer.valueOf(4));
		layeredPane.add(b_fe,Integer.valueOf(4));
		layeredPane.add(b_ff,Integer.valueOf(4));
		layeredPane.add(b_fg,Integer.valueOf(4));
		layeredPane.add(b_fh,Integer.valueOf(4));
		
		layeredPane.add(b_ga,Integer.valueOf(4));
		layeredPane.add(b_gb,Integer.valueOf(4));
		layeredPane.add(b_gc,Integer.valueOf(4));
		layeredPane.add(b_gd,Integer.valueOf(4));
		layeredPane.add(b_ge,Integer.valueOf(4));
		layeredPane.add(b_gf,Integer.valueOf(4));
		layeredPane.add(b_gg,Integer.valueOf(4));
		layeredPane.add(b_gh,Integer.valueOf(4));
		
		layeredPane.add(b_ha,Integer.valueOf(4));
		layeredPane.add(b_hb,Integer.valueOf(4));
		layeredPane.add(b_hc,Integer.valueOf(4));
		layeredPane.add(b_hd,Integer.valueOf(4));
		layeredPane.add(b_he,Integer.valueOf(4));
		layeredPane.add(b_hf,Integer.valueOf(4));
		layeredPane.add(b_hg,Integer.valueOf(4));
		layeredPane.add(b_hh,Integer.valueOf(4));
		
		
		layeredPane.add(zeitanzeiger,Integer.valueOf(4));
		layeredPane.add(zuruck,Integer.valueOf(4));
		layeredPane.add(reset,Integer.valueOf(4));
		layeredPane.add(mehrspieler,Integer.valueOf(4));
		
		brett_darstellen(FrontEnd.uifeld);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.print("Button: ");
		int x=0;
		int y=0;
		if(e.getSource()==b_aa) {System.out.println("aa");x=0;y=0;}
		else if(e.getSource()==b_ab) {System.out.println("ab");x=1;y=0;}
		else if(e.getSource()==b_ac) {System.out.println("ac");x=2;y=0;}
		else if(e.getSource()==b_ad) {System.out.println("ad");x=3;y=0;}
		else if(e.getSource()==b_ae) {System.out.println("ae");x=4;y=0;}
		else if(e.getSource()==b_af) {System.out.println("af");x=5;y=0;}
		else if(e.getSource()==b_ag) {System.out.println("ag");x=6;y=0;}
		else if(e.getSource()==b_ah) {System.out.println("ah");x=7;y=0;}
		
		else if(e.getSource()==b_ba) {System.out.println("ba");x=0;y=1;}
		else if(e.getSource()==b_bb) {System.out.println("bb");x=1;y=1;}
		else if(e.getSource()==b_bc) {System.out.println("bc");x=2;y=1;}
		else if(e.getSource()==b_bd) {System.out.println("bd");x=3;y=1;}
		else if(e.getSource()==b_be) {System.out.println("be");x=4;y=1;}
		else if(e.getSource()==b_bf) {System.out.println("bf");x=5;y=1;}
		else if(e.getSource()==b_bg) {System.out.println("bg");x=6;y=1;}
		else if(e.getSource()==b_bh) {System.out.println("bh");x=7;y=1;}
		
		else if(e.getSource()==b_ca) {System.out.println("ca");x=0;y=2;}
		else if(e.getSource()==b_cb) {System.out.println("cb");x=1;y=2;}
		else if(e.getSource()==b_cc) {System.out.println("cc");x=2;y=2;}
		else if(e.getSource()==b_cd) {System.out.println("cd");x=3;y=2;}
		else if(e.getSource()==b_ce) {System.out.println("ce");x=4;y=2;}
		else if(e.getSource()==b_cf) {System.out.println("cf");x=5;y=2;}
		else if(e.getSource()==b_cg) {System.out.println("cg");x=6;y=2;}
		else if(e.getSource()==b_ch) {System.out.println("ch");x=7;y=2;}
		
		else if(e.getSource()==b_da) {System.out.println("da");x=0;y=3;}
		else if(e.getSource()==b_db) {System.out.println("db");x=1;y=3;}
		else if(e.getSource()==b_dc) {System.out.println("dc");x=2;y=3;}
		else if(e.getSource()==b_dd) {System.out.println("dd");x=3;y=3;}
		else if(e.getSource()==b_de) {System.out.println("de");x=4;y=3;}
		else if(e.getSource()==b_df) {System.out.println("df");x=5;y=3;}
		else if(e.getSource()==b_dg) {System.out.println("dg");x=6;y=3;}
		else if(e.getSource()==b_dh) {System.out.println("dh");x=7;y=3;}
		
		else if(e.getSource()==b_ea) {System.out.println("ea");x=0;y=4;}
		else if(e.getSource()==b_eb) {System.out.println("eb");x=1;y=4;}
		else if(e.getSource()==b_ec) {System.out.println("ec");x=2;y=4;}
		else if(e.getSource()==b_ed) {System.out.println("ed");x=3;y=4;}
		else if(e.getSource()==b_ee) {System.out.println("ee");x=4;y=4;}
		else if(e.getSource()==b_ef) {System.out.println("ef");x=5;y=4;}
		else if(e.getSource()==b_eg) {System.out.println("eg");x=6;y=4;}
		else if(e.getSource()==b_eh) {System.out.println("eh");x=7;y=4;}
		
		else if(e.getSource()==b_fa) {System.out.println("fa");x=0;y=5;}
		else if(e.getSource()==b_fb) {System.out.println("fb");x=1;y=5;}
		else if(e.getSource()==b_fc) {System.out.println("fc");x=2;y=5;}
		else if(e.getSource()==b_fd) {System.out.println("fd");x=3;y=5;}
		else if(e.getSource()==b_fe) {System.out.println("fe");x=4;y=5;}
		else if(e.getSource()==b_ff) {System.out.println("ff");x=5;y=5;}
		else if(e.getSource()==b_fg) {System.out.println("fg");x=6;y=5;}
		else if(e.getSource()==b_fh) {System.out.println("fh");x=7;y=5;}
		
		else if(e.getSource()==b_ga) {System.out.println("ga");x=0;y=6;}
		else if(e.getSource()==b_gb) {System.out.println("gb");x=1;y=6;}
		else if(e.getSource()==b_gc) {System.out.println("gc");x=2;y=6;}
		else if(e.getSource()==b_gd) {System.out.println("gd");x=3;y=6;}
		else if(e.getSource()==b_ge) {System.out.println("ge");x=4;y=6;}
		else if(e.getSource()==b_gf) {System.out.println("gf");x=5;y=6;}
		else if(e.getSource()==b_gg) {System.out.println("gg");x=6;y=6;}
		else if(e.getSource()==b_gh) {System.out.println("gh");x=7;y=6;}
		
		else if(e.getSource()==b_ha) {System.out.println("ha");x=0;y=7;}
		else if(e.getSource()==b_hb) {System.out.println("hb");x=1;y=7;}
		else if(e.getSource()==b_hc) {System.out.println("hc");x=2;y=7;}
		else if(e.getSource()==b_hd) {System.out.println("hd");x=3;y=7;}
		else if(e.getSource()==b_he) {System.out.println("he");x=4;y=7;}
		else if(e.getSource()==b_hf) {System.out.println("hf");x=5;y=7;}
		else if(e.getSource()==b_hg) {System.out.println("hg");x=6;y=7;}
		else if(e.getSource()==b_hh) {System.out.println("hh");x=7;y=7;}
		
		if(e.getSource()!=zuruck&&e.getSource()!=reset&&e.getSource()!=mehrspieler) {
		mehrspieler.setEnabled(false);
		FrontEnd.buttonGedrückt(x+(y*8)+1);
		}else if(e.getSource()==mehrspieler) {
			FrontEnd.reset();
			if(mehrspieler.getText()=="Mehrspieler") {
				FrontEnd.mehrspieler=true;
				mehrspieler.setText("Einzelspieler");
			}else{
				FrontEnd.mehrspieler=false;
				mehrspieler.setText("Mehrspieler");
			}
		}else if(e.getSource()==reset) {
			System.out.println("reset");
			FrontEnd.reset();
		}
		brett_darstellen(FrontEnd.uifeld);
		
	}
	

	static void setmarker(int xy){
		int y = (xy-1)/8;
		int x = (xy-1)%8; 
		x=x*100;
		y=y*100;
		x=x+20;
		y=y+10;
		marker.setBounds(x, y, 100, 100);
		marker.setVisible(true);
	}
	static int get_marker_xy() {
		int xy;
		int x=marker.getX();
		x=x-20;
		x=x/100;
		
		int y=marker.getY();
		y=y-10;
		y=y/100;
		
		xy=x+(8*y)+1;
		return xy;
	}
	
	public void marker_verstecken(){
		marker.setVisible(false);
	}
	public void feldResetten() {
		figur=new ImageIcon("");
		
		f_aa.setIcon(figur);
		f_ab.setIcon(figur);
		f_ac.setIcon(figur);
		f_ad.setIcon(figur);
		f_ae.setIcon(figur);
		f_af.setIcon(figur);
		f_ag.setIcon(figur);
		f_ah.setIcon(figur);
		
		f_ba.setIcon(figur);
		f_bb.setIcon(figur);
		f_bc.setIcon(figur);
		f_bd.setIcon(figur);
		f_be.setIcon(figur);
		f_bf.setIcon(figur);
		f_bg.setIcon(figur);
		f_bh.setIcon(figur);
		
		f_ca.setIcon(figur);
		f_cb.setIcon(figur);
		f_cc.setIcon(figur);
		f_cd.setIcon(figur);
		f_ce.setIcon(figur);
		f_cf.setIcon(figur);
		f_cg.setIcon(figur);
		f_ch.setIcon(figur);
		
		f_da.setIcon(figur);
		f_db.setIcon(figur);
		f_dc.setIcon(figur);
		f_dd.setIcon(figur);
		f_de.setIcon(figur);
		f_df.setIcon(figur);
		f_dg.setIcon(figur);
		f_dh.setIcon(figur);
		
		f_ea.setIcon(figur);
		f_eb.setIcon(figur);
		f_ec.setIcon(figur);
		f_ed.setIcon(figur);
		f_ee.setIcon(figur);
		f_ef.setIcon(figur);
		f_eg.setIcon(figur);
		f_eh.setIcon(figur);
		
		f_fa.setIcon(figur);
		f_fb.setIcon(figur);
		f_fc.setIcon(figur);
		f_fd.setIcon(figur);
		f_fe.setIcon(figur);
		f_ff.setIcon(figur);
		f_fg.setIcon(figur);
		f_fh.setIcon(figur);
		
		f_ga.setIcon(figur);
		f_gb.setIcon(figur);
		f_gc.setIcon(figur);
		f_gd.setIcon(figur);
		f_ge.setIcon(figur);
		f_gf.setIcon(figur);
		f_gg.setIcon(figur);
		f_gh.setIcon(figur);
		
		f_ha.setIcon(figur);
		f_hb.setIcon(figur);
		f_hc.setIcon(figur);
		f_hd.setIcon(figur);
		f_he.setIcon(figur);
		f_hf.setIcon(figur);
		f_hg.setIcon(figur);
		f_hh.setIcon(figur);
		
	}
	
	public void brett_darstellen(ArrayList<Figur> feld) {		
		
		feldResetten();
		for(int i=0;i<feld.size();i++) {
			//System.out.println(feld.get(i));
			if(feld.get(i).farbeW) {
			if(feld.get(i).type == 'b') {figur = new ImageIcon("figuren/w_bauer.png");}
			else if(feld.get(i).type == 't') {figur = new ImageIcon("figuren/w_turm.png");}
			else if(feld.get(i).type == 's') {figur = new ImageIcon("figuren/w_pferd.png");}
			else if(feld.get(i).type == 'l') {figur = new ImageIcon("figuren/w_laufer.png");}
			else if(feld.get(i).type == 'd') {figur = new ImageIcon("figuren/w_queen.png");}
			else if(feld.get(i).type == 'k') {figur = new ImageIcon("figuren/w_king.png");}
			}else {
			if(feld.get(i).type == 'b') {figur = new ImageIcon("figuren/s_bauer.png");}
			else if(feld.get(i).type == 't') {figur = new ImageIcon("figuren/s_turm.png");}
			else if(feld.get(i).type == 's') {figur = new ImageIcon("figuren/s_pferd.png");}
			else if(feld.get(i).type == 'l') {figur = new ImageIcon("figuren/s_laufer.png");}
			else if(feld.get(i).type == 'd') {figur = new ImageIcon("figuren/s_queen.png");}
			else if(feld.get(i).type == 'k') {figur = new ImageIcon("figuren/s_king.png");}
			}
			
			//falsch rum ,aber kein Bock zu tauschen
			int x = (feld.get(i).getXY()-1)/8;
			int y = (feld.get(i).getXY()-1)%8; 
			
			if(x==0) {
					 if(y==0) {f_aa.setIcon(figur);}
				else if(y==1) {f_ab.setIcon(figur);}
				else if(y==2) {f_ac.setIcon(figur);}
				else if(y==3) {f_ad.setIcon(figur);}
				else if(y==4) {f_ae.setIcon(figur);}
				else if(y==5) {f_af.setIcon(figur);}
				else if(y==6) {f_ag.setIcon(figur);}
				else if(y==7) {f_ah.setIcon(figur);}
			}
			if(x==1) {
				 if(y==0) {f_ba.setIcon(figur);}
			else if(y==1) {f_bb.setIcon(figur);}
			else if(y==2) {f_bc.setIcon(figur);}
			else if(y==3) {f_bd.setIcon(figur);}
			else if(y==4) {f_be.setIcon(figur);}
			else if(y==5) {f_bf.setIcon(figur);}
			else if(y==6) {f_bg.setIcon(figur);}
			else if(y==7) {f_bh.setIcon(figur);}
		}
			if(x==2) {
				 if(y==0) {f_ca.setIcon(figur);}
			else if(y==1) {f_cb.setIcon(figur);}
			else if(y==2) {f_cc.setIcon(figur);}
			else if(y==3) {f_cd.setIcon(figur);}
			else if(y==4) {f_ce.setIcon(figur);}
			else if(y==5) {f_cf.setIcon(figur);}
			else if(y==6) {f_cg.setIcon(figur);}
			else if(y==7) {f_ch.setIcon(figur);}
		}
			if(x==3) {
				 if(y==0) {f_da.setIcon(figur);}
			else if(y==1) {f_db.setIcon(figur);}
			else if(y==2) {f_dc.setIcon(figur);}
			else if(y==3) {f_dd.setIcon(figur);}
			else if(y==4) {f_de.setIcon(figur);}
			else if(y==5) {f_df.setIcon(figur);}
			else if(y==6) {f_dg.setIcon(figur);}
			else if(y==7) {f_dh.setIcon(figur);}
		}
			if(x==4) {
				 if(y==0) {f_ea.setIcon(figur);}
			else if(y==1) {f_eb.setIcon(figur);}
			else if(y==2) {f_ec.setIcon(figur);}
			else if(y==3) {f_ed.setIcon(figur);}
			else if(y==4) {f_ee.setIcon(figur);}
			else if(y==5) {f_ef.setIcon(figur);}
			else if(y==6) {f_eg.setIcon(figur);}
			else if(y==7) {f_eh.setIcon(figur);}
		}
			if(x==5) {
				 if(y==0) {f_fa.setIcon(figur);}
			else if(y==1) {f_fb.setIcon(figur);}
			else if(y==2) {f_fc.setIcon(figur);}
			else if(y==3) {f_fd.setIcon(figur);}
			else if(y==4) {f_fe.setIcon(figur);}
			else if(y==5) {f_ff.setIcon(figur);}
			else if(y==6) {f_fg.setIcon(figur);}
			else if(y==7) {f_fh.setIcon(figur);}
		}
			if(x==6) {
				 if(y==0) {f_ga.setIcon(figur);}
			else if(y==1) {f_gb.setIcon(figur);}
			else if(y==2) {f_gc.setIcon(figur);}
			else if(y==3) {f_gd.setIcon(figur);}
			else if(y==4) {f_ge.setIcon(figur);}
			else if(y==5) {f_gf.setIcon(figur);}
			else if(y==6) {f_gg.setIcon(figur);}
			else if(y==7) {f_gh.setIcon(figur);}
		}
			if(x==7) {
				 if(y==0) {f_ha.setIcon(figur);}
			else if(y==1) {f_hb.setIcon(figur);}
			else if(y==2) {f_hc.setIcon(figur);}
			else if(y==3) {f_hd.setIcon(figur);}
			else if(y==4) {f_he.setIcon(figur);}
			else if(y==5) {f_hf.setIcon(figur);}
			else if(y==6) {f_hg.setIcon(figur);}
			else if(y==7) {f_hh.setIcon(figur);}
		
		}
	}
	}
	
	
	public void dotsanzeigen(ArrayList<Byte> arrayList) {
		
		
		for(int k=0;k<arrayList.size();k++) {
			int x_anzeigen = (arrayList.get(k)-1)%8;
			int y_anzeigen = (arrayList.get(k)-1)/8;
			
		if(y_anzeigen==0) {
			 if(x_anzeigen==0) {d_aa.setIcon(dot);}
		else if(x_anzeigen==1) {d_ab.setIcon(dot);}
		else if(x_anzeigen==2) {d_ac.setIcon(dot);}
		else if(x_anzeigen==3) {d_ad.setIcon(dot);}
		else if(x_anzeigen==4) {d_ae.setIcon(dot);}
		else if(x_anzeigen==5) {d_af.setIcon(dot);}
		else if(x_anzeigen==6) {d_ag.setIcon(dot);}
		else if(x_anzeigen==7) {d_ah.setIcon(dot);}
		}
		if(y_anzeigen==1) {
			 if(x_anzeigen==0) {d_ba.setIcon(dot);}
		else if(x_anzeigen==1) {d_bb.setIcon(dot);}
		else if(x_anzeigen==2) {d_bc.setIcon(dot);}
		else if(x_anzeigen==3) {d_bd.setIcon(dot);}
		else if(x_anzeigen==4) {d_be.setIcon(dot);}
		else if(x_anzeigen==5) {d_bf.setIcon(dot);}
		else if(x_anzeigen==6) {d_bg.setIcon(dot);}
		else if(x_anzeigen==7) {d_bh.setIcon(dot);}
	}
		if(y_anzeigen==2) {
			 if(x_anzeigen==0) {d_ca.setIcon(dot);}
		else if(x_anzeigen==1) {d_cb.setIcon(dot);}
		else if(x_anzeigen==2) {d_cc.setIcon(dot);}
		else if(x_anzeigen==3) {d_cd.setIcon(dot);}
		else if(x_anzeigen==4) {d_ce.setIcon(dot);}
		else if(x_anzeigen==5) {d_cf.setIcon(dot);}
		else if(x_anzeigen==6) {d_cg.setIcon(dot);}
		else if(x_anzeigen==7) {d_ch.setIcon(dot);}
	}
		if(y_anzeigen==3) {
			 if(x_anzeigen==0) {d_da.setIcon(dot);}
		else if(x_anzeigen==1) {d_db.setIcon(dot);}
		else if(x_anzeigen==2) {d_dc.setIcon(dot);}
		else if(x_anzeigen==3) {d_dd.setIcon(dot);}
		else if(x_anzeigen==4) {d_de.setIcon(dot);}
		else if(x_anzeigen==5) {d_df.setIcon(dot);}
		else if(x_anzeigen==6) {d_dg.setIcon(dot);}
		else if(x_anzeigen==7) {d_dh.setIcon(dot);}
	}
		if(y_anzeigen==4) {
			 if(x_anzeigen==0) {d_ea.setIcon(dot);}
		else if(x_anzeigen==1) {d_eb.setIcon(dot);}
		else if(x_anzeigen==2) {d_ec.setIcon(dot);}
		else if(x_anzeigen==3) {d_ed.setIcon(dot);}
		else if(x_anzeigen==4) {d_ee.setIcon(dot);}
		else if(x_anzeigen==5) {d_ef.setIcon(dot);}
		else if(x_anzeigen==6) {d_eg.setIcon(dot);}
		else if(x_anzeigen==7) {d_eh.setIcon(dot);}
	}
		if(y_anzeigen==5) {
			 if(x_anzeigen==0) {d_fa.setIcon(dot);}
		else if(x_anzeigen==1) {d_fb.setIcon(dot);}
		else if(x_anzeigen==2) {d_fc.setIcon(dot);}
		else if(x_anzeigen==3) {d_fd.setIcon(dot);}
		else if(x_anzeigen==4) {d_fe.setIcon(dot);}
		else if(x_anzeigen==5) {d_ff.setIcon(dot);}
		else if(x_anzeigen==6) {d_fg.setIcon(dot);}
		else if(x_anzeigen==7) {d_fh.setIcon(dot);}
	}
		if(y_anzeigen==6) {
			 if(x_anzeigen==0) {d_ga.setIcon(dot);}
		else if(x_anzeigen==1) {d_gb.setIcon(dot);}
		else if(x_anzeigen==2) {d_gc.setIcon(dot);}
		else if(x_anzeigen==3) {d_gd.setIcon(dot);}
		else if(x_anzeigen==4) {d_ge.setIcon(dot);}
		else if(x_anzeigen==5) {d_gf.setIcon(dot);}
		else if(x_anzeigen==6) {d_gg.setIcon(dot);}
		else if(x_anzeigen==7) {d_gh.setIcon(dot);}
	}
		if(y_anzeigen==7) {
			 if(x_anzeigen==0) {d_ha.setIcon(dot);}
		else if(x_anzeigen==1) {d_hb.setIcon(dot);}
		else if(x_anzeigen==2) {d_hc.setIcon(dot);}
		else if(x_anzeigen==3) {d_hd.setIcon(dot);}
		else if(x_anzeigen==4) {d_he.setIcon(dot);}
		else if(x_anzeigen==5) {d_hf.setIcon(dot);}
		else if(x_anzeigen==6) {d_hg.setIcon(dot);}
		else if(x_anzeigen==7) {d_hh.setIcon(dot);}

		}
		

	if(Hilfsmethoden.FeldhatKoordianteAnStelle(FrontEnd.uifeld,arrayList.get(k))>=0) {
		if(y_anzeigen==0) {
			 if(x_anzeigen==0) {d_aa.setIcon(kreis);}
		else if(x_anzeigen==1) {d_ab.setIcon(kreis);}
		else if(x_anzeigen==2) {d_ac.setIcon(kreis);}
		else if(x_anzeigen==3) {d_ad.setIcon(kreis);}
		else if(x_anzeigen==4) {d_ae.setIcon(kreis);}
		else if(x_anzeigen==5) {d_af.setIcon(kreis);}
		else if(x_anzeigen==6) {d_ag.setIcon(kreis);}
		else if(x_anzeigen==7) {d_ah.setIcon(kreis);}
		}
		if(y_anzeigen==1) {
			 if(x_anzeigen==0) {d_ba.setIcon(kreis);}
		else if(x_anzeigen==1) {d_bb.setIcon(kreis);}
		else if(x_anzeigen==2) {d_bc.setIcon(kreis);}
		else if(x_anzeigen==3) {d_bd.setIcon(kreis);}
		else if(x_anzeigen==4) {d_be.setIcon(kreis);}
		else if(x_anzeigen==5) {d_bf.setIcon(kreis);}
		else if(x_anzeigen==6) {d_bg.setIcon(kreis);}
		else if(x_anzeigen==7) {d_bh.setIcon(kreis);}
	}
		if(y_anzeigen==2) {
			 if(x_anzeigen==0) {d_ca.setIcon(kreis);}
		else if(x_anzeigen==1) {d_cb.setIcon(kreis);}
		else if(x_anzeigen==2) {d_cc.setIcon(kreis);}
		else if(x_anzeigen==3) {d_cd.setIcon(kreis);}
		else if(x_anzeigen==4) {d_ce.setIcon(kreis);}
		else if(x_anzeigen==5) {d_cf.setIcon(kreis);}
		else if(x_anzeigen==6) {d_cg.setIcon(kreis);}
		else if(x_anzeigen==7) {d_ch.setIcon(kreis);}
	}
		if(y_anzeigen==3) {
			 if(x_anzeigen==0) {d_da.setIcon(kreis);}
		else if(x_anzeigen==1) {d_db.setIcon(kreis);}
		else if(x_anzeigen==2) {d_dc.setIcon(kreis);}
		else if(x_anzeigen==3) {d_dd.setIcon(kreis);}
		else if(x_anzeigen==4) {d_de.setIcon(kreis);}
		else if(x_anzeigen==5) {d_df.setIcon(kreis);}
		else if(x_anzeigen==6) {d_dg.setIcon(kreis);}
		else if(x_anzeigen==7) {d_dh.setIcon(kreis);}
	}
		if(y_anzeigen==4) {
			 if(x_anzeigen==0) {d_ea.setIcon(kreis);}
		else if(x_anzeigen==1) {d_eb.setIcon(kreis);}
		else if(x_anzeigen==2) {d_ec.setIcon(kreis);}
		else if(x_anzeigen==3) {d_ed.setIcon(kreis);}
		else if(x_anzeigen==4) {d_ee.setIcon(kreis);}
		else if(x_anzeigen==5) {d_ef.setIcon(kreis);}
		else if(x_anzeigen==6) {d_eg.setIcon(kreis);}
		else if(x_anzeigen==7) {d_eh.setIcon(kreis);}
	}
		if(y_anzeigen==5) {
			 if(x_anzeigen==0) {d_fa.setIcon(kreis);}
		else if(x_anzeigen==1) {d_fb.setIcon(kreis);}
		else if(x_anzeigen==2) {d_fc.setIcon(kreis);}
		else if(x_anzeigen==3) {d_fd.setIcon(kreis);}
		else if(x_anzeigen==4) {d_fe.setIcon(kreis);}
		else if(x_anzeigen==5) {d_ff.setIcon(kreis);}
		else if(x_anzeigen==6) {d_fg.setIcon(kreis);}
		else if(x_anzeigen==7) {d_fh.setIcon(kreis);}
	}
		if(y_anzeigen==6) {
			 if(x_anzeigen==0) {d_ga.setIcon(kreis);}
		else if(x_anzeigen==1) {d_gb.setIcon(kreis);}
		else if(x_anzeigen==2) {d_gc.setIcon(kreis);}
		else if(x_anzeigen==3) {d_gd.setIcon(kreis);}
		else if(x_anzeigen==4) {d_ge.setIcon(kreis);}
		else if(x_anzeigen==5) {d_gf.setIcon(kreis);}
		else if(x_anzeigen==6) {d_gg.setIcon(kreis);}
		else if(x_anzeigen==7) {d_gh.setIcon(kreis);}
	}
		if(y_anzeigen==7) {
			 if(x_anzeigen==0) {d_ha.setIcon(kreis);}
		else if(x_anzeigen==1) {d_hb.setIcon(kreis);}
		else if(x_anzeigen==2) {d_hc.setIcon(kreis);}
		else if(x_anzeigen==3) {d_hd.setIcon(kreis);}
		else if(x_anzeigen==4) {d_he.setIcon(kreis);}
		else if(x_anzeigen==5) {d_hf.setIcon(kreis);}
		else if(x_anzeigen==6) {d_hg.setIcon(kreis);}
		else if(x_anzeigen==7) {d_hh.setIcon(kreis);}
		}
		}
		}
	}
		

	public void dot_verstecken() {
		d_aa.setIcon(null);
		d_ab.setIcon(null);
		d_ac.setIcon(null);
		d_ad.setIcon(null);
		d_ae.setIcon(null);
		d_af.setIcon(null);
		d_ag.setIcon(null);
		d_ah.setIcon(null);
		
		d_ba.setIcon(null);
		d_bb.setIcon(null);
		d_bc.setIcon(null);
		d_bd.setIcon(null);
		d_be.setIcon(null);
		d_bf.setIcon(null);
		d_bg.setIcon(null);
		d_bh.setIcon(null);
		
		d_ca.setIcon(null);
		d_cb.setIcon(null);
		d_cc.setIcon(null);
		d_cd.setIcon(null);
		d_ce.setIcon(null);
		d_cf.setIcon(null);
		d_cg.setIcon(null);
		d_ch.setIcon(null);
		
		d_da.setIcon(null);
		d_db.setIcon(null);
		d_dc.setIcon(null);
		d_dd.setIcon(null);
		d_de.setIcon(null);
		d_df.setIcon(null);
		d_dg.setIcon(null);
		d_dh.setIcon(null);
		
		d_ea.setIcon(null);
		d_eb.setIcon(null);
		d_ec.setIcon(null);
		d_ed.setIcon(null);
		d_ee.setIcon(null);
		d_ef.setIcon(null);
		d_eg.setIcon(null);
		d_eh.setIcon(null);
		
		d_fa.setIcon(null);
		d_fb.setIcon(null);
		d_fc.setIcon(null);
		d_fd.setIcon(null);
		d_fe.setIcon(null);
		d_ff.setIcon(null);
		d_fg.setIcon(null);
		d_fh.setIcon(null);
		
		d_ga.setIcon(null);
		d_gb.setIcon(null);
		d_gc.setIcon(null);
		d_gd.setIcon(null);
		d_ge.setIcon(null);
		d_gf.setIcon(null);
		d_gg.setIcon(null);
		d_gh.setIcon(null);
		
		d_ha.setIcon(null);
		d_hb.setIcon(null);
		d_hc.setIcon(null);
		d_hd.setIcon(null);
		d_he.setIcon(null);
		d_hf.setIcon(null);
		d_hg.setIcon(null);
		d_hh.setIcon(null);
	}
}
