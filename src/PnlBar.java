import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.GridLayout;

import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.SwingConstants;
import javax.swing.UIManager;


public class PnlBar extends JPanel {

	
	JList list;
	
	
	
	/**
	 * Create the panel.
	 * @param pnlCenter 
	 * @param card 
	 * @param list 
	 */
	public PnlBar(JList lst, CardLayout card, JPanel pnlCenter) {
		list = lst;
		setLayout(new GridLayout(3, 3, 20, 20));
		
		
		
		JButton buttonbeer = new JButton("Beer");
		buttonbeer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				card.show(pnlCenter, "PnlBeer");
				
			}
		});
		
		buttonbeer.setBackground(UIManager.getColor("Button.background"));
		
		
		add(buttonbeer);
		
		JButton buttonMojito = new JButton("Mojito");		
		buttonMojito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				card.show(pnlCenter,"Mojito");
			}
		});
		
		add(buttonMojito);
		
		
		
		JButton raki = new JButton("Raki");
		add(raki);

		JButton softDrink = new JButton("Soft drink");
		softDrink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(pnlCenter,"PnlSoft");
			}
		});
		softDrink.setBackground(UIManager.getColor("Button.background"));
		add(softDrink);

		
		JButton special = new JButton("Specials");
		special.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(pnlCenter,"PnlSpecial");
			}
		});
		add(special);
		
		
		
		JButton whisky = new JButton("Whisky");
		whisky.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(pnlCenter,"PnlWhisky");
			}
		});
		add(whisky);
		

		
		JButton btnvodka = new JButton("Vodka");		
		btnvodka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				card.show(pnlCenter, "PnlVodka");
			}
		});
		
		add(btnvodka);

		
		JButton tequilla = new JButton("Tequilla");
		tequilla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(pnlCenter,"PnlTequilla");
			}
		});
		add(tequilla);

		
		JButton happyOur = new JButton("Happy Hour");
		happyOur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Happy Hour is in between 4 - 7 p.m");
				card.show(pnlCenter,"PnlHappy");
				
			}
		});
		add(happyOur);
		
		
		raki.setBackground(UIManager.getColor("Button.background"));
		raki.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				card.show(pnlCenter, "PnlRaki");
				
				 
								
			}
		});
		
		
		
		


	}

}
