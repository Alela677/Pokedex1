package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Models.Usuario;
import Utils.Almacen;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Registro {

	private JFrame frameRegistro;
	private JTextField textUsuario;
	private JPasswordField passwordField;

	/**
	 * Create the application.
	 */
	public Registro() {
		initialize();
		this.frameRegistro.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameRegistro = new JFrame();
		frameRegistro.setTitle("Registro");
		frameRegistro.setIconImage(
				Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alejandro\\OneDrive\\Escritorio\\bola.png"));
		frameRegistro.setBounds(100, 100, 522, 349);
		frameRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameRegistro.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Nombre de usuario");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 92, 112, 14);
		frameRegistro.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 162, 112, 14);
		frameRegistro.getContentPane().add(lblNewLabel_1);

		textUsuario = new JTextField();
		textUsuario.addKeyListener(new KeyAdapter() {});
		textUsuario.setBounds(132, 89, 120, 20);
		frameRegistro.getContentPane().add(textUsuario);
		textUsuario.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("\u00BFComo te llamas entrenador?");
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNewLabel_2.setBounds(10, 11, 252, 45);
		frameRegistro.getContentPane().add(lblNewLabel_2);

		passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					String usuario = textUsuario.getText();
					String password = new String(passwordField.getText());;
					
					Almacen.Usuarios.add(new Usuario(usuario, password));
					JOptionPane.showMessageDialog(passwordField, "Usuario registrado");
					frameRegistro.dispose();
					new LoginView();
				}
			}
		});
		passwordField.setBounds(132, 160, 120, 20);
		frameRegistro.getContentPane().add(passwordField);

		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Alejandro\\OneDrive\\Escritorio\\th (2).jpg"));
		lblNewLabel_3.setBounds(273, 0, 233, 310);
		frameRegistro.getContentPane().add(lblNewLabel_3);

		JButton btnNewButton = new JButton("Registrate");
		btnNewButton.setBounds(80, 215, 112, 23);
		frameRegistro.getContentPane().add(btnNewButton);

	}
}
