import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.CardLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PnlSoft extends JPanel {
	
	JList list;

	/**
	 * Create the panel.
	 */
	public PnlSoft(JList lst, CardLayout card, JPanel pnlCenter) {
		list = lst;
		
		
		setLayout(new GridLayout(2, 3, 20, 20));
		
		JButton button = new JButton("Coke");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<String> model = (DefaultListModel<String>)list.getModel();				
				model.addElement(button.getText() + " " +  "5 TL ");
			}
		});
		add(button);
		
		JButton button_1 = new JButton("Diet Coke");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<String> model = (DefaultListModel<String>)list.getModel();				
				model.addElement(button_1.getText() + " " +  "5 TL ");
			}
		});
		add(button_1);
		
		JButton button_2 = new JButton("Sprite");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<String> model = (DefaultListModel<String>)list.getModel();				
				model.addElement(button_2.getText() + " " +  "5 TL ");
			}
		});
		add(button_2);
		
		JButton button_3 = new JButton("Club Soda");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<String> model = (DefaultListModel<String>)list.getModel();				
				model.addElement(button_3.getText() + " " +  "5 TL ");
			}
		});
		add(button_3);
		
		JButton button_4 = new JButton("Lemonate");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<String> model = (DefaultListModel<String>)list.getModel();				
				model.addElement(button_4.getText() + " " +  "5 TL ");
			}
		});
		add(button_4);
		
		JButton button_5 = new JButton("Orange Juice");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<String> model = (DefaultListModel<String>)list.getModel();				
				model.addElement(button_5.getText() + " " +  "5 TL ");
			}
		});
		add(button_5);

	}



	}


