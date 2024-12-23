package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Dominio.Casas;
import Interface.Metodos;

public class LogicaMetodos implements Metodos {

	private List<Casas> lista = new ArrayList<Casas>();

	@Override
	public void guardar(Casas casa) {
		// TODO Auto-generated method stub

		boolean bandera = false;
		for (Casas c : lista) {
			if (c.getNumeroCasa() == casa.getNumeroCasa()) {
				System.out.println("Ese Num. casa ya existe, no se puede guardar");
				bandera = true;
				break;
			}
		}
		if (bandera == false) {
			lista.add(casa);
			System.out.println("Se guardo el registro");
		}
			
	}

	@Override
	public List<Casas> mostrar() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Casas buscar(int indice) {
		// TODO Auto-generated method stub
		return lista.get(indice);
	}

	@Override
	public void editar(int idnice, Casas casa) {
		// TODO Auto-generated method stub
		lista.set(idnice, casa);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
	}

	@Override
	public Casas buscarXNumCasa(int numCasa) {
		// TODO Auto-generated method stub

		// Ciclo y condicion
		for (Casas c : lista) {
			if (c.getNumeroCasa() == numCasa) {
				return c;
			}
		}
		return null;
	}

	@Override
	public List<Casas> buscarXtipoCasa(String tipoCasa) {
		// TODO Auto-generated method stub

		List<Casas> listaNueva = new ArrayList<Casas>();

		for (Casas c : lista) {
			if (c.getTipoCasa().equals(tipoCasa)) {
				listaNueva.add(c);
			}
		}
		return listaNueva;
	}

	@Override
	public void eliminarXnumCasa(int numCasa) {
		// TODO Auto-generated method stub

		boolean bandera = false;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNumeroCasa() == numCasa) {
				lista.remove(i);
				bandera = true;
				System.out.println("Se elimino con exito");
				break; // Detiene por completo la iteracion
			}
		}

		if (bandera == false)
			System.out.println("Ese registro no existe");

	}

}
