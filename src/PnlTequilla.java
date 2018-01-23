import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.CardLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PnlTequilla extends JPanel {
	
	JList list;

	/**
	 * Create the panel.
	 */
	public PnlTequilla(JList lst, CardLayout card, JPanel pnlCenter) {
		
		list = lst;
		
		setLayout(new GridLayout(2, 3, 20, 20));
		
		JButton button = new JButton("House");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<String> model = (DefaultListModel<String>)list.getModel();				
				model.addElement(button.getText() + " " +  "5 TL ");
			}
		});
		add(button);
		
		JButton button_1 = new JButton("Hendrick");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<String> model = (DefaultListModel<String>)list.getModel();				
				model.addElement(button_1.getText() + " " +  "5 TL ");
			}
		});
		add(button_1);
		
		JButton button_2 = new JButton("Bombay");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<String> model = (DefaultListModel<String>)list.getModel();				
				model.addElement(button_2.getText() + " " +  "5 TL ");
			}
		});
		add(button_2);
		
		JButton button_3 = new JButton("Tenqurey");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<String> model = (DefaultListModel<String>)list.getModel();				
				model.addElement(button_3.getText() + " " +  "5 TL ");
			}
		});
		add(button_3);
		
		JButton button_4 = new JButton("Shot");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<String> model = (DefaultListModel<String>)list.getModel();				
				model.addElement(button_4.getText() + " " +  "5 TL ");
			}
		});
		add(button_4);
		
		JButton button_5 = new JButton("Tenqurey 14");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<String> model = (DefaultListModel<String>)list.getModel();				
				model.addElement(button_5.getText() + " " +  "5 TL ");
			}
		});
		add(button_5);

	}



	


	




	}


