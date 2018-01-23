import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

import java.awt.Dimension;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;

import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Component;
import java.awt.Point;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.TimeZone;

import javax.swing.JComboBox;

import java.awt.Rectangle;
import java.awt.Font;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;


public class FrmMain extends JFrame{

	private JPanel contentPane;
	CardLayout card;
	
	private PnlDinner pnlDinner;
	private PnlBar pnlBar;
	private PnlBeer pnlBeer;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmMain frame = new FrmMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		FlowLayout fl_panel = new FlowLayout();
		fl_panel.setAlignment(FlowLayout.LEFT);
		fl_panel.setVgap(6);
		fl_panel.setHgap(9);
		panel.setLayout(fl_panel);
		
		String[] table = new String[] {"Open Table","Table 1","Table 2","Table 3","Table 4","Table 5","Table 6","Table 7","Table 8"
				,"Table 9","Table 10"};
		
		JComboBox comboBox = new JComboBox(table);
		comboBox.setMinimumSize(new Dimension(80, 10));
		comboBox.setFont(comboBox.getFont().deriveFont(16f));
		comboBox.setPreferredSize(new Dimension(125, 20));
		panel.add(comboBox);
		
		
		
		JButton btnBar = new JButton("Bar");
		btnBar.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnBar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnBar.setIconTextGap(1);
		btnBar.setMargin(new Insets(1, 1, 1, 1));

		btnBar.setBounds(0, 0,244, 23);
		btnBar.setIcon(new ImageIcon(this.getClass().getResource("/indir.jpg")));
		panel.add(btnBar);
		
		
		JButton button_1 = new JButton("Dinner");
		
		button_1.setHorizontalTextPosition(SwingConstants.CENTER);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		button_1.setMargin(new Insets(1, 1, 1, 1));
		button_1 .setIcon(new ImageIcon(this.getClass().getResource("/indir11.png")));
		
		
		button_1.setBounds(0, 0, 50, 23);
		panel.add(button_1);
		
		
		
		 
		JList list = new JList(new DefaultListModel<String>());
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setVisibleRowCount(4);
		list.setBackground(new Color(255, 255, 224));
		list.setPreferredSize(new Dimension(24, 16));
		list.setMinimumSize(new Dimension(50, 16));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(UIManager.getBorder("Button.border"));
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setPreferredSize(new Dimension(175, 60));
		contentPane.add(scrollPane, BorderLayout.EAST);
		scrollPane.setViewportView(list);
		
		
		JPanel pnlCenter = new JPanel();
		pnlCenter.setMaximumSize(new Dimension(32000, 32000));
		pnlCenter.setPreferredSize(new Dimension(5, 5));
		pnlCenter.setAlignmentX(Component.LEFT_ALIGNMENT);
		contentPane.add(pnlCenter, BorderLayout.CENTER);
		
		
		
		
		card =new CardLayout();
		pnlCenter.setLayout(card);
		
		
		pnlBar = new PnlBar(list, card, pnlCenter);
		pnlCenter.add(pnlBar, "PnlBar");		
		
		pnlDinner = new PnlDinner(list, card, pnlCenter);
		pnlCenter.add(pnlDinner, "PnlDinner");			
		
		pnlBeer = new PnlBeer(list);
		pnlCenter.add(pnlBeer, "PnlBeer");
		
		Mojito mojito = new Mojito(list, card , pnlCenter);
		pnlCenter.add(mojito, "Mojito");
		
		PnlRaki pnlRaki = new PnlRaki(list, card, pnlCenter);
		pnlCenter.add(pnlRaki,"PnlRaki");
		
		
		PnlSoft pnlsoft = new PnlSoft(list, card, pnlCenter);
		pnlCenter.add(pnlsoft,"PnlSoft");
		
		PnlSpecial pnlSpecial = new PnlSpecial(list, card, pnlCenter);
		pnlCenter.add(pnlSpecial,"PnlSpecial");
		
		PnlWhisky pnlWhisky = new PnlWhisky(list, card, pnlCenter);
		pnlCenter.add(pnlWhisky,"PnlWhisky");
		
		PnlVodka pnlVodka  = new PnlVodka (list,card,pnlCenter);
		pnlCenter.add(pnlVodka ,"PnlVodka");
		
		PnlTequilla pnlTequilla = new PnlTequilla(list, card, pnlCenter);
		pnlCenter.add(pnlTequilla,"PnlTequilla");
		
		PnlHappy pnlHappy = new PnlHappy(list, card, pnlCenter);
		pnlCenter.add(pnlHappy,"PnlHappy");
		
		PnlVeggie pnlVeggie = new PnlVeggie(list, card, pnlCenter);
		pnlCenter.add(pnlVeggie,"PnlVeggie");
		
		PnlSea pnlSea = new PnlSea(list, card, pnlCenter);
		pnlCenter.add(pnlSea,"PnlSea");
		
		PnlLand PnlLand = new PnlLand(list, card, pnlCenter);
		pnlCenter.add(PnlLand,"PnlLand");
		
		PnlDessert pnlDessert = new PnlDessert(list, card, pnlCenter);
		pnlCenter.add(pnlDessert,"PnlDessert");
		
		
		
		
		
		
		
		
		
		
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton buttonOrder = new JButton("Order");		
		buttonOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Your order has been sent to the kitchen");
			}
		});
		
		
		buttonOrder.setMargin(new Insets(15, 14, 15, 14));
		panel_1.add(buttonOrder);
		
		JButton buttonCheckout = new JButton("Check Out");		
		buttonCheckout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.out.println(comboBox.getSelectedItem() + "  " +  "Checkout :" + list.getModel() + "\n" );
				JOptionPane.showMessageDialog(null, comboBox.getSelectedItem() + "  " +  "Checkout :"  + list.getModel());
			}
		});
		buttonCheckout.setMargin(new Insets(15, 14, 15, 14));
		panel_1.add(buttonCheckout);
		
		JButton correction = new JButton("Correction");
		correction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Component frame = null;
				if (list.getSelectedIndex() == -1){
					JOptionPane.showMessageDialog(null, "oppss ! You should select item.");
				}
					//model.removeElementAt(list.getSelectedIndex()); 
				
				
				
				
				if (list.getSelectedIndex() != -1 ){
					int n = JOptionPane.showConfirmDialog(
						    frame,
						    "Would you like to remove the item ?",
						    "Warning !",
						    JOptionPane.YES_NO_OPTION);
					if (n == JOptionPane.YES_OPTION) {
						DefaultListModel model = (DefaultListModel)list.getModel();
						model.removeElementAt(list.getSelectedIndex()); 
						
					} else if (n == JOptionPane.NO_OPTION) {
					    return;
					}
				}
				
				
				//DefaultListModel model = (DefaultListModel)list.getModel();
				//model.removeElementAt(list.getSelectedIndex()); 
				//if (list.getSelectedIndex() != -1){
				 // model.removeElementAt(list.getSelectedIndex()); 
				//}
			}
		});
		correction.setMargin(new Insets(15, 14, 15, 14));
		panel_1.add(correction);
		
		JButton logout = new JButton("Logout");
		
		logout.setMargin(new Insets(15, 14, 15, 14));
		panel_1.add(logout);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		SimpleDateFormat dateTimeInGMT = new SimpleDateFormat("yyyy-MMM-dd hh:mm:ss aa");
		//Setting the time zone
		dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("GMT"));
		lblNewLabel.setText(dateTimeInGMT.format(new Date()));
		panel_1.add(lblNewLabel);
		
		
		
		
		
		
		
		

		 
		btnBar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				card.show(pnlCenter, "PnlBar");
			}
		});	
		
		btnBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				card.show(pnlCenter, "PnlBar");
			}
		});
		
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				card.show(pnlCenter, "PnlDinner");
			}
		});	
		
		button_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				card.show(pnlCenter, "PnlDinner");
			}
		});
		
		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		
		
		
		
		
		
		
	}

}
