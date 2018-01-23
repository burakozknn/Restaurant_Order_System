import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.CardLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Mojito extends JPanel {
	
	JList list;

	/**
	 * Create the panel.
	 * @param pnlCenter 
	 * @param card 
	 */
	public Mojito(JList list, CardLayout card, JPanel pnlCenter) {
		
	
		
		
		
		setLayout(new GridLayout(2, 3, 20, 20));
		
		JButton button = new JButton("Strawberry");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<String> model = (DefaultListModel<String>)list.getModel();
				String[] arr = {button.getText(), " ", "$", "10"};
				model.addElement(arr[0] +arr[1] + arr[2] + arr[3]);
			}
		});
		add(button);
		
		JButton button_1 = new JButton("Blackberry");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<String> model = (DefaultListModel<String>)list.getModel();
				String[] arr = {button_1.getText(), " ", "$", "10"};
				model.addElement(arr[0] +arr[1] + arr[2] + arr[3]);
			}
		});
		add(button_1);
		
		JButton button_2 = new JButton("Raspberry");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<String> model = (DefaultListModel<String>)list.getModel();
				String[] arr = {button_2.getText(), " ", "$", "10"};
				model.addElement(arr[0] +arr[1] + arr[2] + arr[3]);
			}
		});
		add(button_2);
		
		JButton button_3 = new JButton("Classic");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<String> model = (DefaultListModel<String>)list.getModel();
				String[] arr = {button_3.getText(), " ", "$", "10"};
				model.addElement(arr[0] +arr[1] + arr[2] + arr[3]);
			}
		});
		add(button_3);
		
		JButton button_4 = new JButton("Cucumber");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<String> model = (DefaultListModel<String>)list.getModel();
				String[] arr = {button_4.getText(), " ", "$", "10"};
				model.addElement(arr[0] +arr[1] + arr[2] + arr[3]);
			}
		});
		add(button_4);
		
		JButton button_5 = new JButton("Mango");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<String> model = (DefaultListModel<String>)list.getModel();
				String[] arr = {button_5.getText(), " ", "$", "10"};
				model.addElement(arr[0] +arr[1] + arr[2] + arr[3]);
			}
		});
		add(button_5);

	}

}
