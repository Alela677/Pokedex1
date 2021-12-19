package Models;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Usuario {
	// Propiedades

	private String Usuario;
	private String Password;

	// Contructor

	public Usuario(String usuario, String password) {
		this.Usuario = usuario;
		this.Password = password;
	}

	public Usuario(JTextField textUsuario, JPasswordField passwordField) {
		// TODO Auto-generated constructor stub
	}

	// Getter y setter

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	// ToString
	@Override
	public String toString() {
		return "Usuario [Usuario=" + Usuario + ", Password=" + Password + "]";
	}

}
