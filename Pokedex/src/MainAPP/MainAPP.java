package MainAPP;

import java.util.ArrayList;

import Enum.Tipo;
import Models.Pok�mon;

import Utils.Almacen;
import ui.LoginView;

public class MainAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Almacen.Pok�mon.add(new Pok�mon(1, "Charmander", Tipo.Fuego, 1.2, 23.4, "Categoria", "Derrite cosas"));

		new LoginView();
		
		
		
		
	}
	

}
