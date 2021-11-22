package mainapp;

import java.util.ArrayList;
import java.util.Scanner;

import models.Persona;
import models.CuentaCorriente;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean seguir = true;

		// Variable contador
		int numIncr = 1;

		// Personas

		ArrayList<Persona> lasPersonas = new ArrayList<Persona>();

		// Menú principal
		while (seguir == true) {
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
				Persona contadorCuentas1 = new Persona(nombPers, apePers, dniPers, 1100,
						new CuentaCorriente(numIncr, 0, null));
				lasPersonas.add(contadorCuentas1);

				break;
			case "b":

				System.out.println("¿Qué persona elige?");
				int i = 1;
				for (Persona p : lasPersonas) {
					System.out.println(i + ". " + p);
					i++;
				}
				int persMenu = Integer.parseInt(sc.nextLine());
				Persona seleccionada = lasPersonas.get(persMenu - 1);

				System.out.println(
						"¿Qué acción desea realizar?\ni. Cobrar sueldo.\nii. Sacar pasta.\niii. Subir sueldo.\niv. Mostrar detalles de la persona.");
				String resp2 = sc.nextLine();
				switch (resp2) {
				case "i":
					seleccionada.cobrarSueldo();
					System.out.println(seleccionada.toString());
					break;
				case "ii":
					System.out.println("¿Cuanta pasta quiere sacar?");
					double sacar = Double.parseDouble(sc.nextLine());
					seleccionada.sacarPasta(sacar);
					System.out.println("Operación realizada con éxito.");
					System.out.println(seleccionada.toString());
					break;
				case "iii":
					System.out.println("¿Cuanta pasta quiere subir el sueldo?");
					double sueldo = Double.parseDouble(sc.nextLine());
					seleccionada.subirSueldo(sueldo);
					System.out.println("Operación realizada con éxito.");
					System.out.println(seleccionada.toString());
					break;
				case "iv":
					seleccionada.toString();
					break;
				}
				break;
			case "c":
				// delete-variable
				int k = 1;
				for (Persona p : lasPersonas) {
					System.out.println(k + ". " + p);
					k++;
				}
				int persBorrar = Integer.parseInt(sc.nextLine());
				Persona seleccionadaBorrar = lasPersonas.get(persMenu - 1);
				System.out.println("¿Qué persona desea borrar?");
				String persBorrar = sc.nextLine();
			

				break;
			case "d":
				System.exit(0);
				break;

			}

			System.out.println("¿Desea continuar operando?");
			String respBucle = sc.nextLine();
			if (respBucle.equals("si")) {
				seguir = true;
			} else if (respBucle.equals("no")) {
				seguir = false;
				System.out.println("Muchas gracias por usar nuestra app. Vuelva pronto.");
			} else {
				System.out.println("ERROR: ha introducido mal la respuesta.");
			}
		}
	}
}
