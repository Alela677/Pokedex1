package Models;

import Enum.Tipo;

public class Pokémon {

	private int numero;
	private String nombre;
	private Tipo tipo;
	private double altura;
	private double peso;
	private String categoria;
	private String habilidad;

	// Constructor
	public Pokémon(int numero, String nombre, Tipo tipo, double altura, double peso, String categoria,
			String habilidad) {
		this.numero = numero;
		this.nombre = nombre;
		this.tipo = tipo;
		this.altura = altura;
		this.peso = peso;
		this.categoria = categoria;
		this.habilidad = habilidad;
	}

	// Getter y setter

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	// Metodos

	// ToString
	@Override
	public String toString() {
		return "Pokémon [numero=" + numero + ", nombre=" + nombre + ", tipo=" + tipo + ", altura=" + altura + ", peso="
				+ peso + ", categoria=" + categoria + ", habilidad=" + habilidad + "]";
	}

}
