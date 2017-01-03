import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

public class Frame06 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame06 window = new Frame06();
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
	public Frame06() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1250, 585);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JPanel panel = new JPanel();
 		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
 		panel.setBounds(10, 35, 343, 204);
 		frame.getContentPane().add(panel);
 		frame.setResizable(false);
 		
 		JPanel panel_1 = new JPanel();
 		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
 		panel_1.setBounds(10, 267, 176, 262);
 		frame.getContentPane().add(panel_1);
 		
 		JPanel panel_2 = new JPanel();
 		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
 		panel_2.setBounds(235, 267, 474, 220);
 		frame.getContentPane().add(panel_2);
 		panel_2.setLayout(null);
 		
 		JPanel panel_3 = new JPanel();
 		panel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
 		panel_3.setBounds(878, 35, 346, 204);
 		frame.getContentPane().add(panel_3);
 		
 		JPanel panel_5 = new JPanel();
 		panel_5.setBounds(10, 11, 86, 25);
 		frame.getContentPane().add(panel_5);
 		
 		JLabel lblNewLabel = new JLabel("Drone Status");
 		panel_5.add(lblNewLabel);
 		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
 		
 		JPanel panel_4 = new JPanel();
 		panel_4.setBounds(878, 11, 31, 25);
 		frame.getContentPane().add(panel_4);
 		
 		JLabel lblNewLabel_3 = new JLabel("GPS\r\n");
 		panel_4.add(lblNewLabel_3);
 		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 12));
 		
 		JPanel panel_8 = new JPanel();
 		panel_8.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
 		panel_8.setBounds(363, 35, 505, 204);
 		frame.getContentPane().add(panel_8);
 		
 		JPanel panel_9 = new JPanel();
 		panel_9.setBounds(363, 11, 86, 25);
 		frame.getContentPane().add(panel_9);
 		
 		JLabel lblDroneControl = new JLabel("Drone Control");
 		lblDroneControl.setFont(new Font("Arial", Font.BOLD, 12));
 		panel_9.add(lblDroneControl);
 		
 		JPanel panel_6 = new JPanel();
 		panel_6.setBounds(10, 237, 107, 25);
 		frame.getContentPane().add(panel_6);
 		
 		JLabel lblNewLabel_1 = new JLabel("Sensor Readings");
 		panel_6.add(lblNewLabel_1);
 		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
 		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
 		
 		JPanel panel_7 = new JPanel();
 		panel_7.setLayout(null);
 		panel_7.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
 		panel_7.setBounds(719, 267, 505, 262);
 		frame.getContentPane().add(panel_7);
 		
 		JSlider slider = new JSlider();
 		slider.setValue(25);
 		slider.setMaximum(50);
 		slider.setBounds(196, 267, 31, 228);
 		frame.getContentPane().add(slider);
 		slider.setMajorTickSpacing(5);
 		slider.setPaintTicks(true);
 		slider.setOrientation(SwingConstants.VERTICAL);
 		
 		JPanel panel_10 = new JPanel();
 		panel_10.setBounds(235, 237, 74, 25);
 		frame.getContentPane().add(panel_10);
 		
 		JLabel lblNewLabel_2 = new JLabel("Aerial View");
 		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
 		panel_10.add(lblNewLabel_2);
 		
 		JPanel panel_11 = new JPanel();
 		panel_11.setBounds(235, 484, 474, 64);
 		frame.getContentPane().add(panel_11);
 		panel_11.setLayout(null);
 		
 		JSlider slider_1 = new JSlider();
 		slider_1.setValue(25);
 		slider_1.setMaximum(50);
 		slider_1.setBounds(0, 25, 239, 28);
 		panel_11.add(slider_1);
 		slider_1.setMajorTickSpacing(5);
 		slider_1.setPaintTicks(true);
 		
 		JSlider slider_2 = new JSlider();
 		slider_2.setValue(25);
 		slider_2.setMaximum(50);
 		slider_2.setPaintTicks(true);
 		slider_2.setMajorTickSpacing(5);
 		slider_2.setBounds(235, 25, 239, 28);
 		panel_11.add(slider_2);
 		
 		JLabel lblPan = new JLabel("Pan");
 		lblPan.setFont(new Font("Arial", Font.BOLD, 12));
 		lblPan.setBounds(109, 0, 22, 15);
 		panel_11.add(lblPan);
 		
 		JLabel lblZoom = new JLabel("Zoom");
 		lblZoom.setFont(new Font("Arial", Font.BOLD, 12));
 		lblZoom.setBounds(339, 0, 32, 15);
 		panel_11.add(lblZoom);
 		
 		JPanel panel_12 = new JPanel();
 		panel_12.setBounds(719, 237, 74, 25);
 		frame.getContentPane().add(panel_12);
 		
 		JLabel lbldmapping = new JLabel("3D-Mapping");
 		lbldmapping.setFont(new Font("Arial", Font.BOLD, 12));
 		panel_12.add(lbldmapping);
 		
 		JLabel lblTilt = new JLabel("Tilt");
 		lblTilt.setFont(new Font("Arial", Font.BOLD, 12));
 		lblTilt.setBounds(206, 497, 22, 15);
 		frame.getContentPane().add(lblTilt);
	}
}
