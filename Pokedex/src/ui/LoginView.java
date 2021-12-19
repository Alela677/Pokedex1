package ui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import Models.Usuario;
import Utils.Almacen;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Component;
import java.awt.SystemColor;
import javax.swing.JEditorPane;
import javax.swing.ImageIcon;

public class LoginView {

	private JFrame frmLogin;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the application.
	 */
	public LoginView() {
		initialize();
		this.frmLogin.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setForeground(Color.WHITE);
		frmLogin.setBackground(SystemColor.desktop);
		frmLogin.setIconImage(
				Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alejandro\\OneDrive\\Escritorio\\bola.png"));
		setUIComponents();
	}

	private void setUIComponents() {

		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 532, 356);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel.setBounds(122, 31, 99, 29);
		frmLogin.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblNewLabel_1.setBounds(21, 88, 46, 14);
		frmLogin.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Contrase\u00F1a");
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblNewLabel_2.setBounds(21, 152, 67, 14);
		frmLogin.getContentPane().add(lblNewLabel_2);

		textField = new JTextField();
		textField.setBounds(97, 86, 124, 20);
		frmLogin.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					
					String username = textField.getText();
					String password = new String(textField_1.getText());

					if (username.equalsIgnoreCase(Almacen.Usuario) && password.equalsIgnoreCase(Almacen.Password)) {

						JOptionPane.showMessageDialog(textField_1, "Login correcto");

					} else {
						JOptionPane.showMessageDialog(textField_1, "Login incorrecto");
					}

				}
			}
		});
		textField_1.setBounds(98, 150, 122, 20);
		frmLogin.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = textField.getText();
				String password = new String(textField_1.getText());

				if (username.equalsIgnoreCase(Almacen.Usuario) && password.equalsIgnoreCase(Almacen.Password)) {

					JOptionPane.showMessageDialog(btnNewButton, "Login correcto");
					frmLogin.dispose();
					new Pokemones();

				} else {
					JOptionPane.showMessageDialog(btnNewButton, "Login incorrecto");
				}

			}
		});
		btnNewButton.setBounds(24, 214, 89, 23);
		frmLogin.getContentPane().add(btnNewButton);

		JLabel lblNewLabel_3 = new JLabel("Imagen Login");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Alejandro\\OneDrive\\Escritorio\\po.jpg"));
		lblNewLabel_3.setBounds(308, 0, 208, 317);
		frmLogin.getContentPane().add(lblNewLabel_3);

		JButton btnNewButton_1 = new JButton("Registrarse");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frmLogin.dispose();
				new Registro();

			}
		});
		btnNewButton_1.setBounds(132, 214, 102, 23);
		frmLogin.getContentPane().add(btnNewButton_1);

	}
}