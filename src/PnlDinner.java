import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PnlDinner extends JPanel {
	
	JList list;

	/**
	 * Create the panel.
	 */
	public PnlDinner(JList lst, CardLayout card, JPanel pnlCenter) {
		setPreferredSize(new Dimension(230, 199));
		setLayout(new GridLayout(2, 2, 2, 2));
		
		JButton button = new JButton("Veggie");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(pnlCenter,"PnlVeggie");
			}
		});
		add(button);
		
		JButton button_1 = new JButton("Land");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(pnlCenter,"PnlLand");
			}
		});
		add(button_1);
		
		JButton button_2 = new JButton("Dessert");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(pnlCenter,"PnlDessert");
			}
		});
		add(button_2);
		
		JButton button_3 = new JButton("Sea");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(pnlCenter,"PnlSea");
				
			}
		});
		add(button_3);

	}

}
