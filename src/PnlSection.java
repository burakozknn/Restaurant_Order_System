import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Dimension;


public class PnlSection extends JPanel {
	
	//JList list;

	/**
	 * Create the panel.
	 */
	public PnlSection() {
		
		
		
		setPreferredSize(new Dimension(338, 129));
		setLayout(new GridLayout(2, 3, 10, 10));
		
		JButton button = new JButton("Efes Pilsener");
		add(button);
		
		JButton button_1 = new JButton("Efes Dark");
		add(button_1);
		
		JButton button_2 = new JButton("Corona");
		add(button_2);
		
		JButton button_3 = new JButton("Blue Moon");
		add(button_3);
		
		JButton button_4 = new JButton("Samuel Adams");
		add(button_4);
		
		JButton button_5 = new JButton("Miller Light");
		add(button_5);
		
		

	}

}
