import java.awt.Window;
import java.io.ObjectInputStream.GetField;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

@SuppressWarnings("unused")
public class conversor {

	public static void main(String[] args) {

		String[] opciones = { " ", "Conversor de moneda", "Conversor de temperatura" };

		String[] opcionesConversion = { "", "De pesos a dolar", "De pesos a euro", "De pesos a libras",
				"De pesos a yen", "De pesos a won coreano", "De dolar a pesos", "De euro a pesos", "De libras a pesos",
				"De yen a pesos", "De won coreano a pesos" };

		String opcionSeleccionado = (String) JOptionPane.showInputDialog(null, "seleccione una opcion",
				"Opciones de conversion", JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

		// si el usuario escuge la opcion vacia o nada
		if (opcionSeleccionado == " ") {

			JOptionPane.showMessageDialog(null, "Lo sentimos no escogiste una opcion valida");
			System.exit(0);
		}

		// si el usuario escoge la opcion conversor de temperatura
		if (opcionSeleccionado == "Conversor de temperatura") {

			JOptionPane.showMessageDialog(null, "Lo sentimos esta opcion aun no esta disponible");
			System.exit(0);
		}

		String opcionConversion = (String) JOptionPane.showInputDialog(null, "seleccione una opcion",
				"Opciones de conversion", JOptionPane.INFORMATION_MESSAGE, null, opcionesConversion,
				opcionesConversion[0]);

		// si el usuario escoje conversor de moneda y de pesos a dolar
		if (opcionSeleccionado == "Conversor de moneda" && opcionConversion == "De pesos a dolar") {

			while (true) {
				String monedaConvertir = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				try {
					double moneda = Double.parseDouble(monedaConvertir);

					operaciones pesosDolar = new operaciones(moneda);
					double conversion = pesosDolar.dolar(moneda);
					JOptionPane.showMessageDialog(null,
							"El valor es: " + String.format("%.3f", conversion) + " Dolares");
					JOptionPane.showMessageDialog(null, "Gracias hasta luego");
					System.exit(0);
					break;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor no válido, ingrese un número válido.");
				}

			}

			/*-------------------------termina la primera opcion del usuario---------------*/
		}

		// si el usuario escoje conversor de moneda y de pesos a euros
		if (opcionSeleccionado == "Conversor de moneda" && opcionConversion == "De pesos a euro") {

			while (true) {
				String monedaConvertir = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				try {
					double moneda = Double.parseDouble(monedaConvertir);

					operaciones pesosEuro = new operaciones(moneda);
					double conversion = pesosEuro.euro(moneda);
					JOptionPane.showMessageDialog(null, "El valor es: " + String.format("%.3f", conversion) + " Euros");
					JOptionPane.showMessageDialog(null, "Gracias hasta luego");
					System.exit(0);
					break;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor no válido, ingrese un número válido.");
				}
			}
		}

		// si el usuario escoje conversor de moneda y de pesos a libras
		if (opcionSeleccionado == "Conversor de moneda" && opcionConversion == "De pesos a libras") {

			while (true) {
				String monedaConvertir = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				try {
					double moneda = Double.parseDouble(monedaConvertir);

					operaciones pesosLibra = new operaciones(moneda);
					double conversion = pesosLibra.libras(moneda);
					JOptionPane.showMessageDialog(null,
							"El valor es: " + String.format("%.3f", conversion) + " Libras");
					JOptionPane.showMessageDialog(null, "Gracias hasta luego");
					System.exit(0);
					break;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor no válido, ingrese un número válido.");
				}
			}

		}

		// si el usuario escoje conversor de moneda y de pesos a Yen coreano
		if (opcionSeleccionado == "Conversor de moneda" && opcionConversion == "De pesos a yen") {

			while (true) {
				String monedaConvertir = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				try {
					double moneda = Double.parseDouble(monedaConvertir);

					operaciones pesosYen = new operaciones(moneda);
					double conversion = pesosYen.yen(moneda);
					JOptionPane.showMessageDialog(null,
							"El valor es: " + String.format("%.3f", conversion) + " Yen Japones");
					JOptionPane.showMessageDialog(null, "Gracias hasta luego");
					System.exit(0);
					break;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor no válido, ingrese un número válido.");
				}
			}

		}

		// si el usuario escoje conversor de moneda y de pesos a Yen coreano
		if (opcionSeleccionado == "Conversor de moneda" && opcionConversion == "De pesos a won coreano") {

			while (true) {
				String monedaConvertir = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				try {
					double moneda = Double.parseDouble(monedaConvertir);

					operaciones pesosWon = new operaciones(moneda);
					double conversion = pesosWon.won(moneda);
					JOptionPane.showMessageDialog(null,
							"El valor es: " + String.format("%.3f", conversion) + " Wones coreanos");
					JOptionPane.showMessageDialog(null, "Gracias hasta luego");
					System.exit(0);
					break;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor no válido, ingrese un número válido.");
				}
			}

		}

		// si el usuario escoje conversor de moneda y de De dolar a pesos
		if (opcionSeleccionado == "Conversor de moneda" && opcionConversion == "De dolar a pesos") {

			while (true) {
				String monedaConvertir = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				try {
					double moneda = Double.parseDouble(monedaConvertir);

					operaciones pesosDolar = new operaciones(moneda);
					double conversion = pesosDolar.pesosDolar(moneda);
					JOptionPane.showMessageDialog(null,
							"El valor es: " + String.format("%.3f", conversion) + " pesos colombianos");
					JOptionPane.showMessageDialog(null, "Gracias hasta luego");
					System.exit(0);
					break;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor no válido, ingrese un número válido.");
				}
			}

		}

		// si el usuario escoje conversor de moneda y de De euros a pesos
		if (opcionSeleccionado == "Conversor de moneda" && opcionConversion == "De euro a pesos") {

			while (true) {
				String monedaConvertir = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				try {
					double moneda = Double.parseDouble(monedaConvertir);

					operaciones eurosPesos = new operaciones(moneda);
					double conversion = eurosPesos.euroPesos(moneda);
					JOptionPane.showMessageDialog(null,
							"El valor es: " + String.format("%.3f", conversion) + " pesos colombianos");
					JOptionPane.showMessageDialog(null, "Gracias hasta luego");
					System.exit(0);
					break;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor no válido, ingrese un número válido.");
				}
			}

		}

	}

}
