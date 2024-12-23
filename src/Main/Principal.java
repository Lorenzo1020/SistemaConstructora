package Main;

import java.util.Scanner;

import Dominio.Casas;
import Implementacion.LogicaMetodos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar las variables
		Scanner lectura = null;

		System.out.println("Se agrega esto nuevo al modulo principal");
		int numero1 = 0;

		int numeroCasa, menuPrinc, subMenu, indice;
		float precio;
		String tipoCasa;
		String dimensiones;

		Casas casa = null;

		// Instancia de clase
		LogicaMetodos imp = new LogicaMetodos();

		do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("1----ALTA");
			System.out.println("2---MOSTRAR");
			System.out.println("3---BUSCAR");
			System.out.println("4---EDITAR");
			System.out.println("5---ELIMINAR");
			System.out.println("6---BUSCAR POR NUM.CASA");
			System.out.println("7---BUSCAR POR TIPO");
			System.out.println("8---CALCULAR DINERO INVERTIDO");
			System.out.println("9----ELIMINAR POR NUM. CASA");
			System.out.println("10---EDITAR BUSCANDO POR NUM. CASA"); // PRECIO
			System.out.println("11----SALIR");

			lectura = new Scanner(System.in);
			menuPrinc = lectura.nextInt();

			switch (menuPrinc) {
			case 1:
				try {
					System.out.println("Ingresa el numero casa");
					lectura = new Scanner(System.in);
					numeroCasa = lectura.nextInt();

					System.out.println("Ingrese el precio");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();

					System.out.println("Ingrese el tipo de casa");
					lectura = new Scanner(System.in);
					tipoCasa = lectura.nextLine();

					System.out.println("Ingrese las dimensiones");
					lectura = new Scanner(System.in);
					dimensiones = lectura.nextLine();

					// Declarar el objeto con todos los atributos
					casa = new Casas(numeroCasa, precio, tipoCasa, dimensiones);

					// Agregar a la lista
					imp.guardar(casa);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al guardar " + e.getMessage());
				}
				break;
			case 2:

				// imp.mostrar(); me trae una lista

				if (imp.mostrar().size() > 0)
					System.out.println(imp.mostrar());
				else
					System.out.println("No hay registros en la lista");

				break;
			case 3:
				try {
					System.out.println("Ingresa el indice a buscar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// Buscar
					System.out.println(imp.buscar(indice));

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al buscar");
				}

				break;
			case 4:
				try {
					System.out.println("Ingresa el indice a editar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// Buscar
					casa = imp.buscar(indice);
					System.out.println("Se enocontro " + casa);

					// Editar---subMenu----numCasa, precio
					do {
						System.out.println("SUB MENU PARA EDITAR");
						System.out.println("1----NUM. CASA");
						System.out.println("2---PRECIO");
						System.out.println("3----REGRESAR M.P");
						lectura = new Scanner(System.in);
						subMenu = lectura.nextInt();

						switch (subMenu) {
						case 1:
							System.out.println("Ingresa el nuevo numero de casa");
							lectura = new Scanner(System.in);
							numeroCasa = lectura.nextInt();

							// Actualizacion
							casa.setNumeroCasa(numeroCasa);
							imp.editar(indice, casa);
							System.out.println("Se edito");
							break;
						case 2:
							System.out.println("Ingrese el nuevo precio");
							lectura = new Scanner(System.in);
							precio = lectura.nextFloat();

							// Actualizacion
							casa.setPrecio(precio);
							imp.editar(indice, casa);
							System.out.println("Se edito");
							break;
						case 3:
							break;
						}

					} while (subMenu < 3);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al buscar para editar");
				}
				break;
			case 5:
				try {
					System.out.println("Ingresa el indice a eliminar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// Eliminar
					imp.eliminar(indice);
					System.out.println("Se elimino");
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al eliminar");
				}
				break;
			case 6:
				try {
					System.out.println("Ingresa el Num. casa a buscar");
					lectura = new Scanner(System.in);
					numeroCasa = lectura.nextInt();

					// Buscar
					casa = imp.buscarXNumCasa(numeroCasa);
					if (casa == null) {
						System.out.println("No existe ese num. casa");
					} else
						System.out.println("Registro encontrado " + casa);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al buscar");
				}
				break;
			case 7:
				try {
					System.out.println("Ingrese el tipo casa a buscar");
					lectura = new Scanner(System.in);
					tipoCasa = lectura.nextLine();

					// Buscar
					System.out.println(imp.buscarXtipoCasa(tipoCasa));
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Erro al buscar");
				}
				break;
			case 8:
				break;
			case 9:
				try {
					System.out.println("Ingresa el num casa a eliminar");
					lectura = new Scanner(System.in);
					numeroCasa = lectura.nextInt();

					// Eliminar
					imp.eliminarXnumCasa(numeroCasa);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al eliminar");
				}
				break;
			case 10:
				break;
			case 11:
				break;
			}

		} while (menuPrinc < 11);

	}

}
