package mainapp;

import java.util.ArrayList;
import java.util.Scanner;

import models.CuentaCorriente;
import models.Persona;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Variable contador
		int contadorCuentas = 0;

		// Personas
		Persona p1 = new Persona("Francisco", "Hernández Pérez", "42878456H", 900, null);
		Persona p2 = new Persona("Juan", "Gómez Vélez", "42878456H", 1200, null);
		Persona p3 = new Persona("Antonio", "Sánchez Ontiveros", "42878456H", 1100, null);
		ArrayList<Persona> lasPersonas = new ArrayList<Persona>();

		lasPersonas.add(p1);
		lasPersonas.add(p2);
		lasPersonas.add(p3);

		// Menú principal
		System.out.print(
				"Gestor de personas.\na. Añadir persona.\nb. Elegir persona.\n\ti. Cobrar sueldo.\n\tii. Sacar pasta.\n\tiii. Subir sueldo.\n\tiv. Mostrar detalles de la persona.\nc. Borrar persona.\nd. Salir.");
		System.out.print("\nIntroduzca su opción: ");
		String resp = sc.nextLine();
		switch (resp) {
		case "a":
			System.out.print("Introduzca sus datos:\nNombre: ");
			String nombPers = sc.nextLine();
			System.out.print("\nApellidos: ");
			String apePers = sc.nextLine();
			System.out.print("\ndni: ");
			String dniPers = sc.nextLine();

			break;
		case "b":

			System.out.println("¿Qué persona elige?");
			System.out.println("1. " + p1.getDni() + " " + p1.getNombre() + "\n2. " + p2.getDni() + " " + p2.getNombre() + "\n3. "
					+ p3.getDni() + " " + p3.getNombre());
			String persMenu = sc.nextLine();

			switch (persMenu) {
			case "1":
				System.out.println(
						"¿Qué acción desea realizar?\ni. Cobrar sueldo.\nii. Sacar pasta.\niii. Subir sueldo.\niv. Mostrar detalles de la persona.");
				String resp2 = sc.nextLine();
				switch (resp2) {
				case "i":
					p1.cobrarSueldo();
					break;
				case "ii":
					p1.sacarPasta();
					break;
				case "iii":
					System.out.println("¿Cuanta pasta quiere subir el sueldo?");
					double sueldo = Double.parseDouble(sc.nextLine());
					p1.subirSueldo(sueldo);
					System.out.println("Operación realizada con éxito.");
					break;
				case "iv":
					p1.toString();
					break;
				}
				break;
			case "2":
				System.out.println("¿Qué acción desea realizar?");
				String resp3 = sc.nextLine();
				switch (resp3) {
				case "i":
					p2.cobrarSueldo();
					break;
				case "ii":
					p2.sacarPasta();
					break;
				case "iii":
					System.out.println("¿Cuanta pasta quiere subir el sueldo?");
					double sueldo = Double.parseDouble(sc.nextLine());
					p2.subirSueldo(sueldo);
					System.out.println("Operación realizada con éxito.");
					break;
				case "iv":
					p2.toString();
					break;
				}

			case "3":
				System.out.println("¿Qué acción desea realizar?");
				String resp4 = sc.nextLine();
				switch (resp4) {
				case "i":
					p3.cobrarSueldo();
					break;
				case "ii":
					p3.sacarPasta();
					break;
				case "iii":
					System.out.println("¿Cuanta pasta quiere subir el sueldo?");
					double sueldo = Double.parseDouble(sc.nextLine());
					p3.subirSueldo(sueldo);
					System.out.println("Operación realizada con éxito.");
					break;
				case "iv":
					p3.toString();
					break;
				}
			}

			break;

		case "c":
			// delete-variable
			break;
		case "d":
			System.exit(0);
			break;

		}

	}
}
