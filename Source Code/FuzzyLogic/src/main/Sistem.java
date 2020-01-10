package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import membershipFunction.Value;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Sistem {

	private JFrame frame;
	private JTextField inCO, inSO, inPM;
	public static String hasil;
	public static String z;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sistem window = new Sistem();
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
	public Sistem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 393, 373);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 387, 67);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblSistemPengecekanKelayakan = new JLabel("SISTEM PENGECEKAN KELAYAKAN UDARA");
		lblSistemPengecekanKelayakan.setForeground(Color.WHITE);
		lblSistemPengecekanKelayakan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSistemPengecekanKelayakan.setBounds(17, 0, 350, 65);
		panel.add(lblSistemPengecekanKelayakan);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(0, 67, 223, 277);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblKeputusan = new JLabel("Keputusan");
		lblKeputusan.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblKeputusan.setBounds(260, 179, 71, 23);
		frame.getContentPane().add(lblKeputusan);
		
		JLabel lblDefuzzifikasi = new JLabel("Defuzzifikasi");
		lblDefuzzifikasi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDefuzzifikasi.setBounds(260, 109, 84, 23);
		frame.getContentPane().add(lblDefuzzifikasi);
		
		JLabel lblHasil = new JLabel("");
		lblHasil.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblHasil.setBounds(260, 142, 104, 23);
		frame.getContentPane().add(lblHasil);
		
		JLabel lblKelayakan = new JLabel("");
		lblKelayakan.setVerticalAlignment(SwingConstants.TOP);
		lblKelayakan.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblKelayakan.setBounds(260, 206, 117, 31);
		frame.getContentPane().add(lblKelayakan);
		
		JLabel InputCOLb = new JLabel("Masukkan kadar CO (0-34) g/m3 :");
		InputCOLb.setFont(new Font("Tahoma", Font.PLAIN, 10));
		InputCOLb.setBounds(23, 33, 200, 14);
		panel_1.add(InputCOLb);
		
		inCO = new JTextField();
		inCO.setBounds(23, 58, 171, 20);
		panel_1.add(inCO);
		inCO.setColumns(10);
				
		JLabel InputSO2Lb = new JLabel("Masukkan kadar SO2 (0-1600) g/m3 :");
		InputSO2Lb.setFont(new Font("Tahoma", Font.PLAIN, 10));
		InputSO2Lb.setBounds(23, 94, 200, 14);
		panel_1.add(InputSO2Lb);
		
		inSO = new JTextField();
		inSO.setColumns(10);
		inSO.setBounds(23, 119, 171, 20);
		panel_1.add(inSO);
		
		JLabel InputPM10Lb = new JLabel("Masukkan kadar PM10 (0-420) g/m3 :");
		InputPM10Lb.setFont(new Font("Tahoma", Font.PLAIN, 10));
		InputPM10Lb.setBounds(23, 150, 200, 14);
		panel_1.add(InputPM10Lb);
		
		inPM = new JTextField();
		inPM.setColumns(10);
		inPM.setBounds(23, 175, 171, 20);
		panel_1.add(inPM);
		inPM.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					Double co = null;
					Double so = null;
					Double pm = null;
					try{
						co = Double.parseDouble(inCO.getText());
						so = Double.parseDouble(inSO.getText());
						pm = Double.parseDouble(inPM.getText());
					}catch(NumberFormatException ae) {
						JOptionPane.showMessageDialog(null, "Input tidak boleh kosong!");
						co = null;
						so = null;
						pm = null;
					}catch(NullPointerException np) {
						
					}
					
					Value.value(co, so, pm);
					lblHasil.setText(z);
					lblKelayakan.setText(hasil);
				}
			}
		});

		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Double co = null;
				Double so = null;
				Double pm = null;
				co = Double.parseDouble(inCO.getText());
				so = Double.parseDouble(inSO.getText());
				pm = Double.parseDouble(inPM.getText());
				

				if(co.equals(null) || so.equals(null) || pm.equals(null)) {
					JOptionPane.showMessageDialog(null, "Input tidak boleh kosong");
				}
				
				Value.value(co, so, pm);
				lblHasil.setText(z);
				lblKelayakan.setText(hasil);
				
			}
		});
		btnSubmit.setBounds(60, 225, 89, 23);
		panel_1.add(btnSubmit);
	}
}
