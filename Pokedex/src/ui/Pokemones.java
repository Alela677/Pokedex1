package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Toolkit;

public class Pokemones {

	private JFrame framePokemones;

	public Pokemones() {
		initialize();
		this.framePokemones.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		framePokemones = new JFrame();
		framePokemones.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alejandro\\OneDrive\\Escritorio\\bola.png"));
		framePokemones.setTitle("Pok\u00E9mon");
		framePokemones.setBounds(100, 100, 450, 300);
		framePokemones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framePokemones.getContentPane().setLayout(null);
		
		JLabel lblPokemon = new JLabel("Pokemones");
		lblPokemon.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblPokemon.setBounds(40, 28, 137, 38);
		framePokemones.getContentPane().add(lblPokemon);
	}

}
