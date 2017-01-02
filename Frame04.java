import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.JSlider;

public class Frame04 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame04 window = new Frame04();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame04() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(240, 240, 240));
		frame.setBounds(100, 100, 840, 594);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(10, 35, 224, 248);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(10, 315, 179, 229);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_2.setBounds(199, 315, 615, 229);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JSlider slider = new JSlider();
		slider.setMajorTickSpacing(5);
		slider.setBounds(10, 13, 31, 152);
		slider.setPaintTicks(true);
		slider.setOrientation(SwingConstants.VERTICAL);
		panel_2.add(slider);
		
		JSlider slider_1 = new JSlider();
		slider_1.setMajorTickSpacing(5);
		slider_1.setPaintTicks(true);
		slider_1.setBounds(10, 192, 181, 26);
		panel_2.add(slider_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_3.setBounds(529, 35, 285, 248);
		frame.getContentPane().add(panel_3);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 11, 96, 25);
		frame.getContentPane().add(panel_5);
		
		JLabel lblNewLabel = new JLabel("Drone Status");
		panel_5.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(529, 11, 42, 25);
		frame.getContentPane().add(panel_4);
		
		JLabel lblNewLabel_3 = new JLabel("GPS\r\n");
		panel_4.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 12));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_8.setBounds(244, 35, 273, 248);
		frame.getContentPane().add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(244, 11, 88, 25);
		frame.getContentPane().add(panel_9);
		
		JLabel lblDroneControl = new JLabel("Drone Control");
		lblDroneControl.setFont(new Font("Arial", Font.BOLD, 12));
		panel_9.add(lblDroneControl);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(633, 287, 181, 29);
		frame.getContentPane().add(panel_7);
		panel_7.setBorder(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("3D Mapping");
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnNewRadioButton.setFont(new Font("Arial", Font.BOLD, 10));
		panel_7.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Aerial View\r\n");
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnNewRadioButton_1.setVerticalAlignment(SwingConstants.TOP);
		rdbtnNewRadioButton_1.setFont(new Font("Arial", Font.BOLD, 10));
		panel_7.add(rdbtnNewRadioButton_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(10, 287, 107, 25);
		frame.getContentPane().add(panel_6);
		
		JLabel lblNewLabel_1 = new JLabel("Sensor Readings");
		panel_6.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(199, 287, 42, 25);
		frame.getContentPane().add(panel_10);
		
		JLabel lblNewLabel_2 = new JLabel("Visuals");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		panel_10.add(lblNewLabel_2);
	}
}
